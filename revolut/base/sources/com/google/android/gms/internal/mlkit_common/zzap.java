package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzap extends zzaf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Object[] f40734zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient int f40735zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f40736zzc;

    public zzap(Object[] objArr, int i, int i2) {
        this.f40734zza = objArr;
        this.f40735zzb = i;
        this.f40736zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzt.zza(i, this.f40736zzc, "index");
        Object obj2 = this.f40734zza[i + i + this.f40735zzb];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40736zzc;
    }
}
