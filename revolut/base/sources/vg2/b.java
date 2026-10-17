package vg2;

import aw0.h;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmendment;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.upi.api.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;
import vf0.p;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements g {

    @NotNull
    public static final a Companion = new a();

    @Override // vg2.g
    public final TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.upi_subscription_confirmation_update_title, null, null, 14);
    }

    @Override // vg2.g
    public final List b(tg2.d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(domainState.f271042a, new p(22), new vea.b(12), new w(this, 28));
    }

    @Override // vg2.g
    public final h c(tg2.d domainState) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = (ApmPaymentAuthorisationPendingAction) domainState.f271042a.getContent();
        if (apmPaymentAuthorisationPendingAction == null) {
            return null;
        }
        ApmPaymentAuthorisationPendingAction.Amendment amendment = apmPaymentAuthorisationPendingAction instanceof ApmPaymentAuthorisationPendingAction.Amendment ? (ApmPaymentAuthorisationPendingAction.Amendment) apmPaymentAuthorisationPendingAction : null;
        if (amendment == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApmPaymentAuthorisationAmendment apmPaymentAuthorisationAmendment = amendment.f61990a;
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationAmendment.f.f61995g;
        PaymentMethodDetails.Upi upi2 = paymentMethodDetails instanceof PaymentMethodDetails.Upi ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
        if (upi2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = upi2.f62071c.f62030a;
        LocalDate localDate = apmPaymentAuthorisationAmendment.d;
        Long lValueOf = localDate != null ? Long.valueOf(oc.c.F(localDate)) : null;
        if (str == null || lValueOf == null) {
            textLocalisedClause = null;
        } else {
            long jLongValue = lValueOf.longValue();
            int i = R$string.mandate_details_authorisation_upi_expiration_message;
            Object[] elements = {new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(jLongValue, new TimeClause.Format.Pretty(q0.DATETIME_WITH_SECONDS), null, null, 12)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            textLocalisedClause = new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12);
        }
        return c.a(new TextLocalisedClause(R$string.upi_subscription_confirmation_authorize_changes, null, null, 14), new TextLocalisedClause(R$string.upi_subscription_confirmation_decline_changes, null, null, 14), textLocalisedClause);
    }

    @Override // vg2.g
    public final boolean d(tg2.d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return domainState.f271042a.getContent() != null;
    }

    public final CellDetailsDelegate.Model e(String str, TextLocalisedClause textLocalisedClause, bx1.a aVar) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), aVar.a(new p(this, 26)), aVar.b(new p(this, 27)), null, null, null, 0, null, false, false, null, null, 32752);
    }
}
