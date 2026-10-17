package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzdr extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Boolean f39938zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39939zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzff zzffVar, Boolean bool) {
        super(zzffVar, true);
        this.f39938zza = bool;
        this.f39939zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39939zzb.f40044zzj)).setMeasurementEnabled(this.f39938zza.booleanValue(), this.f40008zzh);
    }
}
