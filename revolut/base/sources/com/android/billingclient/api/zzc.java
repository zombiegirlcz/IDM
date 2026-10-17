package com.android.billingclient.api;

import java.util.Objects;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25919zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f25920zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f25921zzc;

    public /* synthetic */ zzc(JSONObject jSONObject, zzd zzdVar) {
        this.f25919zza = jSONObject.optString("productId");
        this.f25920zzb = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f25921zzc = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj2;
        return this.f25919zza.equals(zzcVar.f25919zza) && this.f25920zzb.equals(zzcVar.f25920zzb) && Objects.equals(this.f25921zzc, zzcVar.f25921zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.f25919zza, this.f25920zzb, this.f25921zzc);
    }

    public final String toString() {
        String str = this.f25919zza;
        String str2 = this.f25920zzb;
        return a.i(a.m("{id: ", str, ", type: ", str2, ", offer token: "), this.f25921zzc, "}");
    }
}
