package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpi extends zzoz {
    public zzpi(zzpv zzpvVar) {
        super(zzpvVar);
    }

    private final String zzf(String str) {
        String strZzm = this.f47639zzg.zzr().zzm(str);
        if (TextUtils.isEmpty(strZzm)) {
            return (String) zzgi.zzq.zza(null);
        }
        Uri uri2 = Uri.parse((String) zzgi.zzq.zza(null));
        Uri.Builder builderBuildUpon = uri2.buildUpon();
        builderBuildUpon.authority(strZzm + "." + uri2.getAuthority());
        return builderBuildUpon.build().toString();
    }

    private final boolean zzh(String str, String str2) {
        zzh zzhVarZzl;
        zzpv zzpvVar = this.f47639zzg;
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj = zzpvVar.zzr().zzj(str);
        if (zzgoVarZzj == null || (zzhVarZzl = zzpvVar.zzj().zzl(str)) == null) {
            return false;
        }
        if ((zzgoVarZzj.zzv() && zzgoVarZzj.zzi().zza() == 100) || this.zzu.zzw().zzak(str, zzhVarZzl.zzM())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < zzgoVarZzj.zzi().zza();
    }

    private static final boolean zzi(String str) {
        String str2 = (String) zzgi.zzs.zza(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzph zza(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpi.zza(java.lang.String):com.google.android.gms.measurement.internal.zzph");
    }

    public final boolean zzd(String str, com.google.android.gms.internal.measurement.zzih zzihVar) {
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj;
        zzg();
        return this.zzu.zzf().zzx(null, zzgi.zzaP) && zzihVar == com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE && !zzi(str) && (zzgoVarZzj = this.f47639zzg.zzr().zzj(str)) != null && zzgoVarZzj.zzv() && !zzgoVarZzj.zzi().zze().isEmpty();
    }
}
