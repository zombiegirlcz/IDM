package com.google.android.gms.internal.fido;

import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public class zzdk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39366zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Class f39367zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f39368zzc;

    public zzdk(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.f39367zzb;
        String name = getClass().getName();
        return a.w(v0.a.l(name, "/"), this.f39366zza, "[", cls.getName(), "]");
    }

    public final boolean zzb() {
        return this.f39368zzc;
    }

    private zzdk(String str, Class cls, boolean z, boolean z3) {
        zzfk.zzb(str);
        this.f39366zza = str;
        this.f39367zzb = cls;
        this.f39368zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }
}
