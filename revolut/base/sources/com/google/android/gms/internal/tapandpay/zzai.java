package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zzai extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final WeakReference f46304zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f46305zzb;

    public zzai(Activity activity, int i) {
        this.f46304zza = new WeakReference(activity);
        this.f46305zzb = i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzt(Status status, Bundle bundle) {
        Activity activity = (Activity) this.f46304zza.get();
        if (activity == null) {
            return;
        }
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(activity, this.f46305zzb);
                return;
            } catch (IntentSender.SendIntentException e) {
            }
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.f46305zzb, new Intent(), 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(status.isSuccess() ? -1 : status.getStatusCode());
        } catch (PendingIntent.CanceledException e2) {
        }
    }
}
