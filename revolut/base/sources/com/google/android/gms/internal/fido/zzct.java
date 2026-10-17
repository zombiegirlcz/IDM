package com.google.android.gms.internal.fido;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzct extends zzcc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcc f39341zza = new zzct(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f39342zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f39343zzc;

    public zzct(Object[] objArr, int i) {
        this.f39342zzb = objArr;
        this.f39343zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.zza(i, this.f39343zzc, "index");
        Object obj2 = this.f39342zzb[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39343zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f39342zzb, 0, objArr, 0, this.f39343zzc);
        return this.f39343zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.f39343zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.f39342zzb;
    }
}
