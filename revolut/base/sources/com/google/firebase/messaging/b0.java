package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f49478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f49479b;

    public b0(c0 c0Var, c0 c0Var2) {
        this.f49479b = c0Var;
        this.f49478a = c0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        this.f49479b.f49483a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            c0 c0Var = this.f49478a;
            if (c0Var == null) {
                return;
            }
            if (c0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                c0 c0Var2 = this.f49478a;
                c0Var2.d.f.schedule(c0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f49478a = null;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
