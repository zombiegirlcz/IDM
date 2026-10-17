package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzs extends zzt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final WeakReference f46387zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f46388zzb;

    public zzs(Activity activity, int i) {
        this.f46387zza = new WeakReference(activity);
        this.f46388zzb = i;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzb(int i, FullWallet fullWallet, Bundle bundle) {
        int i2;
        Activity activity = (Activity) this.f46387zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.f46388zzb);
                return;
            } catch (IntentSender.SendIntentException e) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            i2 = i3;
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.f46388zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i2);
        } catch (PendingIntent.CanceledException e2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzd(int i, MaskedWallet maskedWallet, Bundle bundle) {
        int i2;
        Activity activity = (Activity) this.f46387zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.f46388zzb);
                return;
            } catch (IntentSender.SendIntentException e) {
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            i2 = i3;
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.f46388zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i2);
        } catch (PendingIntent.CanceledException e2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzg(int i, boolean z, Bundle bundle) {
        Activity activity = (Activity) this.f46387zza.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", z);
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.f46388zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(-1);
        } catch (PendingIntent.CanceledException e) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzh(int i, Bundle bundle) {
        Preconditions.checkNotNull(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.f46387zza.get();
        if (activity == null) {
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.f46388zzb);
                return;
            } catch (IntentSender.SendIntentException e) {
                return;
            }
        }
        "Create Wallet Objects confirmation UI will not be shown connection result: ".concat(connectionResult.toString());
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", WalletConstants.ERROR_CODE_UNKNOWN);
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.f46388zzb, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(1);
        } catch (PendingIntent.CanceledException e2) {
        }
    }
}
