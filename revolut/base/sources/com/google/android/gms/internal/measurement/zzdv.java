package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzdv extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f39948zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39949zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzff zzffVar, long j2) {
        super(zzffVar, true);
        this.f39948zza = j2;
        this.f39949zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39949zzb.f40044zzj)).setSessionTimeoutDuration(this.f39948zza);
    }
}
