package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzaj extends zzah implements ListIterator {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzak f44446zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzak zzakVar) {
        super(zzakVar);
        this.f44446zzd = zzakVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        boolean zIsEmpty = this.f44446zzd.isEmpty();
        zza();
        ((ListIterator) this.f44438zza).add(obj2);
        this.f44446zzd.f44447zzf.f44449zzb++;
        if (zIsEmpty) {
            this.f44446zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.f44438zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.f44438zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.f44438zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.f44438zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        zza();
        ((ListIterator) this.f44438zza).set(obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzak zzakVar, int i) {
        super(zzakVar, ((List) zzakVar.f44442zzb).listIterator(i));
        this.f44446zzd = zzakVar;
    }
}
