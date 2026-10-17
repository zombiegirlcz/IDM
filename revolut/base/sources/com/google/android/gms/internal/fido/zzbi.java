package com.google.android.gms.internal.fido;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39305zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzbg f39306zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzbg f39307zzc;

    public /* synthetic */ zzbi(String str, zzbh zzbhVar) {
        zzbg zzbgVar = new zzbg();
        this.f39306zzb = zzbgVar;
        this.f39307zzc = zzbgVar;
        str.getClass();
        this.f39305zza = str;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(this.f39305zza);
        sb6.append(CoreConstants.CURLY_LEFT);
        zzbg zzbgVar = this.f39306zzb.f39304zzc;
        String str = "";
        while (zzbgVar != null) {
            Object obj2 = zzbgVar.f39303zzb;
            sb6.append(str);
            String str2 = zzbgVar.f39302zza;
            if (str2 != null) {
                sb6.append(str2);
                sb6.append('=');
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb6.append(obj2);
            } else {
                sb6.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
            }
            zzbgVar = zzbgVar.f39304zzc;
            str = ", ";
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }

    public final zzbi zza(String str, int i) {
        String strValueOf = String.valueOf(i);
        zzbf zzbfVar = new zzbf(null);
        this.f39307zzc.f39304zzc = zzbfVar;
        this.f39307zzc = zzbfVar;
        zzbfVar.f39303zzb = strValueOf;
        zzbfVar.f39302zza = "errorCode";
        return this;
    }

    public final zzbi zzb(String str, Object obj2) {
        zzbg zzbgVar = new zzbg();
        this.f39307zzc.f39304zzc = zzbgVar;
        this.f39307zzc = zzbgVar;
        zzbgVar.f39303zzb = obj2;
        zzbgVar.f39302zza = str;
        return this;
    }
}
