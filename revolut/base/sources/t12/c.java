package t12;

import aw0.o9;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.k;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oi0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final ActionWidgetDelegate.Model a(b12.a info) {
        ActionWidgetDelegate.Model.b pVar;
        Intrinsics.checkNotNullParameter(info, "info");
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = info.f11710a;
        ApmPaymentAuthorisationSummary f61991a = apmPaymentAuthorisationPendingAction.getF61991a();
        Clause textLocalisedClause = info.d;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_payment_confirmation_pending_action_review, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        LocalDateTime localDateTime = f61991a.f61998l;
        String strQ = j6.a.q("PENDING_ACTION_ID_", f61991a.f61992a);
        TextClause textClause = info.f11712c;
        Object[] elements = {localDateTime != null ? new TimeClause(d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12) : null, new TextLocalisedClause(R$string.apm_payment_confirmation_pending_action_authorisation_neeeded, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        t0 t0Var = t0.f186434a;
        CompositeClause compositeClause = new CompositeClause(listL, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        m mVar = new m(info.f11711b, (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10);
        dj0.d dVar = f61991a.f;
        if (dVar != null) {
            MoneyClause moneyClause = new MoneyClause(dVar.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            pVar = new p(moneyClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        } else {
            pVar = ActionWidgetDelegate.Model.b.C0394b.f51606a;
        }
        Clause clause2 = info.e;
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(strQ, textClause, compositeClause, mVar, pVar, clause2 != null ? new k(clause, clause2, null, null, Constants.TAG_FC_SPEED_MODE) : new i(14, clause, null, false), null, apmPaymentAuthorisationPendingAction, null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
