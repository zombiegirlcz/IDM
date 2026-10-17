package tbl;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nel.z;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f269561a = r0.k(new Pair("ADR", z.ADR), new Pair("ETF", z.ETF), new Pair("ETC", z.ETC), new Pair("ETN", z.ETN), new Pair("EQUITY", z.EQUITY), new Pair("WARRANT", z.WARRANT), new Pair("SPAC", z.SPAC), new Pair("CFD", z.CFD), new Pair("BOND", z.BOND), new Pair("COMMODITY", z.COMMODITY), new Pair("FUND", z.FUND), new Pair("MUTUAL_FUND", z.MUTUAL_FUND), new Pair("STRUCTURED_NOTE", z.STRUCTURED_NOTE), new Pair("OPTION", z.OPTION));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final z a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (z) u1.t(str, z.UNSPECIFIED, f269561a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String b(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        String strH = u1.h(zVar, f269561a);
        return strH == null ? "UNSPECIFIED" : strH;
    }
}
