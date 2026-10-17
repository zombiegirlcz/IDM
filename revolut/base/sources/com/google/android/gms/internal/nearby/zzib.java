package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes16.dex */
final class zzib implements OnFailureListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45287zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzii f45288zzb;

    public zzib(zzii zziiVar, String str) {
        this.f45288zzb = zziiVar;
        this.f45287zza = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc2) {
        if ((exc2 instanceof ApiException) && ((ApiException) exc2).getStatusCode() == 8003) {
            return;
        }
        this.f45288zzb.zzk(this.f45287zza);
    }
}
