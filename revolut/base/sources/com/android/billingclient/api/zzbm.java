package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzbm implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ PurchasesResponseListener f25888zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f25889zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ boolean f25890zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ BillingClientImpl f25891zzd;

    public zzbm(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener, String str, boolean z) {
        this.f25888zza = purchasesResponseListener;
        this.f25889zzb = str;
        this.f25890zzc = z;
        Objects.requireNonNull(billingClientImpl);
        this.f25891zzd = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BillingClientImpl billingClientImpl = this.f25891zzd;
        if (!billingClientImpl.zzbl(30000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.f25984zzj;
            billingClientImpl.zzbs(zzjdVar, 9, billingResult);
            this.f25888zza.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbw.zzk());
            return null;
        }
        String str = this.f25889zzb;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Please provide a valid product type.");
            zzjd zzjdVar2 = zzjd.EMPTY_PRODUCT_TYPE;
            BillingResult billingResult2 = zzdc.f25979zze;
            billingClientImpl.zzbs(zzjdVar2, 9, billingResult2);
            this.f25888zza.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzbw.zzk());
            return null;
        }
        zzdz zzdzVarZzbq = billingClientImpl.zzbq(str, this.f25890zzc, 9);
        if (zzdzVarZzbq.zzb() != null) {
            this.f25888zza.onQueryPurchasesResponse(zzdzVarZzbq.zza(), zzdzVarZzbq.zzb());
            return null;
        }
        this.f25888zza.onQueryPurchasesResponse(zzdzVarZzbq.zza(), com.google.android.gms.internal.play_billing.zzbw.zzk());
        return null;
    }
}
