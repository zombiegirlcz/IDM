package p5k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesInBaseCurrency;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f233174a;

    public l(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f233174a = featureToggleInteractor;
    }

    public final Clause a(dj0.d dVar, dj0.d dVar2, o9 o9Var, Custom custom) {
        if (dVar2 != null) {
            if (((jte.d) this.f233174a).c(PaymentsToggles$PaymentsChargesInBaseCurrency.f79157c)) {
                return new CompositeClause(zhm.v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, o9Var)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
        }
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var);
    }
}
