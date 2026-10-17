package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzan extends zzal implements ListIterator {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzao f43471zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzao zzaoVar) {
        super(zzaoVar);
        this.f43471zzd = zzaoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        boolean zIsEmpty = this.f43471zzd.isEmpty();
        zza();
        ((ListIterator) this.f43463zza).add(obj2);
        zzap.zzd(this.f43471zzd.f43472zzf);
        if (zIsEmpty) {
            this.f43471zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.f43463zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.f43463zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.f43463zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.f43463zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        zza();
        ((ListIterator) this.f43463zza).set(obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzao zzaoVar, int i) {
        super(zzaoVar, ((List) zzaoVar.f43467zzb).listIterator(i));
        this.f43471zzd = zzaoVar;
    }
}
