package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
public final class zzx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzio f47752zza;

    public zzx(zzio zzioVar) {
        this.f47752zza = zzioVar;
    }

    public final void zza(String str, Bundle bundle) {
        String string;
        zzio zzioVar = this.f47752zza;
        zzioVar.zzaX().zzg();
        if (zzioVar.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        zzioVar.zzm().zzr.zzb(string);
        zzioVar.zzm().zzs.zzb(zzioVar.zzaU().currentTimeMillis());
    }

    public final void zzb() {
        zzio zzioVar = this.f47752zza;
        zzioVar.zzaX().zzg();
        if (zzd()) {
            if (zze()) {
                zzioVar.zzm().zzr.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzioVar.zzq().zzR("auto", "_cmpx", bundle);
            } else {
                String strZza = zzioVar.zzm().zzr.zza();
                if (TextUtils.isEmpty(strZza)) {
                    zzioVar.zzaW().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long jZza = zzioVar.zzm().zzs.zza() / CoreConstants.MILLIS_IN_ONE_HOUR;
                    Uri uri2 = Uri.parse(strZza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri2.getPath(), bundle2);
                    for (String str : uri2.getQueryParameterNames()) {
                        bundle2.putString(str, uri2.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jZza - 1) * CoreConstants.MILLIS_IN_ONE_HOUR);
                    Object obj2 = pair.first;
                    zzioVar.zzq().zzR(obj2 == null ? "app" : (String) obj2, "_cmp", (Bundle) pair.second);
                }
                zzioVar.zzm().zzr.zzb(null);
            }
            zzioVar.zzm().zzs.zzb(0L);
        }
    }

    public final void zzc() {
        if (zzd() && zze()) {
            this.f47752zza.zzm().zzr.zzb(null);
        }
    }

    public final boolean zzd() {
        return this.f47752zza.zzm().zzs.zza() > 0;
    }

    public final boolean zze() {
        if (!zzd()) {
            return false;
        }
        zzio zzioVar = this.f47752zza;
        return zzioVar.zzaU().currentTimeMillis() - zzioVar.zzm().zzs.zza() > zzioVar.zzf().zzk(null, zzgi.zzai);
    }
}
