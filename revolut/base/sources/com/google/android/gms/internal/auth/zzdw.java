package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
final class zzdw extends zzdy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzef f39004zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39005zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f39006zzc;

    public zzdw(zzef zzefVar) {
        this.f39004zza = zzefVar;
        this.f39006zzc = zzefVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39005zzb < this.f39006zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzea
    public final byte zza() {
        int i = this.f39005zzb;
        if (i >= this.f39006zzc) {
            throw new NoSuchElementException();
        }
        this.f39005zzb = i + 1;
        return this.f39004zza.zzb(i);
    }
}
