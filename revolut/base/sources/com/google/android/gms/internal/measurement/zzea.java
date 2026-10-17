package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzea extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39957zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39958zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39957zza = zzcsVar;
        this.f39958zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39958zzb.f40044zzj)).getGmpAppId(this.f39957zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39957zza.zze(null);
    }
}
