package io;

import android.app.Activity;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f162979a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f162980b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f162981c = new ConcurrentHashMap();

    private a() {
    }

    public static void a(String markName) {
        Intrinsics.checkNotNullParameter(markName, "markName");
        if (f162980b.get()) {
            f162981c.putIfAbsent(markName, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            activity.reportFullyDrawn();
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AppStartupTracker", "Failed to reportFullyDrawn", th10, h0Var);
        }
    }
}
