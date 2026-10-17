package ruk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import ip0.xc;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements jki.p {

    @NotNull
    private static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f257594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f257595b;

    public b0(a0 analystsRatingsPageBuilder, w priceTargetPageBuilder) {
        Intrinsics.checkNotNullParameter(analystsRatingsPageBuilder, "analystsRatingsPageBuilder");
        Intrinsics.checkNotNullParameter(priceTargetPageBuilder, "priceTargetPageBuilder");
        this.f257594a = analystsRatingsPageBuilder;
        this.f257595b = priceTargetPageBuilder;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        k kVar = new k(domainState.f257599a.name(), domainState.f257599a.a());
        List listK = zhm.v.k(new com.revolut.core.ui_kit.views.q("ANALYST_RATINGS", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_home_tab_ratings, null, null, 14)), 58), new com.revolut.core.ui_kit.views.q("ANALYST_TARGETS", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_home_tab_targets, null, null, 14)), 58));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xc xcVar = new xc("ANALYST_RATINGS-content", (List) iii.c.f(domainState.f, new ru6.r(3), new ru5.m(6), new rbe.c(this.f257594a, domainState, 15)), 0, null, null, 0, 0, 0, 1020);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        w wVar = this.f257595b;
        return new l(kVar, listK, zhm.v.k(xcVar, new xc("ANALYST_TARGETS-content", (List) iii.c.f(data, new ru6.r(wVar, 1), new ru5.m(4), new rbe.c(domainState, wVar, 14)), 0, null, null, 0, 0, 0, 1020)));
    }
}
