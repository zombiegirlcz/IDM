package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
class zzj extends zzk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object[] f43343zza = new Object[4];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f43344zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    boolean f43345zzc;

    public zzj(int i) {
    }

    private final void zzb(int i) {
        Object[] objArr = this.f43343zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.f43345zzc) {
                this.f43343zza = (Object[]) objArr.clone();
                this.f43345zzc = false;
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
        this.f43343zza = Arrays.copyOf(objArr, i2);
        this.f43345zzc = false;
    }

    public final zzj zza(Object obj2) {
        obj2.getClass();
        zzb(this.f43344zzb + 1);
        Object[] objArr = this.f43343zza;
        int i = this.f43344zzb;
        this.f43344zzb = i + 1;
        objArr[i] = obj2;
        return this;
    }
}
