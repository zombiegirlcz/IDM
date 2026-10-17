package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzdz extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Runnable f39955zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39956zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzff zzffVar, Runnable runnable) {
        super(zzffVar, true);
        this.f39955zza = runnable;
        this.f39956zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39956zzb.f40044zzj)).retrieveAndUploadBatches(new zzdy(this, this.f39955zza));
    }
}
