package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcs extends zzcx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final AtomicReference f39904zza = new AtomicReference();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f39905zzb;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zzf(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L29
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L29
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = a0.d.s(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            throw r0
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcs.zzf(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle zzb(long j2) {
        Bundle bundle;
        AtomicReference atomicReference = this.f39904zza;
        synchronized (atomicReference) {
            if (!this.f39905zzb) {
                try {
                    atomicReference.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f39904zza.get();
        }
        return bundle;
    }

    public final Long zzc(long j2) {
        return (Long) zzf(zzb(j2), Long.class);
    }

    public final String zzd(long j2) {
        return (String) zzf(zzb(j2), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(Bundle bundle) {
        AtomicReference atomicReference = this.f39904zza;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f39905zzb = true;
                } finally {
                    this.f39904zza.notify();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
