package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzal extends zzaf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzaf f40725zza = new zzal(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f40726zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f40727zzc;

    public zzal(Object[] objArr, int i) {
        this.f40726zzb = objArr;
        this.f40727zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzt.zza(i, this.f40727zzc, "index");
        Object obj2 = this.f40726zzb[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40727zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f40726zzb, 0, objArr, 0, this.f40727zzc);
        return this.f40727zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzb() {
        return this.f40727zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] zze() {
        return this.f40726zzb;
    }
}
