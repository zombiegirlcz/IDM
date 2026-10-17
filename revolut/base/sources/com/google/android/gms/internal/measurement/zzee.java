package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzee extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39965zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39966zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39965zza = zzcsVar;
        this.f39966zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39966zzb.f40044zzj)).getCurrentScreenClass(this.f39965zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39965zza.zze(null);
    }
}
