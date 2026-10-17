package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: loaded from: classes16.dex */
final class zzbp extends zzbd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbq f38900zza;

    public zzbp(zzbq zzbqVar) {
        this.f38900zza = zzbqVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(ProxyResponse proxyResponse) {
        this.f38900zza.setResult(new zzbu(proxyResponse));
    }
}
