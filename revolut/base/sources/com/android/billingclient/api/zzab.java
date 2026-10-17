package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes16.dex */
final class zzab {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f25789zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final PurchasesUpdatedListener f25790zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzb f25791zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final UserChoiceBillingListener f25792zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final DeveloperProvidedBillingListener f25793zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzcz f25794zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final zzaa f25795zzg = new zzaa(this, true);

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final zzaa f25796zzh = new zzaa(this, false);

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f25797zzi;

    public zzab(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzdo zzdoVar, zzb zzbVar, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar) {
        this.f25789zza = context;
        this.f25790zzb = purchasesUpdatedListener;
        this.f25791zzc = zzbVar;
        this.f25792zzd = userChoiceBillingListener;
        this.f25793zze = developerProvidedBillingListener;
        this.f25794zzf = zzczVar;
    }

    public final DeveloperProvidedBillingListener zzd() {
        return this.f25793zze;
    }

    public final PurchasesUpdatedListener zzf() {
        return this.f25790zzb;
    }

    public final void zzh() {
        zzaa zzaaVar = this.f25795zzg;
        Context context = this.f25789zza;
        zzaaVar.zzc(context);
        this.f25796zzh.zzc(context);
    }

    public final void zzi(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f25797zzi = z;
        zzaa zzaaVar = this.f25796zzh;
        Context context = this.f25789zza;
        zzaaVar.zza(context, intentFilter2);
        if (this.f25797zzi) {
            this.f25795zzg.zzb(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f25795zzg.zza(context, intentFilter);
        }
    }
}
