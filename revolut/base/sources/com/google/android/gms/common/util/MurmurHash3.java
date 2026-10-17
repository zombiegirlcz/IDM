package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i, int i2, int i3) {
        int i5;
        int i6 = i;
        while (true) {
            i5 = (i2 & (-4)) + i;
            if (i6 >= i5) {
                break;
            }
            int i21 = ((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | (bArr[i6 + 3] << 24)) * (-862048943);
            int i22 = i3 ^ (((i21 >>> 17) | (i21 << 15)) * 461845907);
            i3 = (((i22 >>> 19) | (i22 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i32 = i2 & 3;
        if (i32 == 1) {
            int i33 = ((bArr[i5] & 255) | i) * (-862048943);
            i3 ^= ((i33 >>> 17) | (i33 << 15)) * 461845907;
        } else {
            if (i32 != 2) {
                i = i32 == 3 ? (bArr[i5 + 2] & 255) << 16 : 0;
            }
            i |= (bArr[i5 + 1] & 255) << 8;
            int i332 = ((bArr[i5] & 255) | i) * (-862048943);
            i3 ^= ((i332 >>> 17) | (i332 << 15)) * 461845907;
        }
        int i43 = i3 ^ i2;
        int i59 = (i43 ^ (i43 >>> 16)) * (-2048144789);
        int i66 = (i59 ^ (i59 >>> 13)) * (-1028477387);
        return i66 ^ (i66 >>> 16);
    }
}
