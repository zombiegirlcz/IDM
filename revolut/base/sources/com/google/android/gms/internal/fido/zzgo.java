package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzgo extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzgx f39493zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39494zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f39495zzc;

    public zzgo(zzgx zzgxVar) {
        this.f39493zza = zzgxVar;
        this.f39495zzc = zzgxVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39494zzb < this.f39495zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgs
    public final byte zza() {
        int i = this.f39494zzb;
        if (i >= this.f39495zzc) {
            throw new NoSuchElementException();
        }
        this.f39494zzb = i + 1;
        return this.f39493zza.zzb(i);
    }
}
