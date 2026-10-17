package net.sf.scuba.smartcards;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes14.dex */
public class CardFileInputStream extends InputStream {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba");
    private final byte[] buffer;
    private int bufferLength;
    private int fileLength;

    /* JADX INFO: renamed from: fs, reason: collision with root package name */
    private FileSystemStructured f214649fs;
    private int markedOffset;
    private int offsetBufferInFile;
    private int offsetInBuffer;
    private FileInfo[] path;

    public CardFileInputStream(int i, FileSystemStructured fileSystemStructured) throws CardServiceException {
        this.f214649fs = fileSystemStructured;
        synchronized (fileSystemStructured) {
            try {
                FileInfo[] selectedPath = fileSystemStructured.getSelectedPath();
                if (selectedPath == null || selectedPath.length < 1) {
                    throw new CardServiceException("No valid file selected, path = " + Arrays.toString(selectedPath));
                }
                FileInfo[] fileInfoArr = new FileInfo[selectedPath.length];
                this.path = fileInfoArr;
                System.arraycopy(selectedPath, 0, fileInfoArr, 0, selectedPath.length);
                this.fileLength = selectedPath[selectedPath.length - 1].getFileLength();
                this.buffer = new byte[i];
                this.bufferLength = 0;
                this.offsetBufferInFile = 0;
                this.offsetInBuffer = 0;
                this.markedOffset = -1;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private int fillBufferFromFile(FileInfo[] fileInfoArr, int i, int i2) throws CardServiceException {
        synchronized (this.f214649fs) {
            try {
                if (i2 > this.buffer.length) {
                    throw new IllegalArgumentException("length too big");
                }
                if (!Arrays.equals(this.f214649fs.getSelectedPath(), fileInfoArr)) {
                    for (FileInfo fileInfo : fileInfoArr) {
                        this.f214649fs.selectFile(fileInfo.getFID());
                    }
                }
                byte[] binary = this.f214649fs.readBinary(i, i2);
                if (binary == null) {
                    return 0;
                }
                System.arraycopy(binary, 0, this.buffer, 0, binary.length);
                return binary.length;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.bufferLength - this.offsetInBuffer;
    }

    public int getLength() {
        return this.fileLength;
    }

    public int getPostion() {
        return this.offsetBufferInFile + this.offsetInBuffer;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this.f214649fs) {
            this.markedOffset = this.offsetBufferInFile + this.offsetInBuffer;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        synchronized (this.f214649fs) {
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0026, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0018, B:14:0x002a, B:17:0x0034, B:19:0x0036, B:21:0x003a, B:22:0x0042, B:24:0x004a, B:29:0x0055, B:31:0x005c, B:32:0x0063, B:33:0x0064, B:34:0x006b, B:35:0x006c, B:36:0x0078, B:38:0x007a, B:39:0x0081), top: B:42:0x0003, inners: #2, #4 }] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() throws java.io.IOException {
        /*
            r7 = this;
            net.sf.scuba.smartcards.FileSystemStructured r0 = r7.f214649fs
            monitor-enter(r0)
            net.sf.scuba.smartcards.FileInfo[] r1 = r7.path     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            net.sf.scuba.smartcards.FileSystemStructured r2 = r7.f214649fs     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            net.sf.scuba.smartcards.FileInfo[] r2 = r2.getSelectedPath()     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            boolean r1 = java.util.Arrays.equals(r1, r2)     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            r2 = 0
            if (r1 != 0) goto L2a
            net.sf.scuba.smartcards.FileInfo[] r1 = r7.path     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            int r3 = r1.length     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            r4 = r2
        L16:
            if (r4 >= r3) goto L2a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            net.sf.scuba.smartcards.FileSystemStructured r6 = r7.f214649fs     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            short r5 = r5.getFID()     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            r6.selectFile(r5)     // Catch: java.lang.Throwable -> L26 net.sf.scuba.smartcards.CardServiceException -> L28
            int r4 = r4 + 1
            goto L16
        L26:
            r1 = move-exception
            goto L82
        L28:
            r1 = move-exception
            goto L7a
        L2a:
            int r1 = r7.offsetBufferInFile     // Catch: java.lang.Throwable -> L26
            int r3 = r7.offsetInBuffer     // Catch: java.lang.Throwable -> L26
            int r1 = r1 + r3
            int r4 = r7.fileLength     // Catch: java.lang.Throwable -> L26
            if (r1 < r4) goto L36
            r1 = -1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L36:
            int r5 = r7.bufferLength     // Catch: java.lang.Throwable -> L26
            if (r3 < r5) goto L6c
            byte[] r3 = r7.buffer     // Catch: java.lang.Throwable -> L26
            int r3 = r3.length     // Catch: java.lang.Throwable -> L26
            int r4 = r4 - r1
            int r1 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L26
            int r3 = r7.offsetBufferInFile     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            int r4 = r7.bufferLength     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            int r3 = r3 + r4
            r4 = r2
        L48:
            if (r4 != 0) goto L55
            net.sf.scuba.smartcards.FileInfo[] r4 = r7.path     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            int r4 = r7.fillBufferFromFile(r4, r3, r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            goto L48
        L51:
            r1 = move-exception
            goto L5c
        L53:
            r1 = move-exception
            goto L64
        L55:
            r7.offsetBufferInFile = r3     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            r7.offsetInBuffer = r2     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            r7.bufferLength = r4     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L51 net.sf.scuba.smartcards.CardServiceException -> L53
            goto L6c
        L5c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Unexpected exception"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L64:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Unexpected exception"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L6c:
            byte[] r1 = r7.buffer     // Catch: java.lang.Throwable -> L26
            int r2 = r7.offsetInBuffer     // Catch: java.lang.Throwable -> L26
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L26
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r7.offsetInBuffer = r2     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L7a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Unexpected exception"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sf.scuba.smartcards.CardFileInputStream.read():int");
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        synchronized (this.f214649fs) {
            try {
                int i = this.markedOffset;
                if (i < 0) {
                    throw new IOException("Mark not set");
                }
                this.offsetBufferInFile = i;
                this.offsetInBuffer = 0;
                this.bufferLength = 0;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        synchronized (this.f214649fs) {
            try {
                int i = this.bufferLength;
                int i2 = this.offsetInBuffer;
                if (j2 < i - i2) {
                    this.offsetInBuffer = (int) (((long) i2) + j2);
                } else {
                    this.offsetBufferInFile = (int) (((long) (this.offsetBufferInFile + i2)) + j2);
                    this.offsetInBuffer = 0;
                    this.bufferLength = 0;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return j2;
    }
}
