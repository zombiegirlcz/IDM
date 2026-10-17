package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes16.dex */
final class zzbm extends zzbn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f43507zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f43508zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbn f43509zzc;

    public zzbm(zzbn zzbnVar, int i, int i2) {
        this.f43509zzc = zzbnVar;
        this.f43507zza = i;
        this.f43508zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.f43508zzb, "index");
        return this.f43509zzc.get(i + this.f43507zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43508zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.f43509zzc.zzc() + this.f43507zza + this.f43508zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return this.f43509zzc.zzc() + this.f43507zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.f43509zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbn subList(int i, int i2) {
        zzab.zzc(i, i2, this.f43508zzb);
        zzbn zzbnVar = this.f43509zzc;
        int i3 = this.f43507zza;
        return zzbnVar.subList(i + i3, i2 + i3);
    }
}
