package com.google.android.gms.nearby.exposurenotification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class WakeUpService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(@NonNull Intent intent) {
        return new Messenger(new zzr(null)).getBinder();
    }
}
