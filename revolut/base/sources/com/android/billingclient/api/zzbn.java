package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzbn extends ResultReceiver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ InAppMessageResponseListener f25892zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(BillingClientImpl billingClientImpl, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.f25892zza = inAppMessageResponseListener;
        Objects.requireNonNull(billingClientImpl);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f25892zza.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient"));
    }
}
