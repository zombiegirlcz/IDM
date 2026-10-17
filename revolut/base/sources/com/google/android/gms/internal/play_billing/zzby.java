package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzby {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object[] f45858zza = new Object[8];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f45859zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    zzbx f45860zzc;

    public final zzby zza(Object obj2, Object obj3) {
        int i = this.f45859zzb + 1;
        Object[] objArr = this.f45858zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 > length) {
                length = length + (length >> 1) + 1;
                if (length < i2) {
                    int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.f45858zza = Arrays.copyOf(objArr, length);
        }
        zzbr.zza(obj2, obj3);
        Object[] objArr2 = this.f45858zza;
        int i3 = this.f45859zzb;
        int i5 = i3 + i3;
        objArr2[i5] = obj2;
        objArr2[i5 + 1] = obj3;
        this.f45859zzb = i3 + 1;
        return this;
    }

    public final zzbz zzb() {
        zzbx zzbxVar = this.f45860zzc;
        if (zzbxVar != null) {
            throw zzbxVar.zza();
        }
        zzci zzciVarZzg = zzci.zzg(this.f45859zzb, this.f45858zza, this);
        zzbx zzbxVar2 = this.f45860zzc;
        if (zzbxVar2 == null) {
            return zzciVarZzg;
        }
        throw zzbxVar2.zza();
    }
}
