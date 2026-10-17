package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class zzco extends zzcp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object[] f41311zza = new Object[4];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f41312zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    boolean f41313zzc;

    public zzco(int i) {
    }

    private final void zzd(int i) {
        Object[] objArr = this.f41311zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.f41313zzc) {
                this.f41311zza = (Object[]) objArr.clone();
                this.f41313zzc = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f41311zza = Arrays.copyOf(objArr, i2);
        this.f41313zzc = false;
    }

    public final zzco zza(Object obj2) {
        obj2.getClass();
        zzd(this.f41312zzb + 1);
        Object[] objArr = this.f41311zza;
        int i = this.f41312zzb;
        this.f41312zzb = i + 1;
        objArr[i] = obj2;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public /* bridge */ /* synthetic */ zzcp zzb(Object obj2) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcp zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.f41312zzb);
            if (iterable instanceof zzcq) {
                this.f41312zzb = ((zzcq) iterable).zza(this.f41311zza, this.f41312zzb);
                return this;
            }
        }
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            zzb(it8.next());
        }
        return this;
    }
}
