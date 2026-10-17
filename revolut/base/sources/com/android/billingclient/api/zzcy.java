package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzcy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f25973zza = 0;

    static {
        int i = zzcz.f25974zza;
    }

    public static String zza(Exception exc2) {
        if (exc2 == null) {
            return null;
        }
        try {
            String str = exc2.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.zzbm.zzc(exc2.getMessage());
            int i = com.google.android.gms.internal.play_billing.zzc.f45864zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to get truncated exception info", th10);
            return null;
        }
    }

    public static zziw zzb(zzjd zzjdVar, int i, BillingResult billingResult, String str, zzjk zzjkVar) {
        try {
            zzjb zzjbVarZza = zzjf.zza();
            zzjbVarZza.zzp(billingResult.getResponseCode());
            zzjbVarZza.zzb(billingResult.getDebugMessage());
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                zzjbVarZza.zzd(billingResult.getOnPurchasesUpdatedSubResponseCode());
            }
            if (zzjdVar != null) {
                zzjbVarZza.zze(zzjdVar);
            }
            if (str != null) {
                zzjbVarZza.zza(str);
            }
            zziu zziuVarZza = zziw.zza();
            zziuVarZza.zzb(zzjbVarZza);
            zziuVarZza.zzp(i);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                zziuVarZza.zza(zzjkVar);
            }
            return (zziw) zziuVarZza.zzi();
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th10);
            return null;
        }
    }

    public static zzja zzc(int i, zzjk zzjkVar) {
        try {
            zziy zziyVarZza = zzja.zza();
            zziyVarZza.zze(i);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                zziyVarZza.zza(zzjkVar);
            }
            return (zzja) zziyVarZza.zzi();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
