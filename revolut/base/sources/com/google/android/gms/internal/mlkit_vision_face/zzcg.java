package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes16.dex */
final class zzcg extends zzbn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Object[] f43530zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient int f43531zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43532zzc;

    public zzcg(Object[] objArr, int i, int i2) {
        this.f43530zza = objArr;
        this.f43531zzb = i;
        this.f43532zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.f43532zzc, "index");
        Object obj2 = this.f43530zza[i + i + this.f43531zzb];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43532zzc;
    }
}
