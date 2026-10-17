package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes16.dex */
final class zzno extends zznq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Status f45521zza;

    public zzno(zznp zznpVar, Status status) {
        this.f45521zza = status;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        BaseImplementation.ResultHolder resultHolder = (BaseImplementation.ResultHolder) obj2;
        if (this.f45521zza.isSuccess()) {
            resultHolder.setResult(this.f45521zza);
        } else {
            resultHolder.setFailedResult(this.f45521zza);
        }
    }
}
