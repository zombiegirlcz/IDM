package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzkh;
import wb.c;
import wb.d;
import wb.g;
import wb.h;
import xb.a;
import zb.r;
import zb.s;

/* JADX INFO: loaded from: classes16.dex */
final class zzdn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f25995zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private h f25996zzb;

    public zzdn(Context context) {
        try {
            s.b(context);
            this.f25996zzb = s.a().c(a.e).a("PLAY_BILLING_LIBRARY", new c("proto"), new g() { // from class: com.android.billingclient.api.zzdm
                @Override // wb.g
                public final Object apply(Object obj2) {
                    return ((zzkh) obj2).zzQ();
                }
            });
        } catch (Throwable unused) {
            this.f25995zza = true;
        }
    }

    public final void zza(zzkh zzkhVar) {
        if (this.f25995zza) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r) this.f25996zzb).a(d.a(zzkhVar), new pd.h(22));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "logging failed.");
        }
    }
}
