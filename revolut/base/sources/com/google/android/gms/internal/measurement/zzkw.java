package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzkw extends zzkx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzld f40402zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f40403zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f40404zzc;

    public zzkw(zzld zzldVar) {
        this.f40402zza = zzldVar;
        this.f40404zzc = zzldVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40403zzb < this.f40404zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final byte zza() {
        int i = this.f40403zzb;
        if (i >= this.f40404zzc) {
            throw new NoSuchElementException();
        }
        this.f40403zzb = i + 1;
        return this.f40402zza.zzb(i);
    }
}
