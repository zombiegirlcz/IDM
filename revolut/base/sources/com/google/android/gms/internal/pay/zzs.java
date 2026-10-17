package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.pay.zzbm;
import com.google.android.gms.pay.zzbo;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzs extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45809zza;

    public zzs(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.f45809zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzm(zzbm zzbmVar) {
        this.f45809zza.setException(new zzbo(zzbmVar));
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzt(Status status) {
        TaskUtil.setResultOrApiException(status, null, this.f45809zza);
    }
}
