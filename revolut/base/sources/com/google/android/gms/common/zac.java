package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;

/* JADX INFO: loaded from: classes16.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ int f38336zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ ActivityResultLauncher f38337zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ GoogleApiAvailability f38338zad;

    public zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i, ActivityResultLauncher activityResultLauncher) {
        this.f38338zad = googleApiAvailability;
        this.zaa = activity;
        this.f38336zab = i;
        this.f38337zac = activityResultLauncher;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f38338zad.getErrorResolutionPendingIntent(this.zaa, this.f38336zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.f38337zac.launch(new IntentSenderRequest.Builder(errorResolutionPendingIntent.getIntentSender()).build());
    }
}
