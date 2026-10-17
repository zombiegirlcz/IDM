package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
final class zzdb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzbp f45916zza = new zzbp();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f45917zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile Logger f45918zzc;

    public zzdb(Class cls) {
        this.f45917zzb = cls.getName();
    }

    public final Logger zza() {
        Logger logger = this.f45918zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f45916zza) {
            try {
                Logger logger2 = this.f45918zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f45917zzb);
                this.f45918zzc = logger3;
                return logger3;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
