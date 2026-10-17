package com.google.android.gms.internal.nearby;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzuw extends zzux {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static List zzb(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzuv(iArr, 0, length);
    }
}
