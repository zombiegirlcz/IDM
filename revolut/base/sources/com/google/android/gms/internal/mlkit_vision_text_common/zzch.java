package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzch extends zzbn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzbm f44509zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient zzbk f44510zzb;

    public zzch(zzbm zzbmVar, zzbk zzbkVar) {
        this.f44509zza = zzbmVar;
        this.f44510zzb = zzbkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f44509zza.get(obj2) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbn, com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f44510zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zza(Object[] objArr, int i) {
        return this.f44510zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbn, com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: zzd */
    public final zzco iterator() {
        return this.f44510zzb.listIterator(0);
    }
}
