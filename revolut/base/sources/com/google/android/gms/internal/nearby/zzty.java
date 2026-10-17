package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes16.dex */
final class zzty extends zztt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzua f45731zza;

    public zzty(zzua zzuaVar, int i) {
        super(zzuaVar.size(), i);
        this.f45731zza = zzuaVar;
    }

    @Override // com.google.android.gms.internal.nearby.zztt
    public final Object zza(int i) {
        return this.f45731zza.get(i);
    }
}
