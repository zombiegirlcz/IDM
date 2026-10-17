package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: loaded from: classes16.dex */
final class zzcd extends com.google.android.gms.internal.play_billing.zzaj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final AlternativeBillingOnlyAvailabilityListener f25930zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzcz f25931zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f25932zzc;

    public /* synthetic */ zzcd(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.f25930zza = alternativeBillingOnlyAvailabilityListener;
        this.f25931zzb = zzczVar;
        this.f25932zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcz zzczVar = this.f25931zzb;
            zzjd zzjdVar = zzjd.NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL;
            BillingResult billingResult = zzdc.f25982zzh;
            int i = zzcy.f25973zza;
            zzczVar.zzb(zzcy.zzb(zzjdVar, 14, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25932zzc);
            this.f25930zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            zzcz zzczVar2 = this.f25931zzb;
            zzjd zzjdVar2 = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = zzcy.f25973zza;
            zzczVar2.zzb(zzcy.zzb(zzjdVar2, 14, billingResultZza, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25932zzc);
        }
        this.f25930zza.onAlternativeBillingOnlyAvailabilityResponse(billingResultZza);
    }
}
