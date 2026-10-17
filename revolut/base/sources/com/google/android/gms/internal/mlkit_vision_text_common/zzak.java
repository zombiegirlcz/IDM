package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
class zzak extends zzai implements List {

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzal f44447zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzal zzalVar, Object obj2, List list, zzai zzaiVar) {
        super(zzalVar, obj2, list, zzaiVar);
        this.f44447zzf = zzalVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj2) {
        zzb();
        boolean zIsEmpty = this.f44442zzb.isEmpty();
        ((List) this.f44442zzb).add(i, obj2);
        this.f44447zzf.f44449zzb++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f44442zzb).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f44442zzb.size();
        this.f44447zzf.f44449zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f44442zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        zzb();
        return ((List) this.f44442zzb).indexOf(obj2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        zzb();
        return ((List) this.f44442zzb).lastIndexOf(obj2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzaj(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f44442zzb).remove(i);
        zzal zzalVar = this.f44447zzf;
        zzalVar.f44449zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj2) {
        zzb();
        return ((List) this.f44442zzb).set(i, obj2);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.f44442zzb).subList(i, i2);
        zzai zzaiVar = this.f44443zzc;
        if (zzaiVar == null) {
            zzaiVar = this;
        }
        return this.f44447zzf.zzf(this.f44441zza, listSubList, zzaiVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzaj(this, i);
    }
}
