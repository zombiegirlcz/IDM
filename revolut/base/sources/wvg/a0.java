package wvg;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f300323a = ISODateTimeFormat.dateTime();

    public static final String a(v0 v0Var) {
        String strQ = kotlin.jvm.internal.s.Q(v0Var.f300483b);
        String strT = nz8.d.t(v0Var.f300484c, null);
        String strR = kotlin.jvm.internal.s.R(v0Var.e);
        boolean z = v0Var.f;
        String str = v0Var.f300485g;
        String str2 = v0Var.f300486h.f306286a;
        StringBuilder sbM = v0.a.m("complex_analytics_contributors_", strQ, "_", strT, "_");
        sbM.append(strR);
        sbM.append("_");
        sbM.append(z);
        sbM.append("_");
        return a0.d.u(sbM, str, "_", str2);
    }
}
