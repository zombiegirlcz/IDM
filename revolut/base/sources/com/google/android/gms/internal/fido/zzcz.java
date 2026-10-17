package com.google.android.gms.internal.fido;

import java.util.Iterator;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzcz extends zzcf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Object f39355zza;

    public zzcz(Object obj2) {
        obj2.getClass();
        this.f39355zza = obj2;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f39355zza.equals(obj2);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f39355zza.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzcm(this.f39355zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.p("[", this.f39355zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.f39355zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: zzd */
    public final zzdc iterator() {
        return new zzcm(this.f39355zza);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return zzcc.zzj(this.f39355zza);
    }
}
