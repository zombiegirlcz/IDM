package l5i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements p4i.f {
    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.RateExplanation screen2 = (Screen.RateExplanation) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        t tVar = new t(new TextLocalisedClause(R$string.payments_core_fees_bank_transfer_section_fx_rate, null, null, 14), null, null, 30);
        List listK = v.k(new TextLocalisedClause(R$string.payments_breakdown_revolut_rate_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new RateExplanationDialogMapper.LearnMoreFaq("question.what-foreign-exchange-rate-will-i-get"), "EXCHANGE_RATE_EXPLANATION_LEARN_MORE", false), 10));
        m70.a.t(t0.f186434a);
        r rVarJust = r.just(new y(u.c(new TextDelegate.Model("FOOTER_ITEM_ID", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ck0(0), null, null, 0, 0, 0, 0, 2036)), tVar, null, null, screen2, null, 988));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
