package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1jSDK extends FilterInputStream {
    private static final short AFInAppEventParameterName = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;
    private int d;
    private int e;
    private int force;
    private int i;
    private int registerClient;
    private int unregisterClient;
    private int valueOf;
    private byte[] values;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f26038w;

    public AFj1jSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.d = Integer.MAX_VALUE;
        this.values = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.AFInAppEventType = new byte[8];
        this.valueOf = 8;
        this.unregisterClient = 8;
        this.e = Math.min(Math.max(i2, 5), 16);
        this.registerClient = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j2 = ((((long) iArr[0]) & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & ((long) iArr[1]));
        if (i != 0) {
            int i5 = (int) j2;
            this.AFLogger = i5;
            this.f26038w = i5 * i;
            this.i = i5 ^ i;
            this.force = (int) (j2 >> 32);
            return;
        }
        this.AFLogger = (int) j2;
        long j3 = j2 >> 3;
        short s2 = AFInAppEventParameterName;
        this.f26038w = (int) ((((long) s2) * j3) >> 32);
        this.i = (int) (j2 >> 32);
        this.force = (int) (j3 + ((long) s2));
    }

    private int AFInAppEventType() throws IOException {
        if (this.d == Integer.MAX_VALUE) {
            this.d = ((FilterInputStream) this).in.read();
        }
        if (this.valueOf == 8) {
            byte[] bArr = this.values;
            int i = this.d;
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
            AFKeystoreWrapper();
            int i5 = ((FilterInputStream) this).in.read();
            this.d = i5;
            this.valueOf = 0;
            this.unregisterClient = i5 < 0 ? 8 - (this.values[7] & UnsignedBytes.MAX_VALUE) : 8;
        }
        return this.unregisterClient;
    }

    private void AFKeystoreWrapper() {
        if (this.registerClient == 3) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventType, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        boolean z = true;
        char c2 = 2;
        int iA = ((bArr2[0] << Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & UnsignedBytes.MAX_VALUE);
        int iA2 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UnsignedBytes.MAX_VALUE);
        int i = 0;
        while (true) {
            int i2 = this.e;
            if (i >= i2) {
                break;
            }
            short s2 = AFInAppEventParameterName;
            iA2 -= (v0.a.a(i2, i, s2, iA) ^ ((iA << 4) + this.i)) ^ ((iA >>> 5) + this.force);
            iA -= (v0.a.a(i2, i, s2, iA2) ^ ((iA2 << 4) + this.AFLogger)) ^ ((iA2 >>> 5) + this.f26038w);
            i++;
            c2 = c2;
            z = z;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (iA >> 24);
        bArr3[z ? 1 : 0] = (byte) (iA >> 16);
        bArr3[c2] = (byte) (iA >> 8);
        bArr3[3] = (byte) iA;
        bArr3[4] = (byte) (iA2 >> 24);
        bArr3[5] = (byte) (iA2 >> 16);
        bArr3[6] = (byte) (iA2 >> 8);
        bArr3[7] = (byte) iA2;
        if (this.registerClient == 3) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.values;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.AFKeystoreWrapper[i3]);
            }
            byte[] bArr5 = this.AFInAppEventType;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.unregisterClient - this.valueOf;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.valueOf;
        if (i >= this.unregisterClient) {
            return -1;
        }
        byte[] bArr = this.values;
        this.valueOf = i + 1;
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
            AFInAppEventType();
            int i6 = this.valueOf;
            if (i6 >= this.unregisterClient) {
                if (i5 == i) {
                    return -1;
                }
                return i2 - (i3 - i5);
            }
            byte[] bArr2 = this.values;
            this.valueOf = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i2;
    }
}
