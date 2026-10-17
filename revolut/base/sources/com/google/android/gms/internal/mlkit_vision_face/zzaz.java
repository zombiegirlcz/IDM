package com.google.android.gms.internal.mlkit_vision_face;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzaz implements Iterator {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f43481zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    int f43482zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    int f43483zzd = -1;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzbd f43484zze;

    public /* synthetic */ zzaz(zzbd zzbdVar, zzav zzavVar) {
        this.f43484zze = zzbdVar;
        this.f43481zzb = zzbdVar.f43495zzf;
        this.f43482zzc = zzbdVar.zze();
    }

    private final void zzb() {
        if (this.f43484zze.f43495zzf != this.f43481zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43482zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f43482zzc;
        this.f43483zzd = i;
        Object objZza = zza(i);
        this.f43482zzc = this.f43484zze.zzf(this.f43482zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzab.zzd(this.f43483zzd >= 0, "no calls to next() since the last call to remove()");
        this.f43481zzb += 32;
        zzbd zzbdVar = this.f43484zze;
        zzbdVar.remove(zzbd.zzg(zzbdVar, this.f43483zzd));
        this.f43482zzc--;
        this.f43483zzd = -1;
    }

    public abstract Object zza(int i);
}
