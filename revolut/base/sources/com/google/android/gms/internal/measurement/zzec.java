package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzec extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39961zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39962zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39961zza = zzcsVar;
        this.f39962zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39962zzb.f40044zzj)).generateEventId(this.f39961zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39961zza.zze(null);
    }
}
