package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public final class HexDumpUtils {
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i, int i2, boolean z) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i2 <= 0 || i + i2 > length) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder(((i2 + 15) / 16) * (z ? 75 : 57));
        int i3 = i2;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i5 == 0) {
                if (i2 < 65536) {
                    sb6.append(String.format("%04X:", Integer.valueOf(i)));
                } else {
                    sb6.append(String.format("%08X:", Integer.valueOf(i)));
                }
                i6 = i;
            } else if (i5 == 8) {
                sb6.append(" -");
            }
            sb6.append(String.format(" %02X", Integer.valueOf(bArr[i] & UnsignedBytes.MAX_VALUE)));
            i3--;
            i5++;
            if (z && (i5 == 16 || i3 == 0)) {
                int i21 = 16 - i5;
                if (i21 > 0) {
                    for (int i22 = 0; i22 < i21; i22++) {
                        sb6.append("   ");
                    }
                }
                if (i21 >= 8) {
                    sb6.append("  ");
                }
                sb6.append("  ");
                for (int i32 = 0; i32 < i5; i32++) {
                    char c2 = (char) bArr[i6 + i32];
                    if (c2 < ' ' || c2 > '~') {
                        c2 = '.';
                    }
                    sb6.append(c2);
                }
            }
            if (i5 == 16 || i3 == 0) {
                sb6.append('\n');
                i5 = 0;
            }
            i++;
        }
        return sb6.toString();
    }
}
