package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzce extends zzbq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzbp f43525zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient Object[] f43526zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43527zzc;

    public zzce(zzbp zzbpVar, Object[] objArr, int i, int i2) {
        this.f43525zza = zzbpVar;
        this.f43526zzb = objArr;
        this.f43527zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f43525zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43527zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* JADX INFO: renamed from: zzd */
    public final zzcl iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq
    public final zzbn zzg() {
        return new zzcd(this);
    }
}
