package ooc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a(Template template, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(template, "template");
        xdh.a riskProfile = template.f95707b;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(j6.a.q("about-portfolio-title-listId-", riskProfile.name()), (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_robo_portfolio_about_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.wealth_robo_portfolio_about_show_less, null, null, 14) : new TextLocalisedClause(R$string.wealth_robo_portfolio_about_show_more, null, null, 14);
        v5 u5Var = z ? new u5(3, textLocalisedClause) : new s5(3, textLocalisedClause);
        String str = "about-portfolio-text-listId-" + riskProfile.name();
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        int i2 = c.f227027a[riskProfile.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_robo_portfolio_about_defensive;
        } else if (i2 == 2) {
            i = R$string.wealth_robo_portfolio_about_slow_and_steady;
        } else if (i2 == 3) {
            i = R$string.wealth_robo_portfolio_about_balanced;
        } else if (i2 == 4) {
            i = R$string.wealth_robo_portfolio_about_bold;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_robo_portfolio_about_aggressive;
        }
        PlainTextDelegate.Model model2 = new PlainTextDelegate.Model(str, (Clause) null, (Clause) new TextLocalisedClause(i, null, null, 14), u5Var, (UrlImage) null, false, (pa) null, (Object) new ooc.a(template), (AnalyticsContext) null, 0, 0, 0, 0, 64462);
        yp0.b.l(model2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return i2b.a.r(model, model2);
    }
}
