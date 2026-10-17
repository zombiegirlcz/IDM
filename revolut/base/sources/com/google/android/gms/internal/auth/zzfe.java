package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfe extends zzdr implements RandomAccess, zzff {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @Deprecated
    public static final zzff f39053zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfe f39054zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final List f39055zzc;

    static {
        zzfe zzfeVar = new zzfe(false);
        f39054zzb = zzfeVar;
        f39053zza = zzfeVar;
    }

    public zzfe() {
        this(10);
    }

    private static String zzh(Object obj2) {
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof zzef ? ((zzef) obj2).zzl(zzfa.f39046zzb) : zzfa.zzd((byte[]) obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj2) {
        zza();
        this.f39055zzc.add(i, (String) obj2);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean zAddAll = this.f39055zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.f39055zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object objRemove = this.f39055zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzh(objRemove);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        zza();
        return zzh(this.f39055zzc.set(i, (String) obj2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39055zzc.size();
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f39055zzc);
        return new zzfe(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return zzc() ? new zzhe(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj2 = this.f39055zzc.get(i);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof zzef) {
            zzef zzefVar = (zzef) obj2;
            String strZzl = zzefVar.zzl(zzfa.f39046zzb);
            if (zzefVar.zzh()) {
                this.f39055zzc.set(i, strZzl);
            }
            return strZzl;
        }
        byte[] bArr = (byte[]) obj2;
        String strZzd = zzfa.zzd(bArr);
        if (zzhn.zzb(bArr)) {
            this.f39055zzc.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.f39055zzc);
    }

    public zzfe(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f39055zzc = arrayList;
    }

    private zzfe(ArrayList arrayList) {
        super(true);
        this.f39055zzc = arrayList;
    }

    private zzfe(boolean z) {
        super(false);
        this.f39055zzc = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
