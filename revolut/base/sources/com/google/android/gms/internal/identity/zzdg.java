package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzdg extends zzs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f39688zza;

    public zzdg(TaskCompletionSource taskCompletionSource) {
        this.f39688zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzb(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f39688zza);
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzc(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f39688zza);
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzd(int i, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f39688zza);
    }
}
