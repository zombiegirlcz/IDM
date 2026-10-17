package com.youTransactor.uCube.rpc;

import com.youTransactor.uCube.Tools;
import defpackage.r0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class RPCMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f107645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f107646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f107647c;
    public final short d;
    public final byte[] e;
    public final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f107648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f107649h;
    public short i;

    public RPCMessage(byte[] bArr, boolean z, SecurityMode securityMode) {
        this.f107649h = new byte[bArr.length];
        this.f107649h = Arrays.copyOfRange(bArr, 0, bArr.length);
        if (!z) {
            this.f = null;
            this.f107647c = (byte) 0;
            this.f107648g = null;
            a(bArr);
            this.d = Tools.makeShort(bArr[6], bArr[7]);
            int i = this.i;
            if (i > 0) {
                this.e = new byte[i];
                this.e = Arrays.copyOfRange(bArr, 8, i + 8);
                return;
            }
            return;
        }
        int i2 = r0.f250667a[securityMode.ordinal()];
        if (i2 == 1) {
            this.f = null;
            this.f107647c = (byte) 0;
            this.f107648g = null;
            a(bArr);
            this.d = Tools.makeShort(bArr[6], bArr[7]);
            int i3 = this.i;
            if (i3 > 0) {
                this.e = new byte[i3];
                this.e = Arrays.copyOfRange(bArr, 8, i3 + 8);
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.f107648g = null;
            a(bArr);
            if (this.i == 0) {
                this.d = Tools.makeShort(bArr[6], bArr[7]);
                this.f107647c = (byte) 0;
                this.f = null;
                this.e = null;
                return;
            }
            this.f107647c = bArr[6];
            this.d = Tools.makeShort(bArr[7], bArr[8]);
            short s2 = this.i;
            if (s2 > 5) {
                this.e = new byte[s2 - 5];
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, s2 + 4);
                this.e = bArrCopyOfRange;
                int length = bArrCopyOfRange.length;
                this.f = new byte[4];
                this.f = Arrays.copyOfRange(bArr, length + 9, length + 13);
                return;
            }
            return;
        }
        if (i2 != 3) {
            return;
        }
        this.e = Arrays.copyOfRange(bArr, 0, bArr.length);
        this.f107647c = (byte) 0;
        this.f = null;
        a(bArr);
        if (this.i == 0) {
            this.d = Tools.makeShort(bArr[6], bArr[7]);
            this.f107647c = (byte) 0;
            this.f = null;
            this.f107648g = null;
            return;
        }
        this.f107647c = bArr[6];
        this.d = Tools.makeShort(bArr[7], bArr[8]);
        short s3 = this.i;
        if (s3 > 5) {
            this.f107648g = new byte[s3 - 5];
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 9, s3 + 4);
            this.f107648g = bArrCopyOfRange2;
            int length2 = bArrCopyOfRange2.length;
            this.f = new byte[4];
            this.f = Arrays.copyOfRange(bArr, length2 + 9, length2 + 13);
        }
    }

    public final void a(byte[] bArr) {
        this.i = (short) (Tools.makeShort(bArr[1], bArr[2]) - 2);
        this.f107645a = bArr[3];
        this.f107646b = Tools.makeShort(bArr[4], bArr[5]);
    }

    public byte[] getBuffer() {
        return this.f107649h;
    }

    public short getCommandId() {
        return this.f107646b;
    }

    public byte getCryptoHeader() {
        return this.f107647c;
    }

    public byte[] getData() {
        return this.e;
    }

    public byte[] getDataCiphered() {
        return this.f107648g;
    }

    public byte[] getDataMac() {
        return this.f;
    }

    public byte getSequenceNumber() {
        return this.f107645a;
    }

    public short getStatus() {
        return this.d;
    }
}
