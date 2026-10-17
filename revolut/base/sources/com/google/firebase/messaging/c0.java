package com.google.firebase.messaging;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 implements Runnable {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f49481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f49482h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f49484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f49485c;
    public final a0 d;
    public final long e;

    public c0(a0 a0Var, Context context, o oVar, long j2) {
        this.d = a0Var;
        this.f49483a = context;
        this.e = j2;
        this.f49484b = oVar;
        this.f49485c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = f49482h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f49482h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            String str2 = "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = f49481g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f49481g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f49483a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c0.d():boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.d;
        Context context = this.f49483a;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f49485c;
        if (zC) {
            wakeLock.acquire(f.f49493a);
        }
        try {
            try {
                try {
                    a0Var.d(true);
                    if (!this.f49484b.f()) {
                        a0Var.d(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (a(context) && !d()) {
                        new b0(this, this).a();
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (a0Var.e()) {
                        a0Var.d(false);
                    } else {
                        a0Var.f(this.e);
                    }
                    if (c(context)) {
                        wakeLock.release();
                    }
                } catch (IOException e) {
                    String str = "Failed to sync topics. Won't retry sync. " + e.getMessage();
                    a0Var.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th10) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused3) {
                    }
                }
                throw th10;
            }
        } catch (RuntimeException unused4) {
        }
    }
}
