package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzaz extends zzau {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Object f46328zza;

    public zzaz(Object obj2) {
        obj2.getClass();
        this.f46328zza = obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return this.f46328zza.equals(obj2);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f46328zza.hashCode();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzav(this.f46328zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.p("[", this.f46328zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.f46328zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzba iterator() {
        return new zzav(this.f46328zza);
    }
}
