package cp2;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.bank_account_switching.api.R$string;
import ip0.qe0;
import ip0.we0;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        we0 we0Var = new we0("ID_HEADER_ICON", new qe0(-2, ao2.a.a()));
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_TEXT", (Clause) null, (Clause) new TextLocalisedClause(R$string.account_switch_request_review_confirmation_ltd_text, u.c(new TextLocalisedClause(R$string.account_switch_request_review_confirmation_ltd_link, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "ID_TEXT_LINK", false), 10)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new cii.b(null, v.k(we0Var, model, new LargeActionButtonDelegate.Model("ID_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.account_switch_request_review_confirmation_ltd_cta, null, null, 14), false, null, null, null, null, 1000)), null);
    }
}
