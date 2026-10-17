package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes16.dex */
final class zzid implements OnFailureListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45291zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzii f45292zzb;

    public zzid(zzii zziiVar, String str) {
        this.f45292zzb = zziiVar;
        this.f45291zza = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc2) {
        if ((exc2 instanceof ApiException) && ((ApiException) exc2).getStatusCode() == 8003) {
            return;
        }
        this.f45292zzb.zzk(this.f45291zza);
    }
}
