package fhj;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f135252a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f135252a = featureToggleInteractor;
    }

    public static TextLocalisedClause b(dj0.d dVar) {
        return new TextLocalisedClause(R$string.esim_checkout_footer_action_pay, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
    }

    public final TextLocalisedClause a() {
        boolean zC = ((jte.d) this.f135252a).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c);
        if (zC) {
            return new TextLocalisedClause(R$string.esim_checkout_insufficient_balance_actions_pay, null, null, 14);
        }
        if (zC) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(R$string.esim_checkout_actions_pay_now, null, null, 14);
    }
}
