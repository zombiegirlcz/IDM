package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzet extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Long f40001zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f40002zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f40003zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ Bundle f40004zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ boolean f40005zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ boolean f40006zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    final /* synthetic */ zzff f40007zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzff zzffVar, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z3) {
        super(zzffVar, true);
        this.f40001zza = l2;
        this.f40002zzb = str;
        this.f40003zzc = str2;
        this.f40004zzd = bundle;
        this.f40005zze = z;
        this.f40006zzf = z3;
        this.f40007zzg = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        Long l2 = this.f40001zza;
        ((zzcv) Preconditions.checkNotNull(this.f40007zzg.f40044zzj)).logEvent(this.f40002zzb, this.f40003zzc, this.f40004zzd, this.f40005zze, this.f40006zzf, l2 == null ? this.f40008zzh : l2.longValue());
    }
}
