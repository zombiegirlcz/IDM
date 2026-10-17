package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class zzu {
    @NonNull
    public static zzdc zza(@NonNull zzr zzrVar) {
        zzp zzpVar = new zzp();
        zzt zztVar = new zzt(zzpVar);
        zzpVar.f46286zzb = zztVar;
        zzpVar.f46285zza = zzrVar.getClass();
        try {
            zzpVar.f46285zza = zzrVar.zza(zzpVar);
            return zztVar;
        } catch (Exception e) {
            zztVar.zzc(e);
            return zztVar;
        }
    }
}
