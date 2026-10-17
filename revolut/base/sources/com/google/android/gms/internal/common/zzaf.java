package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzah f39230zza;

    public zzaf(zzah zzahVar) {
        this.f39230zza = zzahVar;
    }

    private final int zzs(int i) {
        return (this.f39230zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return this.f39230zza.contains(obj2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzah zzahVar = this.f39230zza;
        zzr.zzb(i, zzahVar.size(), "index");
        return zzahVar.get(zzs(i));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj2) {
        int iLastIndexOf = this.f39230zza.lastIndexOf(obj2);
        if (iLastIndexOf >= 0) {
            return zzs(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj2) {
        int iIndexOf = this.f39230zza.indexOf(obj2);
        if (iIndexOf >= 0) {
            return zzs(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39230zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return this.f39230zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.f39230zza;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i, int i2) {
        zzah zzahVar = this.f39230zza;
        zzr.zzd(i, i2, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).zzh();
    }
}
