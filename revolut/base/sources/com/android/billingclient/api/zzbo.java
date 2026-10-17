package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzbo extends ResultReceiver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AlternativeBillingOnlyInformationDialogListener f25893zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ BillingClientImpl f25894zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbo(BillingClientImpl billingClientImpl, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.f25893zza = alternativeBillingOnlyInformationDialogListener;
        Objects.requireNonNull(billingClientImpl);
        this.f25894zzb = billingClientImpl;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                this.f25894zzb.zzba(this.f25893zza, zzdc.f25982zzh, zzjd.NULL_BUNDLE_IN_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG_RECEIVER, null);
                return;
            }
            builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            BillingClientImpl billingClientImpl = this.f25894zzb;
            zzjd zzjdVarZzb = i2 != 0 ? zzjd.zzb(i2) : zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            BillingResult billingResultBuild = builderNewBuilder.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i3 = zzcy.f25973zza;
            billingClientImpl.zzbc(zzcy.zzb(zzjdVarZzb, 16, billingResultBuild, string, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        }
        this.f25893zza.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
