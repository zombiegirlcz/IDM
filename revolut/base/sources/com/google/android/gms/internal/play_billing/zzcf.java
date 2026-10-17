package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzcf extends zzca {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzbz f45870zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient Object[] f45871zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f45872zzc;

    public zzcf(zzbz zzbzVar, Object[] objArr, int i, int i2) {
        this.f45870zza = zzbzVar;
        this.f45871zzb = objArr;
        this.f45872zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f45870zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f45872zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: zze */
    public final zzck iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca
    public final zzbw zzh() {
        return new zzce(this);
    }
}
