package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f49488a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f49489b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WakeLock f49490c;

    public static void a(Intent intent) {
        synchronized (f49489b) {
            try {
                if (f49490c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f49490c.release();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static void b(Context context, g0 g0Var, Intent intent) {
        synchronized (f49489b) {
            try {
                if (f49490c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f49490c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f49490c.acquire(f49488a);
                }
                g0Var.b(intent).addOnCompleteListener(new cmc.d(intent, 11));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f49489b) {
            try {
                if (f49490c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f49490c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f49490c.acquire(f49488a);
                }
                return componentNameStartService;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
