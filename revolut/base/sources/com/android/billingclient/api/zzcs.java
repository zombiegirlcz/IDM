package com.android.billingclient.api;

import androidx.core.util.Consumer;
import com.google.android.gms.internal.play_billing.zzjd;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes16.dex */
final class zzcs implements com.google.android.gms.internal.play_billing.zzcv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Consumer f25962zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Runnable f25963zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzcw f25964zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ int f25965zzd;

    public zzcs(zzcw zzcwVar, int i, Consumer consumer, Runnable runnable) {
        this.f25965zzd = i;
        this.f25962zza = consumer;
        this.f25963zzb = runnable;
        Objects.requireNonNull(zzcwVar);
        this.f25964zzc = zzcwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final void zza(Throwable th10) {
        if (th10 instanceof TimeoutException) {
            this.f25964zzc.zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th10);
        } else {
            this.f25964zzc.zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", th10);
        }
        this.f25963zzb.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj2) {
        Integer num = (Integer) obj2;
        int iIntValue = num.intValue();
        zzcw zzcwVar = this.f25964zzc;
        if (!zzcw.zzaK(iIntValue)) {
            this.f25963zzb.run();
        } else {
            this.f25962zza.accept(zzcwVar.zzaL(this.f25965zzd, num.intValue()));
        }
    }
}
