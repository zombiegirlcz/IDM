package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzgf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzgf f39087zza = new zzgf();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ConcurrentMap f39089zzc = new ConcurrentHashMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzgj f39088zzb = new zzfp();

    private zzgf() {
    }

    public static zzgf zza() {
        return f39087zza;
    }

    public final zzgi zzb(Class cls) {
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar = (zzgi) this.f39089zzc.get(cls);
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZza = this.f39088zzb.zza(cls);
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar2 = (zzgi) this.f39089zzc.putIfAbsent(cls, zzgiVarZza);
        return zzgiVar2 == null ? zzgiVarZza : zzgiVar2;
    }
}
