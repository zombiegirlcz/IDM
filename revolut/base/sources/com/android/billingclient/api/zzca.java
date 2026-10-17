package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
final class zzca extends com.google.android.gms.internal.play_billing.zzaf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final BillingConfigResponseListener f25922zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzcz f25923zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f25924zzc;

    public /* synthetic */ zzca(BillingConfigResponseListener billingConfigResponseListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.f25922zza = billingConfigResponseListener;
        this.f25923zzb = zzczVar;
        this.f25924zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzag
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcz zzczVar = this.f25923zzb;
            zzjd zzjdVar = zzjd.NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL;
            BillingResult billingResult = zzdc.f25982zzh;
            int i = zzcy.f25973zza;
            zzczVar.zzb(zzcy.zzb(zzjdVar, 13, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25924zzc);
            this.f25922zza.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        String strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzk);
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            BillingResult billingResultBuild = builderNewBuilder.build();
            zzcz zzczVar2 = this.f25923zzb;
            zzjd zzjdVar2 = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = zzcy.f25973zza;
            zzczVar2.zzb(zzcy.zzb(zzjdVar2, 13, billingResultBuild, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25924zzc);
            this.f25922zza.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            zzcz zzczVar3 = this.f25923zzb;
            zzjd zzjdVar3 = zzjd.MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE;
            int i3 = zzcy.f25973zza;
            zzczVar3.zzb(zzcy.zzb(zzjdVar3, 13, billingResultBuild2, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25924zzc);
            this.f25922zza.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            this.f25922zza.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            zzcz zzczVar4 = this.f25923zzb;
            zzjd zzjdVar4 = zzjd.ERROR_DECODING_BILLING_CONFIG_DATA;
            BillingResult billingResult2 = zzdc.f25982zzh;
            int i5 = zzcy.f25973zza;
            zzczVar4.zzb(zzcy.zzb(zzjdVar4, 13, billingResult2, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25924zzc);
            this.f25922zza.onBillingConfigResponse(billingResult2, null);
        }
    }
}
