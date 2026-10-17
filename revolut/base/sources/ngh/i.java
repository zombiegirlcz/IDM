package ngh;

import aw0.ja;
import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ko;
import jel.z2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215172a;

    public /* synthetic */ i(int i) {
        this.f215172a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        z2 consensus = (z2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(consensus, "consensus");
        TextLocalisedClause textLocalisedClauseA = qwk.b.a(consensus);
        int i = consensus.f173617a;
        int i2 = consensus.f;
        int iK = ta6.a.K(i, i2);
        int iK2 = ta6.a.K(consensus.f173618b, i2);
        int iK3 = ta6.a.K(consensus.f173619c, i2);
        return new HorizontalHistogramTileDelegate.Model(new ja(new TextLocalisedClause(R$string.wealth_trading_instrument_details_forecasts_consensus_title, u.c(Integer.valueOf(i2)), null, 12), textLocalisedClauseA, null), v.k(new ko(iK, R$attr.uikit_colorPerformancePositive, new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_buy_percentage, u.c(Integer.valueOf(iK)), null, 12)), new ko(iK2, R$attr.uikit_colorDeepGrey, new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_hold_percentage, u.c(Integer.valueOf(iK2)), null, 12)), new ko(iK3, R$attr.uikit_colorPerformanceNegative, new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_sell_percentage, u.c(Integer.valueOf(iK3)), null, 12))), osk.f.RATINGS);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        return ((tsl.c) obj2).f274173a.f104568b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05ee  */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [qv0.i, qv0.o] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [qv0.i, qv0.o] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 3578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ngh.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f215172a = i;
    }
}
