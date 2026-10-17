package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes16.dex */
final class zzdf extends zzaa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ BaseImplementation.ResultHolder f39687zza;

    public zzdf(BaseImplementation.ResultHolder resultHolder) {
        this.f39687zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.identity.zzab
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.f39687zza.setResult(locationSettingsResult);
    }
}
