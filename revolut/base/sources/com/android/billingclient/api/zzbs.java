package com.android.billingclient.api;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzbs implements BillingClientStateListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzp f25900zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ BillingClientImpl f25901zzb;

    public zzbs(BillingClientImpl billingClientImpl, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        this.f25900zza = zzpVar;
        Objects.requireNonNull(billingClientImpl);
        this.f25901zzb = billingClientImpl;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection attempt failed.");
        try {
            this.f25900zza.zzb(zzdc.f25984zzj);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception setting completer.", th10);
        }
        BillingClientImpl billingClientImpl = this.f25901zzb;
        if (billingClientImpl.zzH != null) {
            billingClientImpl.zzao(new Runnable() { // from class: com.android.billingclient.api.zzbq
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f25897zza.f25901zzb.zzH.onBillingServiceDisconnected();
                    } catch (Throwable th11) {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception calling onBillingServiceDisconnected.", th11);
                    }
                }
            });
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(final BillingResult billingResult) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection finished with result: " + billingResult.getResponseCode());
        try {
            this.f25900zza.zzb(billingResult);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception setting completer.", th10);
        }
        BillingClientImpl billingClientImpl = this.f25901zzb;
        if (billingClientImpl.zzH != null) {
            billingClientImpl.zzao(new Runnable() { // from class: com.android.billingclient.api.zzbr
                @Override // java.lang.Runnable
                public final void run() {
                    zzbs zzbsVar = this.f25898zza;
                    try {
                        zzbsVar.f25901zzb.zzH.onBillingSetupFinished(billingResult);
                    } catch (Throwable th11) {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception calling onBillingSetupFinished.", th11);
                    }
                }
            });
        }
    }
}
