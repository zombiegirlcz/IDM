package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: loaded from: classes16.dex */
final class zzce extends com.google.android.gms.internal.play_billing.zzal {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final ExternalOfferAvailabilityListener f25933zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzcz f25934zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f25935zzc;

    public /* synthetic */ zzce(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.f25933zza = externalOfferAvailabilityListener;
        this.f25934zzb = zzczVar;
        this.f25935zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcz zzczVar = this.f25934zzb;
            zzjd zzjdVar = zzjd.NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL;
            BillingResult billingResult = zzdc.f25982zzh;
            int i = zzcy.f25973zza;
            zzczVar.zzb(zzcy.zzb(zzjdVar, 23, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25935zzc);
            this.f25933zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            zzcz zzczVar2 = this.f25934zzb;
            zzjd zzjdVar2 = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = zzcy.f25973zza;
            zzczVar2.zzb(zzcy.zzb(zzjdVar2, 23, billingResultZza, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25935zzc);
        }
        this.f25933zza.onExternalOfferAvailabilityResponse(billingResultZza);
    }
}
