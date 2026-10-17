package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzch extends zzcc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzci f39329zza;

    public zzch(zzci zzciVar) {
        this.f39329zza = zzciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.f39329zza.f39330zza.f39333zzd.f39352zzd.get(i), this.f39329zza.f39330zza.f39334zze.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39329zza.f39330zza.size();
    }
}
