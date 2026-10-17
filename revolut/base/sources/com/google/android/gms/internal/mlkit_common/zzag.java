package com.google.android.gms.internal.mlkit_common;

import a0.d;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzag {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f40715zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f40716zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Object f40717zzc;

    public zzag(Object obj2, Object obj3, Object obj4) {
        this.f40715zza = obj2;
        this.f40716zzb = obj3;
        this.f40717zzc = obj4;
    }

    public final IllegalArgumentException zza() {
        Object obj2 = this.f40717zzc;
        Object obj3 = this.f40716zzb;
        Object obj4 = this.f40715zza;
        String strValueOf = String.valueOf(obj4);
        String strValueOf2 = String.valueOf(obj3);
        return new IllegalArgumentException(d.u(a.m("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj4), "=", String.valueOf(obj2)));
    }
}
