package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzic extends LruCache {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzif f47118zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzic(zzif zzifVar, int i) {
        super(20);
        this.f47118zza = zzifVar;
    }

    @Override // androidx.collection.LruCache
    public final /* bridge */ /* synthetic */ Object create(Object obj2) {
        String str = (String) obj2;
        Preconditions.checkNotEmpty(str);
        zzif zzifVar = this.f47118zza;
        return zzifVar.zzu.zzf().zzx(null, zzgi.zzbn) ? zzif.zze(zzifVar, str) : zzif.zzd(zzifVar, str);
    }
}
