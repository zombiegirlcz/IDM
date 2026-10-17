package vi9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import mx0.v5;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public static rp0.y a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, e eVar) {
        rp0.t tVar = new rp0.t(textLocalisedClause, null, new rp0.v("menu-warning-image", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), 26);
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("content", (Clause) null, (Clause) new CompositeClause(zhm.u.c(textLocalisedClause2), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        String str = eVar.f289538a;
        TextLocalisedClause textLocalisedClause3 = eVar.f289539b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp16;
        return new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause3, false, null, null, i, R$attr.uikit_dp24, i, i, 496)), tVar, rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
    }
}
