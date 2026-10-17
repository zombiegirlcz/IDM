package mb2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.p;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.payto.api.R$string;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ActionWidgetDelegate.Model a(String str, CompositeClause compositeClause, PaymentMethodDetails.Creditor creditor, d dVar) {
        String str2 = creditor.f62030a;
        if (str2 == null) {
            str2 = "";
        }
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), compositeClause, new m(new ContactImage((String) null, (String) null, (String) null, (String) null, creditor.d, creditor.f62030a, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4047), (NewBadgeContent.WithNumber) null, new WarningCircleBadge(dw0.a.Pending), 10), dVar != null ? new p(new MoneyClause(dVar.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : ActionWidgetDelegate.Model.b.C0394b.f51606a, new i(14, new TextLocalisedClause(R$string.apm_payment_confirmation_pending_action_review_authorisation, null, null, 14), null, false), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static CompositeClause b(long j2) {
        return new CompositeClause(v.k(new TimeClause(j2, new TimeClause.Format.Pretty(0), null, null, 12), new TextLocalisedClause(R$string.apm_payment_confirmation_pending_action_authorisation_neeeded, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorOrange_90), false, false, 254), 10)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
