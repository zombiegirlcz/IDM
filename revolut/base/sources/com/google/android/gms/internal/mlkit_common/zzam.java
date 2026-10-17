package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzam extends zzaf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzan f40728zza;

    public zzam(zzan zzanVar) {
        this.f40728zza = zzanVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzt.zza(i, this.f40728zza.f40731zzc, "index");
        int i2 = i + i;
        Object obj2 = this.f40728zza.f40730zzb[i2];
        Objects.requireNonNull(obj2);
        Object obj3 = this.f40728zza.f40730zzb[i2 + 1];
        Objects.requireNonNull(obj3);
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40728zza.f40731zzc;
    }
}
