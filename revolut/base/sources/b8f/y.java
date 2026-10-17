package b8f;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.SummaryCardDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.ph;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroItem;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$InputData;
import d9.e1;
import ip0.yt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.d7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements cli.n {

    @NotNull
    private static final x Companion = new x();
    public static final int e = R$drawable.uikit_icn_24_logo_revolut;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRevealScreenContract$InputData f13254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f13255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1h.h f13256c;
    public final aw0.e d;

    public y(PortfolioRevealScreenContract$InputData inputData, f01.c uiKitResources, d1h.h remoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(remoteDisclaimersMapper, "remoteDisclaimersMapper");
        this.f13254a = inputData;
        this.f13255b = uiKitResources;
        this.f13256c = remoteDisclaimersMapper;
        this.d = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.managed_portfolios_reveal_intro_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
    }

    public final Integer a(String str) throws Throwable {
        String strE0 = d0.e0(str, "icn_");
        int iA = this.f13255b.a(strE0);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            hx7.e.n(new IllegalArgumentException(j6.a.s("Unknown iconName = ", str, " (normalized = ", strE0, ")")));
        }
        return numValueOf;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) throws Throwable {
        t domainState = (t) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData = this.f13254a;
        TemplateIntro templateIntro = portfolioRevealScreenContract$InputData.f91427b;
        RiskMetrics riskMetrics = portfolioRevealScreenContract$InputData.f91428c;
        d1h.g gVar = domainState.f13250a;
        aim.e eVarB = zhm.u.b();
        TextClause textClause = new TextClause(templateIntro.f91244a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(templateIntro.f91246c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Integer numA = a(templateIntro.f91245b);
        eVarB.add(new SummaryCardDelegate.Model(textClause, textClause2, new AvatarModel.Default(numA != null ? new GlyphImage(numA.intValue(), null, null, 6) : new GlyphImage(e, null, null, 6), null, null, null, null, null, 126), new ph(new TextLocalisedClause(R$string.wealth_robo_strategy_reveal_target_return, null, null, 14), new PercentageClause(e1.Z(riskMetrics.f85037m), (PercentageClause.Format) null, (Style) null, 6), riskMetrics.f85042s != null ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null), new ph(new TextLocalisedClause(R$string.wealth_robo_strategy_reveal_risk_level, null, null, 14), new TextClause(templateIntro.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), templateIntro.f91247g != null ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null)));
        ArrayList arrayList = templateIntro.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            TemplateIntroItem templateIntroItem = (TemplateIntroItem) obj2;
            String strN = a0.d.n("portfolio_reveal_item_", i);
            Integer numA2 = a(templateIntroItem.f91249b);
            j8 j8Var = new j8(numA2 != null ? new ResourceImage(numA2.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new ResourceImage(e, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP);
            TextClause textClause3 = new TextClause(templateIntroItem.f91248a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = templateIntroItem.f91250c;
            TextClause textClause4 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            int i3 = R$attr.uikit_dp32;
            arrayList2.add(new ListCellDelegate.Model(strN, j8Var, textClause3, textClause4, false, null, null, 0, 0, i3, i3, 992));
            i = i2;
        }
        eVarB.addAll(arrayList2);
        if (gVar != null) {
            eVarB.addAll(((gah.g) this.f13256c).c(gVar, d7.DEFAULT));
        }
        return new w(zhm.u.a(eVarB), this.d);
    }
}
