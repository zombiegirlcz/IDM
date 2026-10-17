package hsl;

import aw0.db;
import aw0.o9;
import aw0.q1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f155091a;

    public l(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f155091a = featureToggleInteractor;
    }

    public final q1 a(int i, int i2, dj0.d dVar) {
        Clause moneyClause;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        if (((jte.d) this.f155091a).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c)) {
            m70.a.c(t0.f186434a);
            moneyClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            long jK = cp5.d.k(dVar.f115083b);
            moneyClause = new MoneyClause(pyd.c.U(pyd.c.k(dVar, jK), jK), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, db.EMPHASIS1, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), null, 8);
        }
        return new q1(i2, Integer.valueOf(i2), textLocalisedClause, moneyClause);
    }
}
