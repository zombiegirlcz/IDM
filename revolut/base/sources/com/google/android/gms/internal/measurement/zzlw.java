package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzlw extends zzkq implements RandomAccess, zzmj, zzno {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final float[] f40450zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private float[] f40451zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f40452zzc;

    static {
        float[] fArr = new float[0];
        f40450zza = fArr;
        new zzlw(fArr, 0, false);
    }

    public zzlw() {
        this(f40450zza, 0, true);
    }

    private static int zzh(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzi(int i) {
        return d.g(i, this.f40452zzc, "Index:", ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.f40452zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        float fFloatValue = ((Float) obj2).floatValue();
        zzcE();
        if (i < 0 || i > (i2 = this.f40452zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        float[] fArr = this.f40451zzb;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.f40451zzb, 0, fArr2, 0, i);
            System.arraycopy(this.f40451zzb, i, fArr2, i3, this.f40452zzc - i);
            this.f40451zzb = fArr2;
        }
        this.f40451zzb[i] = fFloatValue;
        this.f40452zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.f40466zzb;
        collection.getClass();
        if (!(collection instanceof zzlw)) {
            return super.addAll(collection);
        }
        zzlw zzlwVar = (zzlw) collection;
        int i = zzlwVar.f40452zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40452zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f40451zzb;
        if (i3 > fArr.length) {
            this.f40451zzb = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzlwVar.f40451zzb, 0, this.f40451zzb, this.f40452zzc, zzlwVar.f40452zzc);
        this.f40452zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzlw)) {
            return super.equals(obj2);
        }
        zzlw zzlwVar = (zzlw) obj2;
        if (this.f40452zzc != zzlwVar.f40452zzc) {
            return false;
        }
        float[] fArr = zzlwVar.f40451zzb;
        for (int i = 0; i < this.f40452zzc; i++) {
            if (Float.floatToIntBits(this.f40451zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Float.valueOf(this.f40451zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f40452zzc; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f40451zzb[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj2).floatValue();
        int i = this.f40452zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40451zzb[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzcE();
        zzj(i);
        float[] fArr = this.f40451zzb;
        float f = fArr[i];
        if (i < this.f40452zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f40452zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f40451zzb;
        System.arraycopy(fArr, i2, fArr, i, this.f40452zzc - i2);
        this.f40452zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        zzcE();
        zzj(i);
        float[] fArr = this.f40451zzb;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40452zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmj zzd(int i) {
        if (i >= this.f40452zzc) {
            return new zzlw(i == 0 ? f40450zza : Arrays.copyOf(this.f40451zzb, i), this.f40452zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i) {
        zzj(i);
        return this.f40451zzb[i];
    }

    public final void zzf(float f) {
        zzcE();
        int i = this.f40452zzc;
        int length = this.f40451zzb.length;
        if (i == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.f40451zzb, 0, fArr, 0, this.f40452zzc);
            this.f40451zzb = fArr;
        }
        float[] fArr2 = this.f40451zzb;
        int i2 = this.f40452zzc;
        this.f40452zzc = i2 + 1;
        fArr2[i2] = f;
    }

    public final void zzg(int i) {
        int length = this.f40451zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f40451zzb = new float[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.f40451zzb = Arrays.copyOf(this.f40451zzb, length);
    }

    private zzlw(float[] fArr, int i, boolean z) {
        super(z);
        this.f40451zzb = fArr;
        this.f40452zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzf(((Float) obj2).floatValue());
        return true;
    }
}
