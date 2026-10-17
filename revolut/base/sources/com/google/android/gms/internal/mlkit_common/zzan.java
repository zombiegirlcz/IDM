package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzan extends zzaj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzai f40729zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient Object[] f40730zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f40731zzc;

    public zzan(zzai zzaiVar, Object[] objArr, int i, int i2) {
        this.f40729zza = zzaiVar;
        this.f40730zzb = objArr;
        this.f40731zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f40729zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40731zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: zzd */
    public final zzas iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj
    public final zzaf zzg() {
        return new zzam(this);
    }
}
