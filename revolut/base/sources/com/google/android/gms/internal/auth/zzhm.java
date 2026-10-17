package com.google.android.gms.internal.auth;

import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes16.dex */
final class zzhm extends zzhl {
    @Override // com.google.android.gms.internal.auth.zzhl
    public final int zza(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                i2 = i5;
            } else {
                if (b4 < -32) {
                    if (i5 >= i3) {
                        return b4;
                    }
                    if (b4 >= -62) {
                        i2 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b4 >= -16) {
                    if (i5 >= i3 - 2) {
                        return zzhn.zza(bArr, i5, i3);
                    }
                    int i6 = i2 + 2;
                    byte b5 = bArr[i5];
                    if (b5 <= -65) {
                        if ((((b5 + ISO7816.INS_MANAGE_CHANNEL) + (b4 << 28)) >> 30) == 0) {
                            int i21 = i2 + 3;
                            if (bArr[i6] <= -65) {
                                i2 += 4;
                                if (bArr[i21] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i5 >= i3 - 1) {
                    return zzhn.zza(bArr, i5, i3);
                }
                int i22 = i2 + 2;
                byte b7 = bArr[i5];
                if (b7 > -65 || (b4 == -32 && b7 < -96)) {
                    return -1;
                }
                if (b4 == -19 && b7 >= -96) {
                    return -1;
                }
                i2 += 3;
                if (bArr[i22] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
