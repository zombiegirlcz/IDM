package com.google.android.gms.internal.fido;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzff extends AbstractSet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final int f39437zza = -1;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzfg f39438zzb;

    public zzff(zzfg zzfgVar, int i) {
        this.f39438zzb = zzfgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return Arrays.binarySearch(this.f39438zzb.f39440zzb, zzb(), zza(), obj2, this.f39437zza == -1 ? zzfg.f39439zza : zzfi.f39450zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfe(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    public final int zza() {
        return this.f39438zzb.f39441zzc[this.f39437zza + 1];
    }

    public final int zzb() {
        if (this.f39437zza == -1) {
            return 0;
        }
        return this.f39438zzb.f39441zzc[0];
    }
}
