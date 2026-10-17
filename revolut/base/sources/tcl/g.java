package tcl;

import fdl.x2;
import jel.a3;
import jel.y2;
import jel.z2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.Instant;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f269882a = r0.k(new Pair("MATERIALS", a3.MATERIALS), new Pair("INDUSTRIALS", a3.INDUSTRIALS), new Pair("FINANCIAL", a3.FINANCIAL), new Pair("ENERGY", a3.ENERGY), new Pair("CONSUMER_CYCLICAL", a3.CONSUMER_CYCLICAL), new Pair("TECHNOLOGY", a3.TECHNOLOGY), new Pair("COMMUNICATION_SERVICES", a3.COMMUNICATION_SERVICES), new Pair("REAL_ESTATE", a3.REAL_ESTATE), new Pair("HEALTHCARE", a3.HEALTHCARE), new Pair("CONSUMER_DEFENSIVE", a3.CONSUMER_DEFENSIVE), new Pair("UTILITIES", a3.UTILITIES), new Pair("GOVERNMENT_BONDS", a3.GOVERNMENT_BONDS), new Pair("CORPORATE_BONDS", a3.CORPORATE_BONDS), new Pair("SECURITIZED", a3.SECURITIZED), new Pair("CASH_AND_DERIVATIVES", a3.CASH_AND_DERIVATIVES), new Pair("CRYPTOCURRENCY", a3.CRYPTOCURRENCY), new Pair("CFDS", a3.CFDS), new Pair("COMMODITIES", a3.COMMODITIES), new Pair("ROBO", a3.ROBO), new Pair("OTHER", a3.OTHER), new Pair("UNSPECIFIED", a3.UNSPECIFIED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f269883b = r0.k(new Pair("BUY", y2.BUY), new Pair("HOLD", y2.HOLD), new Pair("SELL", y2.SELL));

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final z2 a(x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "<this>");
        return new z2(x2Var.getBuyRecommendations(), x2Var.getHoldRecommendations(), x2Var.getSellRecommendations(), (y2) u1.u(x2Var.getConsensus(), f269883b), new Instant(x2Var.getUpdatedAt()));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final z2 b(hcl.z2 z2Var) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        return new z2(z2Var.getBuyRecommendations(), z2Var.getHoldRecommendations(), z2Var.getSellRecommendations(), (y2) u1.u(z2Var.getConsensus(), f269883b), z2Var.getUpdatedAt());
    }
}
