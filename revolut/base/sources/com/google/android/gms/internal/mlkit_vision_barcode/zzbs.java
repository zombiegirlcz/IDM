package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzbs extends zzbq implements ListIterator {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzbt f41279zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbs(zzbt zzbtVar) {
        super(zzbtVar);
        this.f41279zzd = zzbtVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        boolean zIsEmpty = this.f41279zzd.isEmpty();
        zza();
        ((ListIterator) this.f41271zza).add(obj2);
        this.f41279zzd.f41280zzf.f41282zzb++;
        if (zIsEmpty) {
            this.f41279zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.f41271zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.f41271zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.f41271zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.f41271zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        zza();
        ((ListIterator) this.f41271zza).set(obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbs(zzbt zzbtVar, int i) {
        super(zzbtVar, ((List) zzbtVar.f41275zzb).listIterator(i));
        this.f41279zzd = zzbtVar;
    }
}
