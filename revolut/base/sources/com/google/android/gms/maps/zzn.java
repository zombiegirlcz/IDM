package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;

/* JADX INFO: loaded from: classes16.dex */
final class zzn extends com.google.android.gms.maps.internal.zzw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleMap.OnCircleClickListener f46814zza;

    public zzn(GoogleMap googleMap, GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.f46814zza = onCircleClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zzb(com.google.android.gms.internal.maps.zzl zzlVar) {
        this.f46814zza.onCircleClick(new Circle(zzlVar));
    }
}
