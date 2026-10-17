package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.util.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzni extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzny f47526zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzni(zzny zznyVar, zzjs zzjsVar) {
        super(zzjsVar);
        this.f47526zza = zznyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        a.C(this.f47526zza.zzu, "Tasks have been queued for a long time");
    }
}
