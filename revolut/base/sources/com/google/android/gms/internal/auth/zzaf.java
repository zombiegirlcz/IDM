package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzag f38872zza;

    public zzaf(zzag zzagVar) {
        this.f38872zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean z) {
        this.f38872zza.setResult(new zzak(z ? Status.RESULT_SUCCESS : zzal.f38879zza));
    }
}
