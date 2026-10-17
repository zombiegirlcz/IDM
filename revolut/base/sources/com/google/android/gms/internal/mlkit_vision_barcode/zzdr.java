package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
final class zzdr extends zzcv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient Object[] f41343zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient int f41344zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f41345zzc;

    public zzdr(Object[] objArr, int i, int i2) {
        this.f41343zza = objArr;
        this.f41344zzb = i;
        this.f41345zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbc.zza(i, this.f41345zzc, "index");
        Object obj2 = this.f41343zza[i + i + this.f41344zzb];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41345zzc;
    }
}
