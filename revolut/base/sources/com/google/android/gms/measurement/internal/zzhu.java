package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.stats.ConnectionTracker;

/* JADX INFO: loaded from: classes16.dex */
final class zzhu implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr f47102zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f47103zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzhv f47104zzc;

    public zzhu(zzhv zzhvVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f47102zza = zzbrVar;
        this.f47103zzb = serviceConnection;
        this.f47104zzc = zzhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhv zzhvVar = this.f47104zzc;
        String str = zzhvVar.f47106zzb;
        zzhw zzhwVar = zzhvVar.f47105zza;
        zzio zzioVar = zzhwVar.f47107zza;
        zzioVar.zzaX().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle bundleZze = this.f47102zza.zze(bundle);
            if (bundleZze == null) {
                zzioVar.zzaW().zze().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleZze;
            }
        } catch (Exception e) {
            zzhwVar.f47107zza.zzaW().zze().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzio zzioVar2 = zzhwVar.f47107zza;
        zzioVar2.zzaX().zzg();
        zzio.zzP();
        if (bundle2 != null) {
            long j2 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j2 == 0) {
                a.C(zzioVar2, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    a.w(zzioVar2, "No referrer defined in Install Referrer response");
                } else {
                    zzioVar2.zzaW().zzj().zzb("InstallReferrer API result", string);
                    Bundle bundleZzu = zzioVar2.zzw().zzu(Uri.parse("?".concat(string)));
                    if (bundleZzu == null) {
                        a.w(zzioVar2, "No campaign params defined in Install Referrer result");
                    } else {
                        if (bundleZzu.containsKey("gclid") || bundleZzu.containsKey("gbraid")) {
                            long j3 = bundle2.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j3 > 0) {
                                bundleZzu.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == zzioVar2.zzm().f47093zzd.zza()) {
                            zzioVar2.zzaW().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzioVar2.zzJ()) {
                            zzioVar2.zzm().f47093zzd.zzb(j2);
                            zzioVar2.zzaW().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleZzu.putString("_cis", "referrer API v2");
                            zzioVar2.zzq().zzQ("auto", "_cmp", bundleZzu, str);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzioVar2.zzaT(), this.f47103zzb);
    }
}
