package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class zzdu extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39943zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f39944zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ Context f39945zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ Bundle f39946zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzff f39947zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzff zzffVar, String str, String str2, Context context, Bundle bundle) {
        super(zzffVar, true);
        this.f39943zza = str;
        this.f39944zzb = str2;
        this.f39945zzc = context;
        this.f39946zzd = bundle;
        this.f39947zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            zzff zzffVar = this.f39947zze;
            String str4 = this.f39943zza;
            String str5 = this.f39944zzb;
            if (zzffVar.zzX(str4, str5)) {
                str2 = str4;
                str3 = str5;
                str = zzffVar.f40038zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Context context = this.f39945zzc;
            Preconditions.checkNotNull(context);
            zzffVar.f40044zzj = zzffVar.zzf(context, true);
            if (zzffVar.f40044zzj == null) {
                String unused = zzffVar.f40038zzd;
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(context, "com.google.android.gms.measurement.dynamite");
            ((zzcv) Preconditions.checkNotNull(zzffVar.f40044zzj)).initialize(ObjectWrapper.wrap(context), new zzdh(119002L, Math.max(localVersion, r0), DynamiteModule.getRemoteVersion(context, "com.google.android.gms.measurement.dynamite") < localVersion, str, str2, str3, this.f39946zzd, com.google.android.gms.measurement.internal.zzig.zza(context)), this.f40008zzh);
        } catch (Exception e) {
            this.f39947zze.zzU(e, true, false);
        }
    }
}
