package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes16.dex */
final class zzcf extends com.google.android.gms.internal.play_billing.zzaq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final WeakReference f25936zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final ResultReceiver f25937zzb;

    public /* synthetic */ zzcf(WeakReference weakReference, ResultReceiver resultReceiver, zzch zzchVar) {
        this.f25936zza = weakReference;
        this.f25937zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f25937zzb;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f25936zza.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e) {
            this.f25937zzb.send(0, null);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
