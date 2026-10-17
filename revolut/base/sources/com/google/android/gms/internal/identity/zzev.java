package com.google.android.gms.internal.identity;

/* JADX INFO: loaded from: classes16.dex */
final class zzev extends zzet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzex f39759zza;

    public zzev(zzex zzexVar, int i) {
        super(zzexVar.size(), i);
        this.f39759zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.identity.zzet
    public final Object zza(int i) {
        return this.f39759zza.get(i);
    }
}
