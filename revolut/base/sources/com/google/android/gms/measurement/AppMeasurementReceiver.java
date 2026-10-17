package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzhx;

/* JADX INFO: loaded from: classes16.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzhx.zza {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzhx f46830zza;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx.zza
    public void doStartService(@NonNull Context context, @NonNull Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f46830zza == null) {
            this.f46830zza = new zzhx(this);
        }
        this.f46830zza.zza(context, intent);
    }
}
