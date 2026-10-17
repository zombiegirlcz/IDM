package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzek extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39982zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39983zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39982zza = zzcsVar;
        this.f39983zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39983zzb.f40044zzj)).getAppInstanceId(this.f39982zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39982zza.zze(null);
    }
}
