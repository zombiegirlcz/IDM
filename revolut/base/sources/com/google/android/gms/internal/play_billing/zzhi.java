package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzhi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzhi f46087zza = new zzhi();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ConcurrentMap f46089zzc = new ConcurrentHashMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzhm f46088zzb = new zzgs();

    private zzhi() {
    }

    public static zzhi zza() {
        return f46087zza;
    }

    public final zzhl zzb(Class cls) {
        byte[] bArr = zzga.f46030zzb;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentMap concurrentMap = this.f46089zzc;
        zzhl zzhlVarZza = (zzhl) concurrentMap.get(cls);
        if (zzhlVarZza == null) {
            zzhlVarZza = this.f46088zzb.zza(cls);
            zzhl zzhlVar = (zzhl) concurrentMap.putIfAbsent(cls, zzhlVarZza);
            if (zzhlVar != null) {
                return zzhlVar;
            }
        }
        return zzhlVarZza;
    }
}
