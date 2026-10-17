package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zznx implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzoa f40530zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f40531zzb = -1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f40532zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Iterator f40533zzd;

    public /* synthetic */ zznx(zzoa zzoaVar, zznz zznzVar) {
        this.f40530zza = zzoaVar;
    }

    private final Iterator zza() {
        if (this.f40533zzd == null) {
            this.f40533zzd = this.f40530zza.f40537zzc.entrySet().iterator();
        }
        return this.f40533zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f40531zzb + 1;
        zzoa zzoaVar = this.f40530zza;
        if (i >= zzoaVar.f40536zzb) {
            return !zzoaVar.f40537zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f40532zzc = true;
        int i = this.f40531zzb + 1;
        this.f40531zzb = i;
        zzoa zzoaVar = this.f40530zza;
        return i < zzoaVar.f40536zzb ? (zznw) zzoaVar.f40535zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40532zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f40532zzc = false;
        zzoa zzoaVar = this.f40530zza;
        zzoaVar.zzo();
        int i = this.f40531zzb;
        if (i >= zzoaVar.f40536zzb) {
            zza().remove();
        } else {
            this.f40531zzb = i - 1;
            zzoaVar.zzm(i);
        }
    }
}
