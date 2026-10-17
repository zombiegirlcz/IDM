package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzdw extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39950zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39951zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzff zzffVar, String str) {
        super(zzffVar, true);
        this.f39950zza = str;
        this.f39951zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39951zzb.f40044zzj)).beginAdUnitExposure(this.f39950zza, this.f40009zzi);
    }
}
