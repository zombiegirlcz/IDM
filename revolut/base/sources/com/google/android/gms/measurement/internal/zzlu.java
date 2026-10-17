package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
final class zzlu implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ boolean f47389zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Uri f47390zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47391zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ String f47392zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzlv f47393zze;

    public zzlu(zzlv zzlvVar, boolean z, Uri uri2, String str, String str2) {
        this.f47389zza = z;
        this.f47390zzb = uri2;
        this.f47391zzc = str;
        this.f47392zzd = str2;
        this.f47393zze = zzlvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzu;
        zzio zzioVar;
        Bundle bundleZzu2;
        zzlv zzlvVar = this.f47393zze;
        zzlw zzlwVar = zzlvVar.f47394zza;
        zzlwVar.zzg();
        String str = this.f47392zzd;
        Uri uri2 = this.f47390zzb;
        try {
            zzio zzioVar2 = zzlwVar.zzu;
            zzqf zzqfVarZzw = zzioVar2.zzw();
            if (TextUtils.isEmpty(str)) {
                bundleZzu = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleZzu = zzqfVarZzw.zzu(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleZzu != null) {
                    bundleZzu.putString("_cis", "referrer");
                }
            } else {
                zzqfVarZzw.zzu.zzaW().zzd().zza("Activity created with data 'referrer' without required params");
                bundleZzu = null;
            }
            String str2 = this.f47391zzc;
            if (!this.f47389zza || (bundleZzu2 = zzioVar2.zzw().zzu(uri2)) == null) {
                zzioVar = zzioVar2;
            } else {
                bundleZzu2.putString("_cis", "intent");
                if (bundleZzu2.containsKey("gclid") || bundleZzu == null || !bundleZzu.containsKey("gclid")) {
                    zzioVar = zzioVar2;
                } else {
                    zzioVar = zzioVar2;
                    bundleZzu2.putString("_cer", "gclid=" + bundleZzu.getString("gclid"));
                }
                zzlwVar.zzR(str2, "_cmp", bundleZzu2);
                zzlwVar.f47396zzb.zza(str2, bundleZzu2);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zzioVar.zzaW().zzd().zzb("Activity created with referrer", str);
            if (zzioVar.zzf().zzx(null, zzgi.zzaF)) {
                if (bundleZzu != null) {
                    zzlwVar.zzR(str2, "_cmp", bundleZzu);
                    zzlwVar.f47396zzb.zza(str2, bundleZzu);
                } else {
                    zzioVar.zzaW().zzd().zzb("Referrer does not contain valid parameters", str);
                }
                zzlwVar.zzal("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                zzioVar.zzaW().zzd().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                zzlwVar.zzal("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e) {
            zzlvVar.f47394zza.zzu.zzaW().zze().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
