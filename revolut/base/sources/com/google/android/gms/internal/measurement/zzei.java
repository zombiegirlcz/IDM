package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzei extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Bundle f39976zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzcs f39977zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzff f39978zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzff zzffVar, Bundle bundle, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39976zza = bundle;
        this.f39977zzb = zzcsVar;
        this.f39978zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39978zzc.f40044zzj)).performAction(this.f39976zza, this.f39977zzb, this.f40008zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39977zzb.zze(null);
    }
}
