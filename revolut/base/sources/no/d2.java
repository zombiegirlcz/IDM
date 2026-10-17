package no;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f217756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f217757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f217758c;

    public d2(com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, com.revolut.retail.analytics.tracking.impl.a appAnalyticsToggles, l80.h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(appAnalyticsToggles, "appAnalyticsToggles");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f217756a = diagnosticEventsTracker;
        this.f217757b = new LinkedHashSet();
        this.f217758c = new LinkedHashMap();
    }

    public final void a(com.revolut.kompot.navigable.a screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        c2 c2Var = (c2) this.f217758c.remove(screen.u2());
        if (c2Var == null) {
            return;
        }
        b2 launchType = this.f217757b.add(screen.getClass()) ? b2.COLD : b2.HOT;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        long j2 = c2Var.f217748a;
        long j3 = jElapsedRealtime - j2;
        Long l2 = c2Var.d;
        long jLongValue = l2 != null ? l2.longValue() - j2 : j3;
        aim.f builder = new aim.f();
        builder.put("launch_type", launchType.a());
        Long l3 = c2Var.f217749b;
        if (l3 != null) {
            builder.put("controller_created", Long.valueOf(l3.longValue() - j2));
        }
        Long l4 = c2Var.f217750c;
        if (l4 != null) {
            builder.put("controller_attached", Long.valueOf(l4.longValue() - j2));
        }
        builder.put("first_data_rendered", Long.valueOf(jLongValue));
        builder.put("full_data_rendered", Long.valueOf(j3));
        Unit unit = Unit.f186387a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f attributes = builder.b();
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) this.f217756a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        uo.o0 o0VarE = fVar.d.e(screen);
        com.revolut.analytics.tracking.v3.f.g(fVar, ((uo.o) fVar.e).e(screen, null), o0VarE.f281496a, new mh1.d(fVar, screen.getClass(), o0VarE, null, 17), new kp0.f0(o0VarE, j3, attributes, fVar, 2), 4);
    }

    public final void b(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        c2 c2Var = (c2) this.f217758c.get(controller.u2());
        if (c2Var == null || c2Var.d != null) {
            return;
        }
        c2Var.d = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
