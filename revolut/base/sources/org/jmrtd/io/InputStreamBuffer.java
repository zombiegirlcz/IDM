package org.jmrtd.io;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import org.jmrtd.io.FragmentBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class InputStreamBuffer {
    private FragmentBuffer buffer;
    private PositionInputStream carrier;

    public InputStreamBuffer(InputStream inputStream, int i) {
        PositionInputStream positionInputStream = new PositionInputStream(inputStream);
        this.carrier = positionInputStream;
        positionInputStream.mark(i);
        this.buffer = new FragmentBuffer(i);
    }

    public synchronized int getBytesBuffered() {
        return this.buffer.getBytesBuffered();
    }

    public SubInputStream getInputStream() {
        SubInputStream subInputStream;
        synchronized (this.carrier) {
            subInputStream = new SubInputStream(this.carrier);
        }
        return subInputStream;
    }

    public int getLength() {
        return this.buffer.getLength();
    }

    public synchronized int getPosition() {
        return this.buffer.getPosition();
    }

    public String toString() {
        return "InputStreamBuffer [" + this.buffer + "]";
    }

    public void updateFrom(InputStreamBuffer inputStreamBuffer) {
        this.buffer.updateFrom(inputStreamBuffer.buffer);
    }

    public class SubInputStream extends InputStream {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Object syncObject;
        private int position = 0;
        private int markedPosition = -1;

        public SubInputStream(Object obj2) {
            this.syncObject = obj2;
        }

        private void syncCarrierPosition(int i) throws IOException {
            long j2 = i;
            if (j2 == InputStreamBuffer.this.carrier.getPosition()) {
                return;
            }
            InputStreamBuffer.this.carrier.reset();
            int iSkip = 0;
            while (iSkip < i) {
                long j3 = iSkip;
                iSkip = (int) (InputStreamBuffer.this.carrier.skip(j2 - j3) + j3);
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return InputStreamBuffer.this.buffer.getBufferedLength(this.position);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public FragmentBuffer getBuffer() {
            return InputStreamBuffer.this.buffer;
        }

        public int getPosition() {
            return this.position;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.markedPosition = this.position;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            synchronized (this.syncObject) {
                try {
                    if (this.position >= InputStreamBuffer.this.buffer.getLength()) {
                        return -1;
                    }
                    if (InputStreamBuffer.this.buffer.isCoveredByFragment(this.position)) {
                        byte[] buffer = InputStreamBuffer.this.buffer.getBuffer();
                        int i = this.position;
                        this.position = i + 1;
                        return buffer[i] & UnsignedBytes.MAX_VALUE;
                    }
                    if (InputStreamBuffer.this.carrier.markSupported()) {
                        syncCarrierPosition(this.position);
                    }
                    try {
                        int i2 = InputStreamBuffer.this.carrier.read();
                        if (i2 < 0) {
                            return -1;
                        }
                        FragmentBuffer fragmentBuffer = InputStreamBuffer.this.buffer;
                        int i3 = this.position;
                        this.position = i3 + 1;
                        fragmentBuffer.addFragment(i3, (byte) i2);
                        return i2;
                    } catch (IOException e) {
                        throw e;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.markedPosition;
            if (i < 0) {
                throw new IOException("Invalid reset, was mark() called?");
            }
            this.position = i;
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            long jSkip;
            synchronized (this.syncObject) {
                try {
                    int bufferedLength = InputStreamBuffer.this.buffer.getBufferedLength(this.position);
                    long j3 = bufferedLength;
                    if (j2 <= j3) {
                        this.position = (int) (((long) this.position) + j2);
                        return j2;
                    }
                    this.position += bufferedLength;
                    if (InputStreamBuffer.this.carrier.markSupported()) {
                        syncCarrierPosition(this.position);
                        jSkip = InputStreamBuffer.this.carrier.skip(j2 - j3);
                        this.position += (int) jSkip;
                    } else {
                        jSkip = super.skip(j2 - j3);
                    }
                    return j3 + jSkip;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int i;
            synchronized (this.syncObject) {
                i = read(bArr, 0, bArr.length);
            }
            return i;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            synchronized (this.syncObject) {
                try {
                    if (bArr != null) {
                        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                            throw new IndexOutOfBoundsException();
                        }
                        if (i2 == 0) {
                            return 0;
                        }
                        if (i2 > InputStreamBuffer.this.buffer.getLength() - this.position) {
                            i2 = InputStreamBuffer.this.buffer.getLength() - this.position;
                        }
                        if (this.position >= InputStreamBuffer.this.buffer.getLength()) {
                            return -1;
                        }
                        if (InputStreamBuffer.this.carrier.markSupported()) {
                            syncCarrierPosition(this.position);
                        }
                        FragmentBuffer.Fragment smallestUnbufferedFragment = InputStreamBuffer.this.buffer.getSmallestUnbufferedFragment(this.position, i2);
                        if (smallestUnbufferedFragment.getLength() > 0) {
                            int offset = smallestUnbufferedFragment.getOffset() - this.position;
                            int length = smallestUnbufferedFragment.getLength();
                            System.arraycopy(InputStreamBuffer.this.buffer.getBuffer(), this.position, bArr, i, offset);
                            this.position += offset;
                            if (InputStreamBuffer.this.carrier.markSupported()) {
                                syncCarrierPosition(this.position);
                            }
                            int i3 = i + offset;
                            int i5 = InputStreamBuffer.this.carrier.read(bArr, i3, length);
                            InputStreamBuffer.this.buffer.addFragment(smallestUnbufferedFragment.getOffset(), bArr, i3, i5);
                            this.position += i5;
                            return offset + i5;
                        }
                        int iMin = Math.min(i2, InputStreamBuffer.this.buffer.getLength() - this.position);
                        System.arraycopy(InputStreamBuffer.this.buffer.getBuffer(), this.position, bArr, i, iMin);
                        this.position += iMin;
                        return iMin;
                    }
                    throw new NullPointerException();
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }
}
