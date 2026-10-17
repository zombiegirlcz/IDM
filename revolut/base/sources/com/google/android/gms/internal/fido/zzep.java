package com.google.android.gms.internal.fido;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes16.dex */
final class zzep extends zzev {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzep f39412zza = new zzep(zzev.zze());

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final AtomicReference f39413zzb;

    public zzep(zzev zzevVar) {
        this.f39413zzb = new AtomicReference(zzevVar);
    }

    public static final zzep zzb() {
        return f39412zza;
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final zzdr zza() {
        return ((zzev) this.f39413zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final zzfi zzc() {
        return ((zzev) this.f39413zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final boolean zzd(String str, Level level, boolean z) {
        ((zzev) this.f39413zzb.get()).zzd(str, level, z);
        return false;
    }
}
