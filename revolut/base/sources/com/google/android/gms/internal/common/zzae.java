package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes16.dex */
final class zzae extends zzz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzah f39229zza;

    public zzae(zzah zzahVar, int i) {
        super(zzahVar.size(), i);
        this.f39229zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i) {
        return this.f39229zza.get(i);
    }
}
