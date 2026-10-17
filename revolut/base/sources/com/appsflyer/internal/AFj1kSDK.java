package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1kSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private AFj1pSDK AFKeystoreWrapper;
    private int[] AFLogger;
    private int d;
    private int e;
    private int registerClient;
    private int unregisterClient;
    private byte[] valueOf;
    private byte[] values;

    public AFj1kSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.unregisterClient = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i, 3), 16);
        this.AFInAppEventType = iMin;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.valueOf = bArr2;
        this.AFInAppEventParameterName = new byte[8];
        this.AFLogger = new int[2];
        this.d = 8;
        this.registerClient = 8;
        this.e = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFKeystoreWrapper = new AFj1pSDK(iArr, iMin, true, false);
    }

    private void valueOf() {
        if (this.e == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & UnsignedBytes.MAX_VALUE);
        int i2 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UnsignedBytes.MAX_VALUE);
        int i3 = this.AFInAppEventType;
        AFj1pSDK aFj1pSDK = this.AFKeystoreWrapper;
        AFj1lSDK.AFKeystoreWrapper(i, i2, false, i3, aFj1pSDK.values, aFj1pSDK.valueOf, this.AFLogger);
        int[] iArr = this.AFLogger;
        int i5 = iArr[0];
        int i6 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i5 >> 24);
        bArr3[1] = (byte) (i5 >> 16);
        bArr3[2] = (byte) (i5 >> 8);
        bArr3[3] = (byte) i5;
        bArr3[4] = (byte) (i6 >> 24);
        bArr3[5] = (byte) (i6 >> 16);
        bArr3[6] = (byte) (i6 >> 8);
        bArr3[7] = (byte) i6;
        if (this.e == 2) {
            for (int i21 = 0; i21 < 8; i21++) {
                byte[] bArr4 = this.values;
                bArr4[i21] = (byte) (bArr4[i21] ^ this.valueOf[i21]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.valueOf, 0, bArr5.length);
        }
    }

    private int values() throws IOException {
        if (this.unregisterClient == Integer.MAX_VALUE) {
            this.unregisterClient = ((FilterInputStream) this).in.read();
        }
        if (this.d == 8) {
            byte[] bArr = this.values;
            int i = this.unregisterClient;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.values, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            valueOf();
            int i5 = ((FilterInputStream) this).in.read();
            this.unregisterClient = i5;
            this.d = 0;
            this.registerClient = i5 < 0 ? 8 - (this.values[7] & UnsignedBytes.MAX_VALUE) : 8;
        }
        return this.registerClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        values();
        return this.registerClient - this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i = this.d;
        if (i >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.values;
        this.d = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
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
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i5 = i; i5 < i3; i5++) {
            values();
            int i6 = this.d;
            if (i6 >= this.registerClient) {
                if (i5 == i) {
                    return -1;
                }
                return i2 - (i3 - i5);
            }
            byte[] bArr2 = this.values;
            this.d = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i2;
    }
}
