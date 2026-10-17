package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zzcc extends zzbn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzbn f43521zza = new zzcc(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f43522zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43523zzc;

    public zzcc(Object[] objArr, int i) {
        this.f43522zzb = objArr;
        this.f43523zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.f43523zzc, "index");
        Object obj2 = this.f43522zzb[i];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43523zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f43522zzb, 0, objArr, 0, this.f43523zzc);
        return this.f43523zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.f43523zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.f43522zzb;
    }
}
