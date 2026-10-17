package soc;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qoc.y;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f264813a;

    public e(c feeDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(feeDisclaimerMapper, "feeDisclaimerMapper");
        this.f264813a = feeDisclaimerMapper;
    }

    public static List a() {
        return u.c(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(R$string.wealth_robo_account_details_projected_value_disclaimer_with_learn_more, u.c(new TextLocalisedClause(R$string.wealth_robo_common_learn_more, null, new Click(28, (Integer) null, (Object) y.f248155a, "projected-value-learn-more-click", false), 10)), null, 12), "projected-value-disclaimer"));
    }
}
