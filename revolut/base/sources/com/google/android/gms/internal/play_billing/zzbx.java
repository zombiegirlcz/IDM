package com.google.android.gms.internal.play_billing;

import a0.d;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzbx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f45855zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f45856zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Object f45857zzc;

    public zzbx(Object obj2, Object obj3, Object obj4) {
        this.f45855zza = obj2;
        this.f45856zzb = obj3;
        this.f45857zzc = obj4;
    }

    public final IllegalArgumentException zza() {
        Object obj2 = this.f45857zzc;
        Object obj3 = this.f45856zzb;
        Object obj4 = this.f45855zza;
        String strValueOf = String.valueOf(obj4);
        String strValueOf2 = String.valueOf(obj3);
        return new IllegalArgumentException(d.u(a.m("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj4), "=", String.valueOf(obj2)));
    }
}
