package com.google.android.gms.internal.nearby;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzub extends zztv {
    public zzub() {
        super(4);
    }

    public final zzub zza(Object obj2) {
        obj2.getClass();
        int i = this.f45728zzb;
        int i2 = i + 1;
        Object[] objArr = this.f45727zza;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f45727zza = Arrays.copyOf(objArr, i3);
            this.f45729zzc = false;
        } else if (this.f45729zzc) {
            this.f45727zza = (Object[]) objArr.clone();
            this.f45729zzc = false;
        }
        Object[] objArr2 = this.f45727zza;
        int i5 = this.f45728zzb;
        this.f45728zzb = i5 + 1;
        objArr2[i5] = obj2;
        return this;
    }

    public final zzuc zzb() {
        int i = this.f45728zzb;
        if (i == 0) {
            return zzug.f45745zza;
        }
        if (i == 1) {
            Object obj2 = this.f45727zza[0];
            obj2.getClass();
            return new zzuh(obj2);
        }
        zzuc zzucVarZzl = zzuc.zzl(i, this.f45727zza);
        this.f45728zzb = zzucVarZzl.size();
        this.f45729zzc = true;
        return zzucVarZzl;
    }
}
