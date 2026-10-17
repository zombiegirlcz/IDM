package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object[] f40718zza = new Object[8];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f40719zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    zzag f40720zzc;

    public final zzah zza(Object obj2, Object obj3) {
        int i = this.f40719zzb + 1;
        Object[] objArr = this.f40718zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f40718zza = Arrays.copyOf(objArr, zzaa.zza(length, i2));
        }
        zzw.zza(obj2, obj3);
        Object[] objArr2 = this.f40718zza;
        int i3 = this.f40719zzb;
        int i5 = i3 + i3;
        objArr2[i5] = obj2;
        objArr2[i5 + 1] = obj3;
        this.f40719zzb = i3 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.f40720zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.f40719zzb, this.f40718zza, this);
        zzag zzagVar2 = this.f40720zzc;
        if (zzagVar2 == null) {
            return zzaqVarZzg;
        }
        throw zzagVar2.zza();
    }
}
