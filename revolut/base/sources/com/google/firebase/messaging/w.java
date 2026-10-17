package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f49552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f49553c;
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    public w(FirebaseMessaging firebaseMessaging, long j2) {
        this.f49553c = firebaseMessaging;
        this.f49551a = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f49452b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f49552b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f49553c.f49452b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f49553c.a() == null) {
                return false;
            }
            return Log.isLoggable("FirebaseMessaging", 3) ? true : true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
            String str = "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval";
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f49552b;
        t tVarH = t.h();
        FirebaseMessaging firebaseMessaging = this.f49553c;
        if (tVarH.k(firebaseMessaging.f49452b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.f49455h.f()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                    if (t.h().k(firebaseMessaging.f49452b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (t.h().j(firebaseMessaging.f49452b) && !a()) {
                    new c49.c(this).a();
                    if (t.h().k(firebaseMessaging.f49452b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                } else {
                    firebaseMessaging.f(this.f49551a);
                }
                if (t.h().k(firebaseMessaging.f49452b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                String str = "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.";
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = false;
                    if (t.h().k(firebaseMessaging.f49452b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th10) {
            if (t.h().k(firebaseMessaging.f49452b)) {
                wakeLock.release();
            }
            throw th10;
        }
    }
}
