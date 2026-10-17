package com.google.android.gms.internal.pay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zzz extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final WeakReference f45816zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f45817zzb;

    public zzz(Activity activity, int i) {
        this.f45816zza = new WeakReference(activity);
        this.f45817zzb = i;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzh(Status status) {
        Activity activity = (Activity) this.f45816zza.get();
        if (activity == null) {
            return;
        }
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(activity, this.f45817zzb);
                return;
            } catch (IntentSender.SendIntentException e) {
            }
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.f45817zzb, new Intent(), 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(status.isSuccess() ? -1 : status.getStatusCode());
        } catch (PendingIntent.CanceledException e2) {
        }
    }
}
