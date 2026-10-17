package com.google.android.gms.internal.play_billing;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f45837zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzbe f45838zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzbe f45839zzc;

    public /* synthetic */ zzbf(String str, zzbg zzbgVar) {
        zzbe zzbeVar = new zzbe();
        this.f45838zzb = zzbeVar;
        this.f45839zzc = zzbeVar;
        str.getClass();
        this.f45837zza = str;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(this.f45837zza);
        sb6.append(CoreConstants.CURLY_LEFT);
        zzbe zzbeVar = this.f45838zzb.f45836zzb;
        String str = "";
        while (zzbeVar != null) {
            Object obj2 = zzbeVar.f45835zza;
            sb6.append(str);
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb6.append(obj2);
            } else {
                sb6.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
            }
            zzbeVar = zzbeVar.f45836zzb;
            str = ", ";
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }

    public final zzbf zza(Object obj2) {
        zzbe zzbeVar = new zzbe();
        this.f45839zzc.f45836zzb = zzbeVar;
        this.f45839zzc = zzbeVar;
        zzbeVar.f45835zza = obj2;
        return this;
    }
}
