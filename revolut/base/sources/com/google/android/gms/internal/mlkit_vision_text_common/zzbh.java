package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbh extends zzbd {
    public zzbh() {
        super(4);
    }

    public final zzbh zza(Object obj2) {
        obj2.getClass();
        int i = this.f44476zzb;
        int i2 = i + 1;
        Object[] objArr = this.f44475zza;
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
            this.f44475zza = Arrays.copyOf(objArr, i3);
            this.f44477zzc = false;
        } else if (this.f44477zzc) {
            this.f44475zza = (Object[]) objArr.clone();
            this.f44477zzc = false;
        }
        Object[] objArr2 = this.f44475zza;
        int i5 = this.f44476zzb;
        this.f44476zzb = i5 + 1;
        objArr2[i5] = obj2;
        return this;
    }

    public final zzbk zzb() {
        this.f44477zzc = true;
        return zzbk.zzg(this.f44475zza, this.f44476zzb);
    }
}
