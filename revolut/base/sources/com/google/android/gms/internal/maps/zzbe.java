package com.google.android.gms.internal.maps;

import java.util.Iterator;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzbe extends zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Object f39804zza;

    public zzbe(Object obj2) {
        obj2.getClass();
        this.f39804zza = obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return this.f39804zza.equals(obj2);
    }

    @Override // com.google.android.gms.internal.maps.zzba, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f39804zza.hashCode();
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbb(this.f39804zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.p("[", this.f39804zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.f39804zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw
    /* JADX INFO: renamed from: zzd */
    public final zzbf iterator() {
        return new zzbb(this.f39804zza);
    }
}
