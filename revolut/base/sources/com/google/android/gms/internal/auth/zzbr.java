package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzbr extends zzbd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbs f38902zza;

    public zzbr(zzbs zzbsVar) {
        this.f38902zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        if (str != null) {
            this.f38902zza.setResult(new zzbv(str));
        } else {
            this.f38902zza.setResult(new zzbv(new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}
