package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
final class zzpq implements zzqe {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzpv f47672zza;

    public zzpq(zzpv zzpvVar) {
        this.f47672zza = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzqe
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f47672zza.zzaX().zzq(new zzpp(this, str, str2, bundle));
            return;
        }
        zzpv zzpvVar = this.f47672zza;
        if (zzpvVar.zzn != null) {
            zzpvVar.zzn.zzaW().zze().zzb("AppId not known when logging event", str2);
        }
    }
}
