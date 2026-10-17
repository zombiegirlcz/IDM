package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd extends zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39582zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Activity f39583zzb;

    public zzd(int i, Activity activity) {
        this.f39582zza = i;
        this.f39583zzb = activity;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zzc(int i, Bundle bundle) {
        PendingIntent pendingIntentCreatePendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.f39583zzb;
            if (activity == null || (pendingIntentCreatePendingResult = activity.createPendingResult(this.f39582zza, intent, 1073741824)) == null) {
                return;
            }
            try {
                pendingIntentCreatePendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e) {
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult((Activity) Preconditions.checkNotNull(this.f39583zzb), this.f39582zza);
                return;
            } catch (IntentSender.SendIntentException e2) {
                return;
            }
        }
        try {
            PendingIntent pendingIntentCreatePendingResult2 = ((Activity) Preconditions.checkNotNull(this.f39583zzb)).createPendingResult(this.f39582zza, new Intent(), 1073741824);
            if (pendingIntentCreatePendingResult2 != null) {
                pendingIntentCreatePendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException e4) {
        }
    }
}
