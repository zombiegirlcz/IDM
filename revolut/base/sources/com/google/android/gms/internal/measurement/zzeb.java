package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzeb extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39959zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39960zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39959zza = zzcsVar;
        this.f39960zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39960zzb.f40044zzj)).getCachedAppInstanceId(this.f39959zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39959zza.zze(null);
    }
}
