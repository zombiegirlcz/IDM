package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzhc implements ListIterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final ListIterator f39122zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ int f39123zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzhe f39124zzc;

    public zzhc(zzhe zzheVar, int i) {
        this.f39124zzc = zzheVar;
        this.f39123zzb = i;
        this.f39122zza = zzheVar.f39127zza.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f39122zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39122zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39122zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39122zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f39122zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39122zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj2) {
        throw new UnsupportedOperationException();
    }
}
