package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzaw implements Iterator {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f44456zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    int f44457zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    int f44458zzd = -1;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzba f44459zze;

    public /* synthetic */ zzaw(zzba zzbaVar, zzav zzavVar) {
        this.f44459zze = zzbaVar;
        this.f44456zzb = zzbaVar.f44470zzf;
        this.f44457zzc = zzbaVar.zze();
    }

    private final void zzb() {
        if (this.f44459zze.f44470zzf != this.f44456zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44457zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f44457zzc;
        this.f44458zzd = i;
        Object objZza = zza(i);
        this.f44457zzc = this.f44459zze.zzf(this.f44457zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzx.zzd(this.f44458zzd >= 0, "no calls to next() since the last call to remove()");
        this.f44456zzb += 32;
        int i = this.f44458zzd;
        zzba zzbaVar = this.f44459zze;
        zzbaVar.remove(zzba.zzg(zzbaVar, i));
        this.f44457zzc--;
        this.f44458zzd = -1;
    }

    public abstract Object zza(int i);
}
