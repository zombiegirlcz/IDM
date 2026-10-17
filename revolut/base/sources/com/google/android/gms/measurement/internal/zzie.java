package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzie implements com.google.android.gms.internal.measurement.zzo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47120zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzif f47121zzb;

    public zzie(zzif zzifVar, String str) {
        this.f47120zza = str;
        this.f47121zzb = zzifVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f47121zzb.f47127zzf.get(this.f47120zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
