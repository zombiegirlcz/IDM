package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzch implements Iterator {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    int f41292zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    int f41293zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    int f41294zzd = -1;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzcl f41295zze;

    public /* synthetic */ zzch(zzcl zzclVar, zzcg zzcgVar) {
        this.f41295zze = zzclVar;
        this.f41292zzb = zzclVar.f41306zzf;
        this.f41293zzc = zzclVar.zze();
    }

    private final void zzb() {
        if (this.f41295zze.f41306zzf != this.f41292zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41293zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41293zzc;
        this.f41294zzd = i;
        Object objZza = zza(i);
        this.f41293zzc = this.f41295zze.zzf(this.f41293zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzbc.zze(this.f41294zzd >= 0, "no calls to next() since the last call to remove()");
        this.f41292zzb += 32;
        zzcl zzclVar = this.f41295zze;
        int i = this.f41294zzd;
        Object[] objArr = zzclVar.f41303zzb;
        objArr.getClass();
        zzclVar.remove(objArr[i]);
        this.f41293zzc--;
        this.f41294zzd = -1;
    }

    public abstract Object zza(int i);
}
