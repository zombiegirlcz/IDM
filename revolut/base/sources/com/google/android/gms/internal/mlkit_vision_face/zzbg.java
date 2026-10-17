package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class zzbg extends zzbh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object[] f43500zza = new Object[4];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f43501zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    boolean f43502zzc;

    public zzbg(int i) {
    }

    private final void zzb(int i) {
        Object[] objArr = this.f43500zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.f43502zzc) {
                this.f43500zza = (Object[]) objArr.clone();
                this.f43502zzc = false;
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
        this.f43500zza = Arrays.copyOf(objArr, i2);
        this.f43502zzc = false;
    }

    public final zzbg zza(Object obj2) {
        obj2.getClass();
        zzb(this.f43501zzb + 1);
        Object[] objArr = this.f43500zza;
        int i = this.f43501zzb;
        this.f43501zzb = i + 1;
        objArr[i] = obj2;
        return this;
    }
}
