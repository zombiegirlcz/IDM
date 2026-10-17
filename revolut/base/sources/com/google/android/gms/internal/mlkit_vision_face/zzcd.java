package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzcd extends zzbn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzce f43524zza;

    public zzcd(zzce zzceVar) {
        this.f43524zza = zzceVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzab.zza(i, this.f43524zza.f43527zzc, "index");
        zzce zzceVar = this.f43524zza;
        int i2 = i + i;
        Object obj2 = zzceVar.f43526zzb[i2];
        obj2.getClass();
        Object obj3 = zzceVar.f43526zzb[i2 + 1];
        obj3.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43524zza.f43527zzc;
    }
}
