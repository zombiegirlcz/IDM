package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzw extends zzs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzr f43436zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient Object[] f43437zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43438zzc;

    public zzw(zzr zzrVar, Object[] objArr, int i, int i2) {
        this.f43436zza = zzrVar;
        this.f43437zzb = objArr;
        this.f43438zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f43436zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43438zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: zzd */
    public final zzab iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs
    public final zzp zzg() {
        return new zzv(this);
    }
}
