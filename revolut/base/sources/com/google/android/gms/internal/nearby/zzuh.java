package com.google.android.gms.internal.nearby;

import java.util.Iterator;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzuh extends zzuc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Object f45752zza;

    public zzuh(Object obj2) {
        obj2.getClass();
        this.f45752zza = obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return this.f45752zza.equals(obj2);
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f45752zza.hashCode();
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, com.google.android.gms.internal.nearby.zztx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzud(this.f45752zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.p("[", this.f45752zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.f45752zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, com.google.android.gms.internal.nearby.zztx
    public final zzua zzd() {
        return zzua.zzl(this.f45752zza);
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, com.google.android.gms.internal.nearby.zztx
    /* JADX INFO: renamed from: zze */
    public final zzui iterator() {
        return new zzud(this.f45752zza);
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final boolean zzf() {
        throw null;
    }
}
