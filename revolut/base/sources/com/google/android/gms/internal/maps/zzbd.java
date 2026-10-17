package com.google.android.gms.internal.maps;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzbd extends zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzbd f39797zza;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object[] f39798zzd;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f39799zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final transient Object[] f39800zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final transient int f39801zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final transient int f39802zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final transient int f39803zzg;

    static {
        Object[] objArr = new Object[0];
        f39798zzd = objArr;
        f39797zza = new zzbd(objArr, 0, objArr, 0, 0);
    }

    public zzbd(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f39799zzb = objArr;
        this.f39801zze = i;
        this.f39800zzc = objArr2;
        this.f39802zzf = i2;
        this.f39803zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        if (obj2 != null) {
            Object[] objArr = this.f39800zzc;
            if (objArr.length != 0) {
                int iZza = zzav.zza(obj2.hashCode());
                while (true) {
                    int i = iZza & this.f39802zzf;
                    Object obj3 = objArr[i];
                    if (obj3 == null) {
                        return false;
                    }
                    if (obj3.equals(obj2)) {
                        return true;
                    }
                    iZza = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.maps.zzba, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f39801zze;
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39803zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f39799zzb, 0, objArr, 0, this.f39803zzg);
        return this.f39803zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.f39803zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw
    /* JADX INFO: renamed from: zzd */
    public final zzbf iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.f39799zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzba
    public final zzaz zzh() {
        return zzaz.zzg(this.f39799zzb, this.f39803zzg);
    }

    @Override // com.google.android.gms.internal.maps.zzba
    public final boolean zzj() {
        return true;
    }
}
