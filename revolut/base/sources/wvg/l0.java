package wvg;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f300416a = ISODateTimeFormat.dateTime();

    public static final String a(g1 g1Var) {
        String strQ = kotlin.jvm.internal.s.Q(g1Var.f300379b);
        String strT = nz8.d.t(g1Var.f300380c, null);
        return a0.d.u(v0.a.m("complex_analytics_realised_pnl_", strQ, "_", strT, "_"), g1Var.e.f306286a, "_", g1Var.f);
    }
}
