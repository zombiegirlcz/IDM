package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes16.dex */
final class zad extends zau {
    final /* synthetic */ GoogleApiAvailability zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Context f38339zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.zaa = googleApiAvailability;
        this.f38339zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            String str = "Don't know how to handle this message: " + i;
        } else {
            GoogleApiAvailability googleApiAvailability = this.zaa;
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.f38339zab);
            if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
                this.zaa.showErrorNotification(this.f38339zab, iIsGooglePlayServicesAvailable);
            }
        }
    }
}
