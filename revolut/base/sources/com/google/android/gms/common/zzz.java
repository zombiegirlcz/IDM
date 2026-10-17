package com.google.android.gms.common;

/* JADX INFO: loaded from: classes16.dex */
final class zzz {
    public static int zza(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i5 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i5 == i) {
                return i3;
            }
        }
        return 1;
    }
}
