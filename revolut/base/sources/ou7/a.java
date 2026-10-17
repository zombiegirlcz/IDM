package ou7;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nu7.d;
import oki.h;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(l lVar, d navigation, Function1 navigateRequest) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(navigateRequest, "navigateRequest");
        if (navigation instanceof nu7.b) {
            lVar.C1(((nu7.b) navigation).f219220a);
        } else {
            if (!(navigation instanceof nu7.c)) {
                throw new NoWhenBranchMatchedException();
            }
            navigateRequest.invoke(((nu7.c) navigation).f219221a);
        }
    }

    public static final void b(h hVar, String key) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        hVar.C1(u0.c(new FaqFeatureConfig.Starter(key, 2)));
    }

    public static final void c(h hVar, List planIds, String str) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(planIds, "planIds");
        if (!planIds.isEmpty()) {
            hVar.C1(u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, planIds, str, null, false, xfa.b.INSURANCE_HOME, 185)));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("planIds must not be empty");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public static final void d(l lVar, String url2) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(url2, "url");
        lVar.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(url2, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
    }
}
