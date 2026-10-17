package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzu extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ActivityResultLauncher f45811zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45812zzb;

    public zzu(zzx zzxVar, ActivityResultLauncher activityResultLauncher, TaskCompletionSource taskCompletionSource) {
        this.f45811zza = activityResultLauncher;
        this.f45812zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzh(Status status) {
        if (status.isSuccess() && status.hasResolution() && this.f45811zza != null) {
            this.f45811zza.launch(new IntentSenderRequest.Builder(((PendingIntent) Preconditions.checkNotNull(status.getResolution())).getIntentSender()).build());
        }
        TaskUtil.trySetResultOrApiException(status, null, this.f45812zzb);
    }
}
