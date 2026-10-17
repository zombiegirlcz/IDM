package uv6;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.jf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import hha.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f283340a;

    public o(wv6.a upsellClauseFactory) {
        Intrinsics.checkNotNullParameter(upsellClauseFactory, "upsellClauseFactory");
        this.f283340a = w.y0(new us4.b(21));
    }

    public final RowDelegate.Model a(ht6.a aVar, boolean z) {
        TextLocalisedClause textLocalisedClause;
        dj0.d dVarN;
        hha.d pricingPlan = aVar.f155327b;
        String str = pricingPlan.f152288b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_cashback_upsell_card_title, u.c(new PercentageClause(aVar.f155326a, (PercentageClause.Format) null, (Style) null, 6)), null, 12);
        if (z) {
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            textLocalisedClause = s.o(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_current_private, null, null, 14) : s.p(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_current_ultra, null, null, 14) : s.j(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_current_metal, null, null, 14) : s.n(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_current_premium, null, null, 14) : s.m(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_current_plus, null, null, 14) : new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_current_standard, null, null, 14);
        } else {
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            textLocalisedClause = s.o(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_upgrade_private, null, null, 14) : s.p(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_upgrade_ultra, null, null, 14) : s.j(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_upgrade_metal, null, null, 14) : s.n(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_upgrade_premium, null, null, 14) : s.m(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_upsell_plans_upgrade_plus, null, null, 14) : null;
        }
        CdnImage cdnImage = (s.o(pricingPlan) || s.p(pricingPlan)) ? new CdnImage("ultra_cards", "mobile/cards", null, null, null, null, Constants.TAG_FC_SPEED_MODE) : s.j(pricingPlan) ? new CdnImage("metal_cards", "mobile/cards", null, null, null, null, Constants.TAG_FC_SPEED_MODE) : s.n(pricingPlan) ? new CdnImage("premium_cards", "mobile/cards", null, null, null, null, Constants.TAG_FC_SPEED_MODE) : s.m(pricingPlan) ? new CdnImage("plus_cards", "mobile/cards", null, null, null, null, Constants.TAG_FC_SPEED_MODE) : new CdnImage("standard_cards", "mobile/cards", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(cdnImage, null, null, false, null, false, 62);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        int i = R$string.freelancer_cashback_upsell_card_pricing_monthly_caption;
        Period periodA = pi3.b.a(hha.i.MONTHLY);
        if (periodA == null || (dVarN = cp5.c.n(pricingPlan, periodA)) == null) {
            dj0.d.Companion.getClass();
            dVarN = dj0.d.e;
        }
        RowDelegate.Model model = new RowDelegate.Model(str, image40, textLocalisedClause2, null, 0, textLocalisedClause, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, u.c(new jf(new TextLocalisedClause(i, u.c(new MoneyClause(dVarN, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), resourceImage)), false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532671448);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(new h((Clause) iii.c.f(domainState.f283330c, new uv1.c(5), new utk.b(5), new u3b.h(28))), (List) iii.c.f(t1.t(domainState.f283329b, domainState.f283328a), new uv1.c(6), new utk.b(6), new uk2.w(this, 14)));
    }
}
