package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzem extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcs f39986zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ int f39987zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzff f39988zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzff zzffVar, zzcs zzcsVar, int i) {
        super(zzffVar, true);
        this.f39986zza = zzcsVar;
        this.f39987zzb = i;
        this.f39988zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39988zzc.f40044zzj)).getTestFlag(this.f39986zza, this.f39987zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39986zza.zze(null);
    }
}
