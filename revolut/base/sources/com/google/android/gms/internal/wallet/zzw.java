package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;

/* JADX INFO: loaded from: classes16.dex */
final class zzw extends zzt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final TaskCompletionSource f46391zza;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.f46391zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zze(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentCardRecognitionIntentResponse, this.f46391zza);
    }
}
