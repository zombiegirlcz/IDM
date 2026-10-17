package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzy extends zzp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Object[] f43441zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient int f43442zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43443zzc;

    public zzy(Object[] objArr, int i, int i2) {
        this.f43441zza = objArr;
        this.f43442zzb = i;
        this.f43443zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzf.zza(i, this.f43443zzc, "index");
        Object obj2 = this.f43441zza[i + i + this.f43442zzb];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43443zzc;
    }
}
