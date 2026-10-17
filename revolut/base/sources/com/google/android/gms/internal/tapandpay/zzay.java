package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzay extends zzau {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzay f46321zza;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object[] f46322zzd;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f46323zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final transient Object[] f46324zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final transient int f46325zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final transient int f46326zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final transient int f46327zzg;

    static {
        Object[] objArr = new Object[0];
        f46322zzd = objArr;
        f46321zza = new zzay(objArr, 0, objArr, 0, 0);
    }

    public zzay(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f46323zzb = objArr;
        this.f46325zze = i;
        this.f46324zzc = objArr2;
        this.f46326zzf = i2;
        this.f46327zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Object[] objArr = this.f46324zzc;
        if (obj2 == null || objArr.length == 0) {
            return false;
        }
        int iZza = zzap.zza(obj2.hashCode());
        while (true) {
            int i = iZza & this.f46326zzf;
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

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f46325zze;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46327zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f46323zzb, 0, objArr, 0, this.f46327zzg);
        return this.f46327zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.f46327zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzba iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.f46323zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau
    public final zzat zzh() {
        return zzat.zzg(this.f46323zzb, this.f46327zzg);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau
    public final boolean zzj() {
        return true;
    }
}
