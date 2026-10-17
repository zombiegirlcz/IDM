package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f49500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f49501c;
    public final ArrayDeque d;
    public e0 e;
    public boolean f;

    public g0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.f49499a = applicationContext;
        this.f49500b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f49501c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                e0 e0Var = this.e;
                if (e0Var == null || !e0Var.isBinderAlive()) {
                    c();
                    return;
                } else {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    this.e.a((f0) this.d.poll());
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized Task b(Intent intent) {
        f0 f0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            f0Var = new f0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f49501c;
            f0Var.f49495b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new ag.j(scheduledThreadPoolExecutor.schedule(new androidx.view.d(f0Var, 7), 20L, TimeUnit.SECONDS), 10));
            this.d.add(f0Var);
            a();
        } catch (Throwable th10) {
            throw th10;
        }
        return f0Var.f49495b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb6 = new StringBuilder("binder is dead. start connection? ");
            sb6.append(!this.f);
            sb6.toString();
        }
        if (this.f) {
            return;
        }
        this.f = true;
        if (ConnectionTracker.getInstance().bindService(this.f49499a, this.f49500b, this, 65)) {
            return;
        }
        this.f = false;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((f0) arrayDeque.poll()).f49495b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String str = "onServiceConnected: " + componentName;
            }
            this.f = false;
            if (iBinder instanceof e0) {
                this.e = (e0) iBinder;
                a();
                return;
            }
            String str2 = "Invalid service connection: " + iBinder;
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((f0) arrayDeque.poll()).f49495b.trySetResult(null);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String str = "onServiceDisconnected: " + componentName;
        }
        a();
    }
}
