package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzs extends zzo {

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    final /* synthetic */ zzt f46289zzg;

    public zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.f46289zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final String zza() {
        zzp zzpVar = (zzp) this.f46289zzg.f46290zza.get();
        return zzpVar == null ? "Completer object has been garbage collected, future will fail soon" : a.p("tag=[", String.valueOf(zzpVar.f46285zza), "]");
    }
}
