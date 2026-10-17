package gq;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.appwidget_core.a f145470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f145471c;

    public b(Context context, com.revolut.appwidget_core.a appWidget) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidget, "appWidget");
        this.f145469a = context;
        this.f145470b = appWidget;
        this.f145471c = j.b(new androidx.lifecycle.b(this, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (androidx.glance.appwidget.GlanceAppWidgetKt.updateAll(r5, r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof gq.a
            if (r0 == 0) goto L13
            r0 = r8
            gq.a r0 = (gq.a) r0
            int r1 = r0.f145468x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145468x = r1
            goto L18
        L13:
            gq.a r0 = new gq.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f145468x
            r3 = 2
            r4 = 1
            com.revolut.appwidget_core.a r5 = r6.f145470b
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L28
            if (r2 != r3) goto L32
        L28:
            boolean r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            goto L57
        L2e:
            r8 = move-exception
            goto L5a
        L30:
            r7 = move-exception
            goto L84
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            yhm.o.b(r8)
            android.content.Context r8 = r6.f145469a
            if (r7 == 0) goto L4c
            r0.u = r7     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            r0.f145468x = r4     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            java.lang.Object r7 = r5.d(r8, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L57
            goto L56
        L4c:
            r0.u = r7     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            r0.f145468x = r3     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            java.lang.Object r7 = androidx.glance.appwidget.GlanceAppWidgetKt.updateAll(r5, r8, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5a:
            com.revolut.appwidget_core.AppWidgetException r0 = new com.revolut.appwidget_core.AppWidgetException
            java.lang.Class r1 = r5.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to trigger widget update. Receiver = ["
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", force = "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7, r8)
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r0, r7)
            throw r8
        L84:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.b.a(boolean, gim.c):java.lang.Object");
    }
}
