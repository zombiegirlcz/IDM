package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes16.dex */
final class zzic implements OnFailureListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45289zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzii f45290zzb;

    public zzic(zzii zziiVar, String str) {
        this.f45290zzb = zziiVar;
        this.f45289zza = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc2) {
        if ((exc2 instanceof ApiException) && ((ApiException) exc2).getStatusCode() == 8003) {
            return;
        }
        this.f45290zzb.zzk(this.f45289zza);
    }
}
