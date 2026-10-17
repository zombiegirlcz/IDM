package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzdo extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39928zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f39929zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzcs f39930zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzff f39931zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzff zzffVar, String str, String str2, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39928zza = str;
        this.f39929zzb = str2;
        this.f39930zzc = zzcsVar;
        this.f39931zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39931zzd.f40044zzj)).getConditionalUserProperties(this.f39928zza, this.f39929zzb, this.f39930zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39930zzc.zze(null);
    }
}
