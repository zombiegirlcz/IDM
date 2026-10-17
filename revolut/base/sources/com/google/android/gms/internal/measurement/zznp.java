package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes16.dex */
final class zznp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f40513zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zznp f40514zzb = new zznp();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final ConcurrentMap f40516zzd = new ConcurrentHashMap();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zznt f40515zzc = new zzmz();

    private zznp() {
    }

    public static zznp zza() {
        return f40514zzb;
    }

    public final zzns zzb(Class cls) {
        zzmk.zzc(cls, "messageType");
        ConcurrentMap concurrentMap = this.f40516zzd;
        zzns zznsVarZza = (zzns) concurrentMap.get(cls);
        if (zznsVarZza == null) {
            zznsVarZza = this.f40515zzc.zza(cls);
            zzmk.zzc(cls, "messageType");
            zzns zznsVar = (zzns) concurrentMap.putIfAbsent(cls, zznsVarZza);
            if (zznsVar != null) {
                return zznsVar;
            }
        }
        return zznsVarZza;
    }
}
