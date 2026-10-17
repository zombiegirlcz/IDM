package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1iSDK extends FilterInputStream {
    private final int AFLogger;
    private final byte[] afInfoLog;
    private final int[] d;
    private final byte[][] e;
    private int force;
    private final int[] registerClient;
    private final byte[] unregisterClient;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f26037w;
    private static final byte[] values = AFj1hSDK.AFInAppEventType;
    private static final int[] valueOf = AFj1hSDK.AFKeystoreWrapper;
    private static final int[] AFInAppEventParameterName = AFj1hSDK.values;
    private static final int[] AFInAppEventType = AFj1hSDK.AFInAppEventParameterName;
    private static final int[] AFKeystoreWrapper = AFj1hSDK.valueOf;

    public AFj1iSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.d = new int[4];
        this.unregisterClient = new byte[16];
        this.afInfoLog = new byte[16];
        this.f26037w = Integer.MAX_VALUE;
        this.v = 16;
        this.force = 16;
        this.AFLogger = i;
        this.registerClient = AFj1hSDK.AFInAppEventParameterName(bArr, i);
        this.e = values(bArr2);
    }

    private void AFKeystoreWrapper(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.d;
        char c2 = 1;
        char c3 = 2;
        char c5 = '\b';
        char c6 = 3;
        int i = (bArr[0] << Ascii.CAN) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
        int[] iArr2 = this.registerClient;
        iArr[0] = i ^ iArr2[0];
        char c7 = 5;
        char c16 = 6;
        iArr[1] = ((((bArr[4] << Ascii.CAN) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr[6] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[7] & UnsignedBytes.MAX_VALUE)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & UnsignedBytes.MAX_VALUE) | (((bArr[8] << Ascii.CAN) | ((bArr[9] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8))) ^ iArr2[2];
        char c26 = 14;
        iArr[3] = (((((bArr[13] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[12] << Ascii.CAN)) | ((bArr[14] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[15] & UnsignedBytes.MAX_VALUE)) ^ iArr2[3];
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.AFLogger) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.d;
            char c28 = c2;
            byte[][] bArr3 = this.e;
            byte[] bArr4 = bArr3[0];
            int i5 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventParameterName;
            byte[] bArr5 = bArr3[c28];
            char c29 = c3;
            int i6 = i5 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFInAppEventType;
            byte[] bArr6 = bArr3[c29];
            char c33 = c6;
            int i21 = i6 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = AFKeystoreWrapper;
            byte[] bArr7 = bArr3[c33];
            char c39 = c5;
            int i22 = i21 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.registerClient;
            int i32 = i22 ^ iArr8[i3];
            char c47 = c26;
            char c56 = c7;
            int i33 = (((iArr3[iArr4[bArr4[c28]] >>> 24] ^ iArr5[(iArr4[bArr5[c28]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c28]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c28]] & 255]) ^ iArr8[i3 + 1];
            int i43 = (((iArr3[iArr4[bArr4[c29]] >>> 24] ^ iArr5[(iArr4[bArr5[c29]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c29]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c29]] & 255]) ^ iArr8[i3 + 2];
            int i59 = (((iArr3[iArr4[bArr4[c33]] >>> 24] ^ iArr5[(iArr4[bArr5[c33]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c33]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c33]] & 255]) ^ iArr8[i3 + 3];
            iArr4[0] = i32;
            iArr4[c28] = i33;
            iArr4[c29] = i43;
            iArr4[c33] = i59;
            i2++;
            i3 += 4;
            c2 = c28;
            c3 = c29;
            c6 = c33;
            c5 = c39;
            c7 = c56;
            c26 = c47;
            c16 = c16;
        }
        char c57 = c2;
        char c74 = c3;
        char c77 = c6;
        char c95 = c5;
        char c100 = c26;
        int[] iArr9 = this.registerClient;
        int i66 = iArr9[i3];
        byte[] bArr8 = values;
        int[] iArr10 = this.d;
        byte[][] bArr9 = this.e;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i66 >>> 24));
        byte[] bArr11 = bArr9[c57];
        bArr2[c57] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i66 >>> 16));
        byte[] bArr12 = bArr9[c74];
        bArr2[c74] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i66 >>> 8));
        byte[] bArr13 = bArr9[c77];
        bArr2[c77] = (byte) (i66 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i74 = iArr9[i3 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c57]] >>> 24] ^ (i74 >>> 24));
        bArr2[c7] = (byte) (bArr8[(iArr10[bArr11[c57]] >>> 16) & 255] ^ (i74 >>> 16));
        bArr2[c16] = (byte) (bArr8[(iArr10[bArr12[c57]] >>> 8) & 255] ^ (i74 >>> 8));
        bArr2[7] = (byte) (i74 ^ bArr8[iArr10[bArr13[c57]] & 255]);
        int i92 = iArr9[i3 + 2];
        bArr2[c95] = (byte) (bArr8[iArr10[bArr10[c74]] >>> 24] ^ (i92 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c74]] >>> 16) & 255] ^ (i92 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c74]] >>> 8) & 255] ^ (i92 >>> 8));
        bArr2[11] = (byte) (i92 ^ bArr8[iArr10[bArr13[c74]] & 255]);
        int i96 = iArr9[i3 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c77]] >>> 24] ^ (i96 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c77]] >>> 16) & 255] ^ (i96 >>> 16));
        bArr2[c100] = (byte) (bArr8[(iArr10[bArr12[c77]] >>> 8) & 255] ^ (i96 >>> 8));
        bArr2[15] = (byte) (i96 ^ bArr8[iArr10[bArr13[c77]] & 255]);
    }

    private static byte[][] values(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        values();
        return this.force - this.v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i = this.v;
        if (i >= this.force) {
            return -1;
        }
        byte[] bArr = this.afInfoLog;
        this.v = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i5 = i; i5 < i3; i5++) {
            values();
            int i6 = this.v;
            if (i6 >= this.force) {
                if (i5 == i) {
                    return -1;
                }
                return i2 - (i3 - i5);
            }
            byte[] bArr2 = this.afInfoLog;
            this.v = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i2;
    }

    private int values() throws IOException {
        if (this.f26037w == Integer.MAX_VALUE) {
            this.f26037w = ((FilterInputStream) this).in.read();
        }
        if (this.v == 16) {
            byte[] bArr = this.unregisterClient;
            int i = this.f26037w;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.unregisterClient, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 >= 16) {
                AFKeystoreWrapper(this.unregisterClient, this.afInfoLog);
                int i5 = ((FilterInputStream) this).in.read();
                this.f26037w = i5;
                this.v = 0;
                this.force = i5 < 0 ? 16 - (this.afInfoLog[15] & UnsignedBytes.MAX_VALUE) : 16;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.force;
    }
}
