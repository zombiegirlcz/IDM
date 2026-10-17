package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzkr extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlw f47315zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkr(zzlw zzlwVar, zzjs zzjsVar) {
        super(zzjsVar);
        this.f47315zza = zzlwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        final zzlw zzlwVarZzq = this.f47315zza.zzu.zzq();
        Objects.requireNonNull(zzlwVarZzq);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkq
            @Override // java.lang.Runnable
            public final void run() {
                zzlwVarZzq.zzL();
            }
        }).start();
    }
}
