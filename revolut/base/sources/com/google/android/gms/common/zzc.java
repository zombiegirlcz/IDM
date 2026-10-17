package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
public final class zzc {
    public static int zza(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
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
