package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzew extends zzdd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.zzkc f40013zza;

    public zzew(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.f40013zza = zzkcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() {
        return System.identityHashCode(this.f40013zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(String str, String str2, Bundle bundle, long j2) {
        this.f40013zza.onEvent(str, str2, bundle, j2);
    }
}
