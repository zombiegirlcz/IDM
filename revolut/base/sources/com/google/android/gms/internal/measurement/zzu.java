package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzu extends zzai {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Callable f40702zza;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.f40702zza = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        try {
            return zzi.zzb(this.f40702zza.call());
        } catch (Exception unused) {
            return zzap.f39833zzf;
        }
    }
}
