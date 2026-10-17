package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzel extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39984zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39985zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39984zza = zzcsVar;
        this.f39985zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39985zzb.f40044zzj)).getSessionId(this.f39984zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39984zza.zze(null);
    }
}
