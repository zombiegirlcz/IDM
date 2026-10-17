package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzgp extends zzeh implements RandomAccess, zzfz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final long[] f46051zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private long[] f46052zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f46053zzc;

    static {
        long[] jArr = new long[0];
        f46051zza = jArr;
        new zzgp(jArr, 0, false);
    }

    public zzgp() {
        this(f46051zza, 0, true);
    }

    private static int zzh(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzi(int i) {
        return d.g(i, this.f46053zzc, "Index:", ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.f46053zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        long jLongValue = ((Long) obj2).longValue();
        zza();
        if (i < 0 || i > (i2 = this.f46053zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        long[] jArr = this.f46052zzb;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzh(length)];
            System.arraycopy(this.f46052zzb, 0, jArr2, 0, i);
            System.arraycopy(this.f46052zzb, i, jArr2, i3, this.f46053zzc - i);
            this.f46052zzb = jArr2;
        }
        this.f46052zzb[i] = jLongValue;
        this.f46053zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzga.f46030zzb;
        collection.getClass();
        if (!(collection instanceof zzgp)) {
            return super.addAll(collection);
        }
        zzgp zzgpVar = (zzgp) collection;
        int i = zzgpVar.f46053zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f46053zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f46052zzb;
        if (i3 > jArr.length) {
            this.f46052zzb = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzgpVar.f46052zzb, 0, this.f46052zzb, this.f46053zzc, zzgpVar.f46053zzc);
        this.f46053zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzgp)) {
            return super.equals(obj2);
        }
        zzgp zzgpVar = (zzgp) obj2;
        if (this.f46053zzc != zzgpVar.f46053zzc) {
            return false;
        }
        long[] jArr = zzgpVar.f46052zzb;
        for (int i = 0; i < this.f46053zzc; i++) {
            if (this.f46052zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Long.valueOf(this.f46052zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f46053zzc; i2++) {
            long j2 = this.f46052zzb[i2];
            byte[] bArr = zzga.f46030zzb;
            i = (i * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj2).longValue();
        int i = this.f46053zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f46052zzb[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzj(i);
        long[] jArr = this.f46052zzb;
        long j2 = jArr[i];
        if (i < this.f46053zzc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f46053zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f46052zzb;
        System.arraycopy(jArr, i2, jArr, i, this.f46053zzc - i2);
        this.f46053zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        long jLongValue = ((Long) obj2).longValue();
        zza();
        zzj(i);
        long[] jArr = this.f46052zzb;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46053zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final /* bridge */ /* synthetic */ zzfz zzd(int i) {
        if (i >= this.f46053zzc) {
            return new zzgp(i == 0 ? f46051zza : Arrays.copyOf(this.f46052zzb, i), this.f46053zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i) {
        zzj(i);
        return this.f46052zzb[i];
    }

    public final void zzf(long j2) {
        zza();
        int i = this.f46053zzc;
        int length = this.f46052zzb.length;
        if (i == length) {
            long[] jArr = new long[zzh(length)];
            System.arraycopy(this.f46052zzb, 0, jArr, 0, this.f46053zzc);
            this.f46052zzb = jArr;
        }
        long[] jArr2 = this.f46052zzb;
        int i2 = this.f46053zzc;
        this.f46053zzc = i2 + 1;
        jArr2[i2] = j2;
    }

    public final void zzg(int i) {
        int length = this.f46052zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f46052zzb = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.f46052zzb = Arrays.copyOf(this.f46052zzb, length);
    }

    private zzgp(long[] jArr, int i, boolean z) {
        super(z);
        this.f46052zzb = jArr;
        this.f46053zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzf(((Long) obj2).longValue());
        return true;
    }
}
