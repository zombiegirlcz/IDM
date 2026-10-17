package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzep extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzev f39993zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39994zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzff zzffVar, zzev zzevVar) {
        super(zzffVar, true);
        this.f39993zza = zzevVar;
        this.f39994zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39994zzb.f40044zzj)).setEventInterceptor(this.f39993zza);
    }
}
