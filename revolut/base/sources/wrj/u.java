package wrj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp4.j0;
import wp5.w;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements jki.p {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpcomingPaymentsContract$InputData f299621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mae.o f299622b;

    public u(UpcomingPaymentsContract$InputData inputData, mae.o subscriptionListMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subscriptionListMapper, "subscriptionListMapper");
        this.f299621a = inputData;
        this.f299622b = subscriptionListMapper;
    }

    public static g b(h hVar) {
        List listC = zhm.u.c(new RowDelegate.Model("LIST_ID_NO_UPCOMING_PAYMENTS", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone10), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(hVar.f299600b.f160626a.isEmpty() ? R$string.analytics_widget_committed_spend_details_no_payments_yet : R$string.analytics_widget_committed_spend_details_no_payments_left, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new g(listC, new d(new MoneyClause(new dj0.d(0L, hVar.f299600b.d), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
    }

    public static g c() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_ERROR", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(zhm.u.c(model), c.f299594a);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f299593a, new w(26), new wm9.k(this, 25), new j0(this, 2));
    }
}
