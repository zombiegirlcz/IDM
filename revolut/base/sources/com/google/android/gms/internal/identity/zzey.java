package com.google.android.gms.internal.identity;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzey extends zzex {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzex f39764zza = new zzey(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f39765zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f39766zzc;

    public zzey(Object[] objArr, int i) {
        this.f39765zzb = objArr;
        this.f39766zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzer.zzc(i, this.f39766zzc, "index");
        Object obj2 = this.f39765zzb[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39766zzc;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final Object[] zzb() {
        return this.f39765zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzd() {
        return this.f39766zzc;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.identity.zzex, com.google.android.gms.internal.identity.zzeu
    public final int zzg(Object[] objArr, int i) {
        System.arraycopy(this.f39765zzb, 0, objArr, 0, this.f39766zzc);
        return this.f39766zzc;
    }
}
