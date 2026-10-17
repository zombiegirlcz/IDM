package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzke {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Context f47286zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    String f47287zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    String f47288zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    String f47289zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    Boolean f47290zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    long f47291zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    com.google.android.gms.internal.measurement.zzdh f47292zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    boolean f47293zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    final Long f47294zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    String f47295zzj;

    public zzke(Context context, com.google.android.gms.internal.measurement.zzdh zzdhVar, Long l2) {
        this.f47293zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f47286zza = applicationContext;
        this.f47294zzi = l2;
        if (zzdhVar != null) {
            this.f47292zzg = zzdhVar;
            this.f47287zzb = zzdhVar.f39911zzf;
            this.f47288zzc = zzdhVar.f39910zze;
            this.f47289zzd = zzdhVar.f39909zzd;
            this.f47293zzh = zzdhVar.f39908zzc;
            this.f47291zzf = zzdhVar.f39907zzb;
            this.f47295zzj = zzdhVar.f39913zzh;
            Bundle bundle = zzdhVar.f39912zzg;
            if (bundle != null) {
                this.f47290zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
