package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzdn extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39924zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f39925zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ Bundle f39926zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzff f39927zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzff zzffVar, String str, String str2, Bundle bundle) {
        super(zzffVar, true);
        this.f39924zza = str;
        this.f39925zzb = str2;
        this.f39926zzc = bundle;
        this.f39927zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39927zzd.f40044zzj)).clearConditionalUserProperty(this.f39924zza, this.f39925zzb, this.f39926zzc);
    }
}
