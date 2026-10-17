package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
class zzao extends zzam implements List {

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzap f43472zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, Object obj2, List list, zzam zzamVar) {
        super(zzapVar, obj2, list, zzamVar);
        this.f43472zzf = zzapVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj2) {
        zzb();
        boolean zIsEmpty = this.f43467zzb.isEmpty();
        ((List) this.f43467zzb).add(i, obj2);
        zzap.zzd(this.f43472zzf);
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
        boolean zAddAll = ((List) this.f43467zzb).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        zzap.zzf(this.f43472zzf, this.f43467zzb.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f43467zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        zzb();
        return ((List) this.f43467zzb).indexOf(obj2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        zzb();
        return ((List) this.f43467zzb).lastIndexOf(obj2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzan(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f43467zzb).remove(i);
        zzap.zze(this.f43472zzf);
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj2) {
        zzb();
        return ((List) this.f43467zzb).set(i, obj2);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        zzap zzapVar = this.f43472zzf;
        Object obj2 = this.f43466zza;
        List listSubList = ((List) this.f43467zzb).subList(i, i2);
        zzam zzamVar = this.f43468zzc;
        if (zzamVar == null) {
            zzamVar = this;
        }
        return zzapVar.zzi(obj2, listSubList, zzamVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzan(this, i);
    }
}
