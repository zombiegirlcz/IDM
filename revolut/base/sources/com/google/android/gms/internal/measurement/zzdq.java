package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzdq extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzdj f39934zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f39935zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f39936zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzff f39937zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzff zzffVar, zzdj zzdjVar, String str, String str2) {
        super(zzffVar, true);
        this.f39934zza = zzdjVar;
        this.f39935zzb = str;
        this.f39936zzc = str2;
        this.f39937zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39937zzd.f40044zzj)).setCurrentScreenByScionActivityInfo(this.f39934zza, this.f39935zzb, this.f39936zzc, this.f40008zzh);
    }
}
