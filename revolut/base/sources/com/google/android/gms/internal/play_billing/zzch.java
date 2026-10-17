package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzch extends zzbw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Object[] f45875zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient int f45876zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f45877zzc;

    public zzch(Object[] objArr, int i, int i2) {
        this.f45875zza = objArr;
        this.f45876zzb = i;
        this.f45877zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbj.zza(i, this.f45877zzc, "index");
        Object obj2 = this.f45875zza[i + i + this.f45876zzb];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45877zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        return true;
    }
}
