package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzcg extends zzca {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzbz f45873zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final transient zzbw f45874zzb;

    public zzcg(zzbz zzbzVar, zzbw zzbwVar) {
        this.f45873zza = zzbzVar;
        this.f45874zzb = zzbwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f45873zza.get(obj2) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f45874zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f45873zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int zza(Object[] objArr, int i) {
        return this.f45874zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt
    public final zzbw zzd() {
        return this.f45874zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: zze */
    public final zzck iterator() {
        return this.f45874zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        throw null;
    }
}
