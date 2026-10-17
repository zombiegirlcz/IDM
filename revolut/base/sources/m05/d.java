package m05;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.list.ApmListScreen;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.insurance_pet.impl.ui.profile.help.PetGetHelpActivity;
import com.revolut.feature.rev_points.models.Logo;
import com.revolut.feature.rev_points.models.RevPointsRichText;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import m1c.k1;
import m1c.l1;
import m1c.o1;
import m2l.f0;
import m2l.k0;
import mx0.pc;
import qlm.h0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201057a;

    public /* synthetic */ d(int i) {
        this.f201057a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f201057a) {
            case 0:
                return new qlm.e(w.f201084a);
            case 1:
                return new qlm.e(a.f201052a);
            case 2:
                return new qlm.e(t.f201080a);
            case 3:
                return new qlm.e(q.f201076a);
            case 4:
                int i = PetGetHelpActivity.f76392x0;
                return new RowDelegate(null, null, 7);
            case 5:
                int i2 = PetGetHelpActivity.f76392x0;
                return new TwinHorizontalButtonDelegate();
            case 6:
                return zhm.v.k(c1b.h.ONE_MINUTE, c1b.h.TWO_MINUTES, c1b.h.FIVE_MINUTES, c1b.h.TEN_MINUTES, c1b.h.ONE_HOUR, c1b.h.ONE_DAY, c1b.h.FOUR_DAYS, c1b.h.ONE_WEEK, c1b.h.FIVE_WEEKS);
            case 7:
                return zhm.v.k(c1b.h.FIVE_MINUTES, c1b.h.FIFTEEN_MINUTES, c1b.h.THIRTY_MINUTES, c1b.h.ONE_HOUR, c1b.h.FOUR_HOURS, c1b.h.ONE_DAY, c1b.h.ONE_WEEK);
            case 8:
                Logo.b bVar = Logo.Companion;
                return m1c.l.Companion.serializer();
            case 9:
                return j1.b("com.revolut.feature.rev_points.models.Logo.Type", m1c.l.values());
            case 10:
                RevPointsRichText.Companion bVar2 = RevPointsRichText.INSTANCE;
                return new h0(v1.f247718a, RevPointsRichText.Placeholder.a.f84044a, 1);
            case 11:
                RevPointsRichText.Placeholder.Companion bVar3 = RevPointsRichText.Placeholder.INSTANCE;
                return j1.b("com.revolut.feature.rev_points.models.RevPointsRichText.Formatting", k1.values());
            case 12:
                l1.Companion bVar4 = l1.INSTANCE;
                return new h0(v1.f247718a, l1.c.a.f201404a, 1);
            case 13:
                RevPointsTextWithLinks.Companion bVar5 = RevPointsTextWithLinks.INSTANCE;
                return new qlm.e(RevPointsTextWithLinks.Link.a.f84052a);
            case 14:
                o1.Companion bVar6 = o1.INSTANCE;
                return new qlm.e(o1.c.a.f201433a);
            case 15:
                MarketOrderActivity.Companion companion = MarketOrderActivity.INSTANCE;
                return new LargeActionButtonDelegate();
            case 16:
                MarketOrderActivity.Companion companion2 = MarketOrderActivity.INSTANCE;
                return new TextDelegate();
            case 17:
                MarketOrderActivity.Companion companion3 = MarketOrderActivity.INSTANCE;
                return new CellDetailsActionDelegate();
            case 18:
                MarketOrderActivity.Companion companion4 = MarketOrderActivity.INSTANCE;
                return "ORDER_EXCHANGE_FLOW";
            case 19:
                KProperty[] kPropertyArr = ApmListScreen.U;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr2 = ApmListScreen.U;
                return new FullScreenStateDelegate();
            case 21:
                return new pc("limit-reached-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.card_design_tag_limit_reached, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorGroupedBackground), R$attr.uikit_colorTransparent, null, 1000), null);
            case 22:
                return k0.Companion.serializer();
            case 23:
                return new qlm.e(m2l.z.Companion.serializer());
            case 24:
                return k0.Companion.serializer();
            case 25:
                return k0.Companion.serializer();
            case 26:
                return new qlm.e(f0.f202197a);
            case 27:
                return new qlm.e(f0.f202197a);
            case 28:
                return j1.a("com.revolut.retail.feature.wealth.data.core.insights.TradeRecommendationDto", k0.values(), new String[]{"STRONG_BUY", "BUY", "HOLD", "SELL", "STRONG_SELL"}, new Annotation[][]{null, null, null, null, null});
            default:
                KProperty[] kPropertyArr3 = TravelExperiencesSearchResultsScreen.i0;
                return new ListingCardDelegate();
        }
    }
}
