package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzen extends zzeo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzev f45967zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f45968zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f45969zzc;

    public zzen(zzev zzevVar) {
        Objects.requireNonNull(zzevVar);
        this.f45967zza = zzevVar;
        this.f45968zzb = 0;
        this.f45969zzc = zzevVar.zze();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45968zzb < this.f45969zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeq
    public final byte zza() {
        int i = this.f45968zzb;
        if (i >= this.f45969zzc) {
            throw new NoSuchElementException();
        }
        this.f45968zzb = i + 1;
        return this.f45967zza.zzb(i);
    }
}
