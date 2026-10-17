package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzdp extends zzcy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzcx f41338zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient Object[] f41339zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f41340zzc;

    public zzdp(zzcx zzcxVar, Object[] objArr, int i, int i2) {
        this.f41338zza = zzcxVar;
        this.f41339zzb = objArr;
        this.f41340zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f41338zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcy, com.google.android.gms.internal.mlkit_vision_barcode.zzcq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41340zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcy, com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    /* JADX INFO: renamed from: zzd */
    public final zzdx iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcy
    public final zzcv zzg() {
        return new zzdo(this);
    }
}
