package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes16.dex */
final class zzt extends com.google.android.gms.maps.internal.zzj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ LocationSource f46820zza;

    public zzt(GoogleMap googleMap, LocationSource locationSource) {
        this.f46820zza = locationSource;
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.f46820zza.activate(new zzl(this, zzajVar));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.f46820zza.deactivate();
    }
}
