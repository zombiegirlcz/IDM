package ync;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.s;
import rp0.y;
import wnc.p;
import wnc.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f315428a;

    public c(nmc.d roboPortfolioUiMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        this.f315428a = roboPortfolioUiMapper;
    }

    public final y a(Template template, Template template2, TextLocalisedClause textLocalisedClause) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_select_portfolio, u.c(this.f315428a.g(template)), null, 12);
        q qVar = new q(template);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("HIGH_RISK_INCREASE_DIALOG_SELECT_HIGHER_RISK_LIST_ID", defaultFilledButton, null, textLocalisedClause2, false, null, qVar, i, i, i2, i2, 368);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_robo_common_cancel, null, null, 14);
        p pVar = new p(template2);
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp16;
        List listK = v.k(model, new LargeActionButtonDelegate.Model("HIGH_RISK_INCREASE_DIALOG_CANCEL_LIST_ID", defaultFilledButton2, null, textLocalisedClause3, false, null, pVar, i3, i3, i5, i5, 368));
        int i6 = R$attr.uikit_dp16;
        int i21 = R$attr.uikit_dp0;
        yp0.b.o(i6, i6, i21, i21, listK);
        return new y(listK, new s(new com.revolut.core.ui_kit.views.f(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_sign, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, new ImageTransformations(null, null, null, null, null, 36, 36, 31), (Clause) null, 182)), new TextLocalisedClause(R$string.wealth_robo_portfolio_about_title, null, null, 14), textLocalisedClause, 24), null, null, null, null, 1020);
    }
}
