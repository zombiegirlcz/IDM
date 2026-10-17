package com.google.android.gms.measurement.internal;

import v0.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzhb implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ int f47023zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47024zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ Object f47025zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ Object f47026zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ Object f47027zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzhe f47028zzf;

    public zzhb(zzhe zzheVar, int i, String str, Object obj2, Object obj3, Object obj4) {
        this.f47023zza = i;
        this.f47024zzb = str;
        this.f47025zzc = obj2;
        this.f47026zzd = obj3;
        this.f47027zze = obj4;
        this.f47028zzf = zzheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhe zzheVar = this.f47028zzf;
        zzht zzhtVarZzm = zzheVar.zzu.zzm();
        if (!zzhtVarZzm.zzy()) {
            zzheVar.zzr();
            return;
        }
        if (zzheVar.f47034zza == 0) {
            zzio zzioVar = zzheVar.zzu;
            if (zzioVar.zzf().zzD()) {
                zzioVar.zzaV();
                zzheVar.f47034zza = 'C';
            } else {
                zzioVar.zzaV();
                zzheVar.f47034zza = 'c';
            }
        }
        if (zzheVar.f47035zzb < 0) {
            zzheVar.zzu.zzf().zzj();
            zzheVar.f47035zzb = 119002L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f47023zza);
        char c2 = zzheVar.f47034zza;
        long j2 = zzheVar.f47035zzb;
        String str = this.f47024zzb;
        String strZzo = zzhe.zzo(true, str, this.f47025zzc, this.f47026zzd, this.f47027zze);
        StringBuilder sb6 = new StringBuilder("2");
        sb6.append(cCharAt);
        sb6.append(c2);
        sb6.append(j2);
        String strI = a.i(sb6, ":", strZzo);
        if (strI.length() > 1024) {
            strI = str.substring(0, 1024);
        }
        zzhq zzhqVar = zzhtVarZzm.f47091zzb;
        if (zzhqVar != null) {
            zzhqVar.zzb(strI, 1L);
        }
    }
}
