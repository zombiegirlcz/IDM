package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzci extends zzce {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcj f39330zza;

    public zzci(zzcj zzcjVar) {
        this.f39330zza = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: zzd */
    public final zzdc iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzce
    public final zzcd zzf() {
        return this.f39330zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzj() {
        return new zzch(this);
    }
}
