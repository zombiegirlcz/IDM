package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zzdn extends zzcv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcv f41334zza = new zzdn(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f41335zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f41336zzc;

    public zzdn(Object[] objArr, int i) {
        this.f41335zzb = objArr;
        this.f41336zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbc.zza(i, this.f41336zzc, "index");
        Object obj2 = this.f41335zzb[i];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41336zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f41335zzb, 0, objArr, i, this.f41336zzc);
        return i + this.f41336zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zzb() {
        return this.f41336zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final Object[] zze() {
        return this.f41335zzb;
    }
}
