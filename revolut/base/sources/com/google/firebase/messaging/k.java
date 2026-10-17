package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f49506c = new Object();
    public static g0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49508b;

    public k(ExecutorService executorService) {
        this.f49508b = new ArrayMap();
        this.f49507a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z) {
        g0 g0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        synchronized (f49506c) {
            try {
                if (d == null) {
                    d = new g0(context);
                }
                g0Var = d;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (!z) {
            return g0Var.b(intent).continueWith(new l.a(2), new a5.a(5));
        }
        if (t.h().k(context)) {
            d0.b(context, g0Var, intent);
        } else {
            g0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f49507a;
        l.a aVar = (l.a) this.f49508b;
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z3 = (intent.getFlags() & 268435456) != 0;
        return (!z || z3) ? Tasks.call(aVar, new ag.d(context, intent, 1)).continueWithTask(aVar, new j(context, intent, z3)) : a(context, intent, z3);
    }

    public k(Context context) {
        this.f49507a = context;
        this.f49508b = new l.a(2);
    }
}
