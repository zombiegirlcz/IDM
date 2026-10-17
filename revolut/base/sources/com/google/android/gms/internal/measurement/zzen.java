package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzen extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ boolean f39989zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39990zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzff zzffVar, boolean z) {
        super(zzffVar, true);
        this.f39989zza = z;
        this.f39990zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39990zzb.f40044zzj)).setDataCollectionEnabled(this.f39989zza);
    }
}
