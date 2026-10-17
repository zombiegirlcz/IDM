package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzgy extends zzkm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final BaseImplementation.ResultHolder f45217zza;

    public zzgy(BaseImplementation.ResultHolder resultHolder) {
        this.f45217zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzkn
    public final void zzb(zzln zzlnVar) {
        Status statusZzG = zzgz.zzG(zzlnVar.zza());
        if (statusZzG.isSuccess()) {
            this.f45217zza.setResult(new zzgx(statusZzG, zzlnVar.zzb()));
        } else {
            this.f45217zza.setFailedResult(statusZzG);
        }
    }
}
