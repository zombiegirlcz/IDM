package wvg;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f300470a = ISODateTimeFormat.dateTime();

    public static final String a(z1 z1Var) {
        String strQ = kotlin.jvm.internal.s.Q(z1Var.f300511b);
        String strT = nz8.d.t(z1Var.f300512c, null);
        String strR = kotlin.jvm.internal.s.R(z1Var.e);
        String id10 = z1Var.f.getId();
        String str = z1Var.f300513g;
        String str2 = z1Var.f300514h.f306286a;
        StringBuilder sbM = v0.a.m("complex_analytics_sector_contributors_", strQ, "_", strT, "_");
        j6.a.D(sbM, strR, "_", id10, "_");
        return a0.d.u(sbM, str, "_", str2);
    }
}
