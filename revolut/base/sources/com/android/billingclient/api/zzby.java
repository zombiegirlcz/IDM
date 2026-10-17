package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
final class zzby extends com.google.android.gms.internal.play_billing.zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final ExternalOfferReportingDetailsListener f25914zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzcz f25915zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f25916zzc;

    public /* synthetic */ zzby(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.f25914zza = externalOfferReportingDetailsListener;
        this.f25915zzb = zzczVar;
        this.f25916zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzz
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcz zzczVar = this.f25915zzb;
            zzjd zzjdVar = zzjd.NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL;
            BillingResult billingResult = zzdc.f25982zzh;
            int i = zzcy.f25973zza;
            zzczVar.zzb(zzcy.zzb(zzjdVar, 24, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25916zzc);
            this.f25914zza.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            zzcz zzczVar2 = this.f25915zzb;
            zzjd zzjdVar2 = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = zzcy.f25973zza;
            zzczVar2.zzb(zzcy.zzb(zzjdVar2, 24, billingResultZza, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25916zzc);
            this.f25914zza.onExternalOfferReportingDetailsResponse(billingResultZza, null);
            return;
        }
        try {
            this.f25914zza.onExternalOfferReportingDetailsResponse(billingResultZza, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            zzcz zzczVar3 = this.f25915zzb;
            zzjd zzjdVar3 = zzjd.ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS;
            BillingResult billingResult2 = zzdc.f25982zzh;
            int i3 = zzcy.f25973zza;
            zzczVar3.zzb(zzcy.zzb(zzjdVar3, 24, billingResult2, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f25916zzc);
            this.f25914zza.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
