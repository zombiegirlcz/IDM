package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzef extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39967zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f39968zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ boolean f39969zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzcs f39970zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzff f39971zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzef(zzff zzffVar, String str, String str2, boolean z, zzcs zzcsVar) {
        super(zzffVar, true);
        this.f39967zza = str;
        this.f39968zzb = str2;
        this.f39969zzc = z;
        this.f39970zzd = zzcsVar;
        this.f39971zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39971zze.f40044zzj)).getUserProperties(this.f39967zza, this.f39968zzb, this.f39969zzc, this.f39970zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.f39970zzd.zze(null);
    }
}
