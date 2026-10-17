package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzed extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39963zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39964zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39963zza = zzcsVar;
        this.f39964zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39964zzb.f40044zzj)).getCurrentScreenName(this.f39963zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39963zza.zze(null);
    }
}
