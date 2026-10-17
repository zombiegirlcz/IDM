package k8c;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.revolutpay.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k8c.a domainState = (k8c.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_TEXT", (Clause) null, (Clause) yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.revolut_pay_order_summary_ramp_fees_disclaimer_description, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_order_summary_ramp_fees_disclaimer_link, null, new Click(30, (Integer) null, (Object) null, "ID_LEARN_MORE_TEXT", false), 10))), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        eVarB.add(model2);
        return new cii.b(null, u.a(eVarB), new lw0.a(new TextLocalisedClause(R$string.revolut_pay_order_summary_ramp_fees_disclaimer_title, null, null, 14), null, null, null, false, 30));
    }
}
