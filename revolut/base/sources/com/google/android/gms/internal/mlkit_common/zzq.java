package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f41151zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzo f41152zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzo f41153zzc;

    public /* synthetic */ zzq(String str, zzp zzpVar) {
        zzo zzoVar = new zzo();
        this.f41152zzb = zzoVar;
        this.f41153zzc = zzoVar;
        str.getClass();
        this.f41151zza = str;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(this.f41151zza);
        sb6.append(CoreConstants.CURLY_LEFT);
        zzo zzoVar = this.f41152zzb.f41150zzc;
        String str = "";
        while (zzoVar != null) {
            Object obj2 = zzoVar.f41149zzb;
            sb6.append(str);
            String str2 = zzoVar.f41148zza;
            if (str2 != null) {
                sb6.append(str2);
                sb6.append('=');
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb6.append(obj2);
            } else {
                sb6.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
            }
            zzoVar = zzoVar.f41150zzc;
            str = ", ";
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }

    public final zzq zza(String str, Object obj2) {
        zzo zzoVar = new zzo();
        this.f41153zzc.f41150zzc = zzoVar;
        this.f41153zzc = zzoVar;
        zzoVar.f41149zzb = obj2;
        zzoVar.f41148zza = str;
        return this;
    }

    public final zzq zzb(String str, boolean z) {
        String strValueOf = String.valueOf(z);
        zzn zznVar = new zzn(null);
        this.f41153zzc.f41150zzc = zznVar;
        this.f41153zzc = zznVar;
        zznVar.f41149zzb = strValueOf;
        zznVar.f41148zza = "isManifestFile";
        return this;
    }
}
