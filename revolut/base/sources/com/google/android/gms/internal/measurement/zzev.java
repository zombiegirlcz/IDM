package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzev extends zzdd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.zzkb f40012zza;

    public zzev(com.google.android.gms.measurement.internal.zzkb zzkbVar) {
        this.f40012zza = zzkbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() {
        return System.identityHashCode(this.f40012zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(String str, String str2, Bundle bundle, long j2) {
        this.f40012zza.interceptEvent(str, str2, bundle, j2);
    }
}
