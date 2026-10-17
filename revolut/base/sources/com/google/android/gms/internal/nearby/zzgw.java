package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzgw extends zzkj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final BaseImplementation.ResultHolder f45214zza;

    public zzgw(BaseImplementation.ResultHolder resultHolder) {
        this.f45214zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzkk
    public final void zzb(int i) {
        Status statusZzG = zzgz.zzG(i);
        if (statusZzG.isSuccess()) {
            this.f45214zza.setResult(statusZzG);
        } else {
            this.f45214zza.setFailedResult(statusZzG);
        }
    }
}
