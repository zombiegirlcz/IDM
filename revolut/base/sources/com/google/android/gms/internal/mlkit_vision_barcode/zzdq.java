package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzdq extends zzcy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzcx f41341zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient zzcv f41342zzb;

    public zzdq(zzcx zzcxVar, zzcv zzcvVar) {
        this.f41341zza = zzcxVar;
        this.f41342zzb = zzcvVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f41341zza.get(obj2) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcy, com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f41342zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41341zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zza(Object[] objArr, int i) {
        return this.f41342zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcy, com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    /* JADX INFO: renamed from: zzd */
    public final zzdx iterator() {
        return this.f41342zzb.listIterator(0);
    }
}
