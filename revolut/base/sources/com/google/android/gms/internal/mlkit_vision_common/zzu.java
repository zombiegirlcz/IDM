package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends zzp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzp f43432zza = new zzu(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f43433zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43434zzc;

    public zzu(Object[] objArr, int i) {
        this.f43433zzb = objArr;
        this.f43434zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzf.zza(i, this.f43434zzc, "index");
        Object obj2 = this.f43433zzb[i];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43434zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f43433zzb, 0, objArr, 0, this.f43434zzc);
        return this.f43434zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzb() {
        return this.f43434zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final Object[] zze() {
        return this.f43433zzb;
    }
}
