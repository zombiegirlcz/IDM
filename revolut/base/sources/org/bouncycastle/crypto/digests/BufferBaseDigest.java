package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
abstract class BufferBaseDigest implements ExtendedDigest {
    protected int BlockSize;
    protected int DigestSize;
    protected String algorithmName;
    protected byte[] m_buf;
    protected int m_bufPos;
    protected ProcessingBuffer processor;

    public class BufferedProcessor implements ProcessingBuffer {
        private BufferedProcessor() {
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i, int i2) {
            return i > i2;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i, int i2) {
            return i <= i2;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public void update(byte b4) {
            BufferBaseDigest bufferBaseDigest = BufferBaseDigest.this;
            if (bufferBaseDigest.m_bufPos == bufferBaseDigest.BlockSize) {
                bufferBaseDigest.processBytes(bufferBaseDigest.m_buf, 0);
                BufferBaseDigest.this.m_bufPos = 0;
            }
            BufferBaseDigest bufferBaseDigest2 = BufferBaseDigest.this;
            byte[] bArr = bufferBaseDigest2.m_buf;
            int i = bufferBaseDigest2.m_bufPos;
            bufferBaseDigest2.m_bufPos = i + 1;
            bArr[i] = b4;
        }
    }

    public class ImmediateProcessor implements ProcessingBuffer {
        private ImmediateProcessor() {
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i, int i2) {
            return i >= i2;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i, int i2) {
            return i < i2;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public void update(byte b4) {
            BufferBaseDigest bufferBaseDigest = BufferBaseDigest.this;
            byte[] bArr = bufferBaseDigest.m_buf;
            int i = bufferBaseDigest.m_bufPos;
            bArr[i] = b4;
            int i2 = i + 1;
            bufferBaseDigest.m_bufPos = i2;
            if (i2 == bufferBaseDigest.BlockSize) {
                bufferBaseDigest.processBytes(bArr, 0);
                BufferBaseDigest.this.m_bufPos = 0;
            }
        }
    }

    public interface ProcessingBuffer {
        boolean isLengthExceedingBlockSize(int i, int i2);

        boolean isLengthWithinAvailableSpace(int i, int i2);

        void update(byte b4);
    }

    public static class ProcessingBufferType {
        public static final int BUFFERED = 0;
        public static final int IMMEDIATE = 1;
        private final int ord;
        public static final ProcessingBufferType Buffered = new ProcessingBufferType(0);
        public static final ProcessingBufferType Immediate = new ProcessingBufferType(1);

        public ProcessingBufferType(int i) {
            this.ord = i;
        }
    }

    public BufferBaseDigest(ProcessingBufferType processingBufferType, int i) {
        ProcessingBuffer bufferedProcessor;
        this.BlockSize = i;
        this.m_buf = new byte[i];
        int i2 = processingBufferType.ord;
        if (i2 == 0) {
            bufferedProcessor = new BufferedProcessor();
        } else if (i2 != 1) {
            return;
        } else {
            bufferedProcessor = new ImmediateProcessor();
        }
        this.processor = bufferedProcessor;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        ensureSufficientOutputBuffer(bArr, i);
        finish(bArr, i);
        reset();
        return this.DigestSize;
    }

    public void ensureSufficientInputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
    }

    public void ensureSufficientOutputBuffer(byte[] bArr, int i) {
        if (this.DigestSize + i > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
    }

    public abstract void finish(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.BlockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.DigestSize;
    }

    public abstract void processBytes(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        this.processor.update(b4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        ensureSufficientInputBuffer(bArr, i, i2);
        int i3 = this.BlockSize - this.m_bufPos;
        if (this.processor.isLengthWithinAvailableSpace(i2, i3)) {
            System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, i2);
            this.m_bufPos += i2;
            return;
        }
        int i5 = this.m_bufPos;
        if (i5 > 0) {
            System.arraycopy(bArr, i, this.m_buf, i5, i3);
            i += i3;
            i2 -= i3;
            processBytes(this.m_buf, 0);
        }
        while (this.processor.isLengthExceedingBlockSize(i2, this.BlockSize)) {
            processBytes(bArr, i);
            int i6 = this.BlockSize;
            i += i6;
            i2 -= i6;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
    }
}
