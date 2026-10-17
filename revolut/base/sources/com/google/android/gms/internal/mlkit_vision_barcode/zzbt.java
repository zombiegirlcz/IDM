package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
class zzbt extends zzbr implements List {

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzbu f41280zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbt(zzbu zzbuVar, Object obj2, List list, zzbr zzbrVar) {
        super(zzbuVar, obj2, list, zzbrVar);
        this.f41280zzf = zzbuVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj2) {
        zzb();
        boolean zIsEmpty = this.f41275zzb.isEmpty();
        ((List) this.f41275zzb).add(i, obj2);
        this.f41280zzf.f41282zzb++;
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
        boolean zAddAll = ((List) this.f41275zzb).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f41275zzb.size();
        zzbu zzbuVar = this.f41280zzf;
        zzbuVar.f41282zzb = (size2 - size) + zzbuVar.f41282zzb;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f41275zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        zzb();
        return ((List) this.f41275zzb).indexOf(obj2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        zzb();
        return ((List) this.f41275zzb).lastIndexOf(obj2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzbs(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f41275zzb).remove(i);
        zzbu zzbuVar = this.f41280zzf;
        zzbuVar.f41282zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj2) {
        zzb();
        return ((List) this.f41275zzb).set(i, obj2);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        zzbu zzbuVar = this.f41280zzf;
        Object obj2 = this.f41274zza;
        List listSubList = ((List) this.f41275zzb).subList(i, i2);
        zzbr zzbrVar = this.f41276zzc;
        if (zzbrVar == null) {
            zzbrVar = this;
        }
        return zzbuVar.zzm(obj2, listSubList, zzbrVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzbs(this, i);
    }
}
