package com.youTransactor.uCube.rpc;

import com.youTransactor.uCube.Tools;

/* JADX INFO: loaded from: classes17.dex */
public class DukptIksnInfos {
    public static final int IDX_IDEK = 1;
    public static final int IDX_IPEK = 0;
    public static final int NB_DUKPT_KEYS = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f107629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f107631c;
    public final String[] d;
    public final String[] e;
    public final String[] f;

    public DukptIksnInfos() {
    }

    public String getKsi(int i) {
        return this.f107631c[i];
    }

    public DukptIksnInfos(byte[] bArr, String str) {
        this.f107629a = bArr;
        this.f107630b = str;
        this.f107631c = new String[2];
        this.d = new String[2];
        this.e = new String[2];
        this.f = new String[2];
        byte b4 = bArr[0];
        int i = 1;
        while (true) {
            byte[] bArr2 = this.f107629a;
            if (i >= bArr2.length) {
                return;
            }
            byte b5 = bArr2[i];
            if (b5 == -1) {
                int i2 = i + 1;
                b4 = i2 < bArr2.length - 1 ? bArr2[i2] : b4;
                i += 2;
            } else if (b5 == 0) {
                int byteLenFromBits = Tools.getByteLenFromBits(bArr2[i + 1]);
                int i3 = i + 2;
                int i5 = i3 * 2;
                i = i3 + byteLenFromBits;
                this.f107631c[b4] = this.f107630b.substring(i5, i * 2);
            } else if (b5 == 1) {
                int byteLenFromBits2 = Tools.getByteLenFromBits(bArr2[i + 1]);
                int i6 = i + 2;
                int i21 = i6 * 2;
                i = i6 + byteLenFromBits2;
                this.d[b4] = this.f107630b.substring(i21, i * 2);
            } else if (b5 == 2) {
                int byteLenFromBits3 = Tools.getByteLenFromBits(bArr2[i + 1]);
                int i22 = i + 2;
                int i32 = i22 * 2;
                i = i22 + byteLenFromBits3;
                this.e[b4] = this.f107630b.substring(i32, i * 2);
            } else if (b5 != 3) {
                i++;
            } else {
                int byteLenFromBits4 = Tools.getByteLenFromBits(bArr2[i + 1]);
                int i33 = i + 2;
                int i43 = i33 * 2;
                i = i33 + byteLenFromBits4;
                this.f[b4] = this.f107630b.substring(i43, i * 2);
            }
        }
    }
}
