package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i, int i2, long j2, int i3, int i5, int i6, int i21) {
        zzmjVar.zzc(zzc(i, i2, j2, i3, i5, i6, i21), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i, int i2, long j2, int i3, int i5, int i6, int i21) {
        zzmjVar.zzc(zzc(i, i2, j2, i3, i5, i6, i21), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i, int i2, long j2, int i3, int i5, int i6, int i21) {
        return new zzmt(i, i2, i6, i3, i5, SystemClock.elapsedRealtime() - j2, i21);
    }
}
