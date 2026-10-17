package xcl;

import java.time.LocalDate;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import yel.b;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f304189a = r0.k(new Pair("AAA", yel.a.AAA), new Pair("AA+", yel.a.AA_PLUS), new Pair("AA", yel.a.AA), new Pair("AA-", yel.a.AA_MINUS), new Pair("A+", yel.a.A_PLUS), new Pair("A", yel.a.A), new Pair("A-", yel.a.A_MINUS), new Pair("BBB+", yel.a.BBB_PLUS), new Pair("BBB", yel.a.BBB), new Pair("BBB-", yel.a.BBB_MINUS), new Pair("BB+", yel.a.BB_PLUS), new Pair("BB", yel.a.BB), new Pair("BB-", yel.a.BB_MINUS), new Pair("B+", yel.a.B_PLUS), new Pair("B", yel.a.B), new Pair("B-", yel.a.B_MINUS), new Pair("CCC+", yel.a.CCC_PLUS), new Pair("CCC", yel.a.CCC), new Pair("CCC-", yel.a.CCC_MINUS), new Pair("CC", yel.a.CC), new Pair("C", yel.a.C), new Pair("RD", yel.a.RD), new Pair("D", yel.a.D));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final b a(mcl.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        yel.a aVar2 = (yel.a) u1.v(aVar.getRating(), f304189a);
        if (aVar2 == null) {
            aVar2 = yel.a.UNKNOWN;
        }
        return new b(aVar2, aVar.getLastUpdatedAt(), aVar.getCommentary(), aVar.getOutlook());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final b b(odl.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        yel.a aVar2 = (yel.a) u1.v(aVar.getRating(), f304189a);
        if (aVar2 == null) {
            aVar2 = yel.a.UNKNOWN;
        }
        LocalDate localDate = LocalDate.parse(aVar.getLastUpdatedAt());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return new b(aVar2, localDate, aVar.getCommentary(), aVar.getOutlook());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final mcl.a c(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strH = u1.h(bVar.f313034a, f304189a);
        if (strH == null) {
            strH = "UNKNOWN";
        }
        return new mcl.a(strH, bVar.f313036c, bVar.d, bVar.f313035b);
    }
}
