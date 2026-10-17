package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzcu extends zzcf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcu f39344zza;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object[] f39345zzd;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f39346zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final transient Object[] f39347zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final transient int f39348zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final transient int f39349zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final transient int f39350zzg;

    static {
        Object[] objArr = new Object[0];
        f39345zzd = objArr;
        f39344zza = new zzcu(objArr, 0, objArr, 0, 0);
    }

    public zzcu(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f39346zzb = objArr;
        this.f39348zze = i;
        this.f39347zzc = objArr2;
        this.f39349zzf = i2;
        this.f39350zzg = i3;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        if (obj2 != null) {
            Object[] objArr = this.f39347zzc;
            if (objArr.length != 0) {
                int iZza = zzbx.zza(obj2.hashCode());
                while (true) {
                    int i = iZza & this.f39349zzf;
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

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f39348zze;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39350zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f39346zzb, 0, objArr, 0, this.f39350zzg);
        return this.f39350zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.f39350zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: zzd */
    public final zzdc iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.f39346zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final boolean zzg() {
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzj() {
        return zzcc.zzh(this.f39346zzb, this.f39350zzg);
    }
}
