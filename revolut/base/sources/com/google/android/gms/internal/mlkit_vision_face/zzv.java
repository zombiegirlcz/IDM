package com.google.android.gms.internal.mlkit_vision_face;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f44423zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzu f44424zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzu f44425zzc;

    public /* synthetic */ zzv(String str, zzs zzsVar) {
        zzu zzuVar = new zzu(null);
        this.f44424zzb = zzuVar;
        this.f44425zzc = zzuVar;
        this.f44423zza = str;
    }

    private final zzv zze(String str, Object obj2) {
        zzt zztVar = new zzt(null);
        this.f44425zzc.f44422zzc = zztVar;
        this.f44425zzc = zztVar;
        zztVar.f44421zzb = obj2;
        zztVar.f44420zza = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(this.f44423zza);
        sb6.append(CoreConstants.CURLY_LEFT);
        zzu zzuVar = this.f44424zzb.f44422zzc;
        String str = "";
        while (zzuVar != null) {
            Object obj2 = zzuVar.f44421zzb;
            sb6.append(str);
            String str2 = zzuVar.f44420zza;
            if (str2 != null) {
                sb6.append(str2);
                sb6.append('=');
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb6.append(obj2);
            } else {
                sb6.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
            }
            zzuVar = zzuVar.f44422zzc;
            str = ", ";
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }

    public final zzv zza(String str, float f) {
        zze(str, String.valueOf(f));
        return this;
    }

    public final zzv zzb(String str, int i) {
        zze(str, String.valueOf(i));
        return this;
    }

    public final zzv zzc(String str, Object obj2) {
        zzu zzuVar = new zzu(null);
        this.f44425zzc.f44422zzc = zzuVar;
        this.f44425zzc = zzuVar;
        zzuVar.f44421zzb = obj2;
        zzuVar.f44420zza = str;
        return this;
    }

    public final zzv zzd(String str, boolean z) {
        zze("trackingEnabled", String.valueOf(z));
        return this;
    }
}
