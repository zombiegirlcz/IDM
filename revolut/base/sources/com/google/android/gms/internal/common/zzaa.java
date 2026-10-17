package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
class zzaa extends zzab {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object[] f39225zza = new Object[4];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f39226zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    boolean f39227zzc;

    public zzaa(int i) {
    }

    public final zzaa zza(Object obj2) {
        int i;
        obj2.getClass();
        int length = this.f39225zza.length;
        int i2 = this.f39226zzb;
        int i3 = i2 + 1;
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i3 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i3) {
                int iHighestOneBit = Integer.highestOneBit(i2);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.f39227zzc) {
            this.f39225zza = Arrays.copyOf(this.f39225zza, i);
            this.f39227zzc = false;
        }
        Object[] objArr = this.f39225zza;
        int i5 = this.f39226zzb;
        this.f39226zzb = i5 + 1;
        objArr[i5] = obj2;
        return this;
    }
}
