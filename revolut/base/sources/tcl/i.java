package tcl;

import fdl.t2;
import hcl.v2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nel.f0;
import nel.n0;
import nel.o0;
import nel.p0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f269885a = r0.k(new Pair("TRADEABLE", n0.TRADEABLE), new Pair("MARKET_CLOSED", n0.MARKET_CLOSED), new Pair("UNDEFINED", n0.UNDEFINED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f269886b = r0.k(new Pair("OPEN", p0.OPEN), new Pair("NONE", p0.NONE), new Pair("AFTER_HOURS", p0.AFTER_HOURS), new Pair("PRE_MARKET", p0.PRE_MARKET));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f269887c = r0.k(new Pair("SECURITY", o0.SECURITY), new Pair("INDEX", o0.INDEX));
    public static final String d = "INDEX_POINTS";

    public static final f0 a(t2 t2Var) {
        Intrinsics.checkNotNullParameter(t2Var, "<this>");
        return new f0(mo3.a.o(t2Var.getHigh()), mo3.a.o(t2Var.getLow()));
    }

    public static final f0 b(v2 v2Var) {
        Intrinsics.checkNotNullParameter(v2Var, "<this>");
        return new f0(hx7.a.v(v2Var.getHigh()), hx7.a.v(v2Var.getLow()));
    }

    public static final v2 c(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return new v2(hx7.a.A(f0Var.f214573a), hx7.a.A(f0Var.f214574b));
    }
}
