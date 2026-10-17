package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.tapandpay.zzah;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final ListenerHolder.Notifier f48750zza = new zzc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f48751zzb;

    public zzd(BaseImplementation.ResultHolder resultHolder, ListenerHolder listenerHolder) {
        this.f48751zzb = listenerHolder;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zza() {
        this.f48751zzb.notifyListener(f48750zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzb(Status status) {
    }
}
