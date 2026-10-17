package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes16.dex */
final class zzdl extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39917zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f39918zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ Object f39919zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ boolean f39920zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzff f39921zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzff zzffVar, String str, String str2, Object obj2, boolean z) {
        super(zzffVar, true);
        this.f39917zza = str;
        this.f39918zzb = str2;
        this.f39919zzc = obj2;
        this.f39920zzd = z;
        this.f39921zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39921zze.f40044zzj)).setUserProperty(this.f39917zza, this.f39918zzb, ObjectWrapper.wrap(this.f39919zzc), this.f39920zzd, this.f40008zzh);
    }
}
