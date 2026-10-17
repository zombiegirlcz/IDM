package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzac extends zzz {
    public zzac() {
        super(4);
    }

    public final zzac zzb(Object obj2) {
        obj2.getClass();
        int i = this.f41234zzb + 1;
        Object[] objArr = this.f41233zza;
        int length = objArr.length;
        if (length < i) {
            this.f41233zza = Arrays.copyOf(objArr, zzaa.zza(length, i));
            this.f41235zzc = false;
        } else if (this.f41235zzc) {
            this.f41233zza = (Object[]) objArr.clone();
            this.f41235zzc = false;
        }
        Object[] objArr2 = this.f41233zza;
        int i2 = this.f41234zzb;
        this.f41234zzb = i2 + 1;
        objArr2[i2] = obj2;
        return this;
    }

    public final zzaf zzc() {
        this.f41235zzc = true;
        return zzaf.zzg(this.f41233zza, this.f41234zzb);
    }
}
