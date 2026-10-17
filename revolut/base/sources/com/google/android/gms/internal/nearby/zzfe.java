package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes16.dex */
final class zzfe implements OnFailureListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleApi f45152zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ ListenerHolder.ListenerKey f45153zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ boolean f45154zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzfg f45155zzd;

    public zzfe(zzfg zzfgVar, GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, boolean z) {
        this.f45155zzd = zzfgVar;
        this.f45152zza = googleApi;
        this.f45153zzb = listenerKey;
        this.f45154zzc = z;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc2) {
        int statusCode;
        synchronized (this.f45155zzd) {
            try {
                if (!(exc2 instanceof ApiException) || ((statusCode = ((ApiException) exc2).getStatusCode()) != 8001 && statusCode != 8002)) {
                    this.f45155zzd.zzg(this.f45152zza, this.f45153zzb);
                } else if (this.f45154zzc) {
                    this.f45155zzd.f45159zzc.remove(this.f45153zzb);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
