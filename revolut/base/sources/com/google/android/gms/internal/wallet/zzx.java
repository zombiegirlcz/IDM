package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* JADX INFO: loaded from: classes16.dex */
final class zzx extends zzt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final TaskCompletionSource f46392zza;

    public zzx(TaskCompletionSource taskCompletionSource) {
        this.f46392zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzf(Status status, PaymentData paymentData, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentData, this.f46392zza);
    }
}
