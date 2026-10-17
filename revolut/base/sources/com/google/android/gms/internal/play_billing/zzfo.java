package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzfo extends zzeh implements RandomAccess, zzfz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final float[] f46014zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private float[] f46015zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f46016zzc;

    static {
        float[] fArr = new float[0];
        f46014zza = fArr;
        new zzfo(fArr, 0, false);
    }

    public zzfo() {
        this(f46014zza, 0, true);
    }

    private static int zzh(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzi(int i) {
        return d.g(i, this.f46016zzc, "Index:", ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.f46016zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        float fFloatValue = ((Float) obj2).floatValue();
        zza();
        if (i < 0 || i > (i2 = this.f46016zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        float[] fArr = this.f46015zzb;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.f46015zzb, 0, fArr2, 0, i);
            System.arraycopy(this.f46015zzb, i, fArr2, i3, this.f46016zzc - i);
            this.f46015zzb = fArr2;
        }
        this.f46015zzb[i] = fFloatValue;
        this.f46016zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzga.f46030zzb;
        collection.getClass();
        if (!(collection instanceof zzfo)) {
            return super.addAll(collection);
        }
        zzfo zzfoVar = (zzfo) collection;
        int i = zzfoVar.f46016zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f46016zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f46015zzb;
        if (i3 > fArr.length) {
            this.f46015zzb = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzfoVar.f46015zzb, 0, this.f46015zzb, this.f46016zzc, zzfoVar.f46016zzc);
        this.f46016zzc = i3;
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
        if (!(obj2 instanceof zzfo)) {
            return super.equals(obj2);
        }
        zzfo zzfoVar = (zzfo) obj2;
        if (this.f46016zzc != zzfoVar.f46016zzc) {
            return false;
        }
        float[] fArr = zzfoVar.f46015zzb;
        for (int i = 0; i < this.f46016zzc; i++) {
            if (Float.floatToIntBits(this.f46015zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Float.valueOf(this.f46015zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f46016zzc; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f46015zzb[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj2).floatValue();
        int i = this.f46016zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f46015zzb[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzj(i);
        float[] fArr = this.f46015zzb;
        float f = fArr[i];
        if (i < this.f46016zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f46016zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f46015zzb;
        System.arraycopy(fArr, i2, fArr, i, this.f46016zzc - i2);
        this.f46016zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        zza();
        zzj(i);
        float[] fArr = this.f46015zzb;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46016zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final /* bridge */ /* synthetic */ zzfz zzd(int i) {
        if (i >= this.f46016zzc) {
            return new zzfo(i == 0 ? f46014zza : Arrays.copyOf(this.f46015zzb, i), this.f46016zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i) {
        zzj(i);
        return this.f46015zzb[i];
    }

    public final void zzf(float f) {
        zza();
        int i = this.f46016zzc;
        int length = this.f46015zzb.length;
        if (i == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.f46015zzb, 0, fArr, 0, this.f46016zzc);
            this.f46015zzb = fArr;
        }
        float[] fArr2 = this.f46015zzb;
        int i2 = this.f46016zzc;
        this.f46016zzc = i2 + 1;
        fArr2[i2] = f;
    }

    public final void zzg(int i) {
        int length = this.f46015zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f46015zzb = new float[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.f46015zzb = Arrays.copyOf(this.f46015zzb, length);
    }

    private zzfo(float[] fArr, int i, boolean z) {
        super(z);
        this.f46015zzb = fArr;
        this.f46016zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzf(((Float) obj2).floatValue());
        return true;
    }
}
