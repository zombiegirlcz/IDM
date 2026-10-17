package s1g;

import androidx.content.internal.NavBackStackEntryImpl;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.CobrandedCardsAccountCreationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.fx;
import ip0.s7;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.v1;
import qv0.c;
import s1l.d0;
import s1l.h0;
import s1l.q0;
import s1l.r;
import s1l.x;
import s6h.m;
import s77.a0;
import s77.n;
import s77.q;
import s77.z;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259134a;

    public /* synthetic */ a(int i) {
        this.f259134a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f259134a) {
            case 0:
                KProperty[] kPropertyArr = TravelExperiencesCancellationScreen.f93021h0;
                return new CellDetailsDelegate();
            case 1:
                KProperty[] kPropertyArr2 = TravelExperiencesCancellationScreen.f93021h0;
                return new TwinHorizontalButtonDelegate();
            case 2:
                return new qlm.e(v1.f247718a);
            case 3:
                return new qlm.e(x.f259218a);
            case 4:
                d0.Companion companion = d0.INSTANCE;
                return new qlm.e(r.f259203a);
            case 5:
                return new qlm.e(h0.f259180a);
            case 6:
                return new qlm.e(h0.f259180a);
            case 7:
                return new qlm.e(q0.f259202a);
            case 8:
                KProperty[] kPropertyArr3 = TravelExperiencesVisitorInformationScreen.c0;
                return new InputTextDelegate(null);
            case 9:
                KProperty[] kPropertyArr4 = TravelExperiencesVisitorInformationScreen.c0;
                return new ListSubheaderDelegate();
            case 10:
                return new TextDelegate.Model("STOCKS_FOOTER_LIST_ID", new TextLocalisedClause(R$string.wealth_trading_discovery_eea_disclaimer, null, null, 14), false, new ak0(null, null, 3), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908);
            case 11:
                return NavBackStackEntryImpl.defaultFactory_delegate$lambda$0();
            case 12:
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10();
            case 13:
                KProperty[] kPropertyArr5 = DeFiSendAmountScreen.U;
                return new FullScreenStateDelegate();
            case 14:
                KProperty[] kPropertyArr6 = DeFiSendAmountScreen.U;
                return new CellDetailsDelegate();
            case 15:
                KProperty[] kPropertyArr7 = LoanSelectNewRepaymentDayV2Screen.T;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr8 = LoanSelectNewRepaymentDayV2Screen.T;
                return new CellDetailsDelegate();
            case 17:
                KProperty[] kPropertyArr9 = LoanSelectNewRepaymentDayV2Screen.T;
                return new GridSingleChoiceDelegate();
            case 18:
                KProperty[] kPropertyArr10 = CobrandedCardsAccountCreationScreen.R;
                return new InputTextDelegate(null);
            case 19:
                KProperty[] kPropertyArr11 = CobrandedCardsAccountCreationScreen.R;
                return new FullScreenStateDelegate();
            case 20:
                m.a aVar = m.Companion;
                Intrinsics.checkNotNullParameter("MARGIN_CHART_LOADING", "listId");
                fx fxVar = new fx();
                fxVar.f164316a = c.d.f249513a;
                fxVar.f164317b = null;
                fxVar.f164318c = null;
                fxVar.d = null;
                fxVar.e = null;
                List listC = u.c(fxVar);
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listC2 = u.c(new s7("REQUIRED_MINIMUM_ITEM_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return w.u(v.k(listC, listC2));
            case 21:
                m.a aVar2 = m.Companion;
                return u.c(new IconNavBarMenuItem("INFO_MENU_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.wealth.gia.margin_trading.impl.R$string.wealth_trading_margin_details_header_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            case 22:
                m.a aVar3 = m.Companion;
                List listC3 = u.c(new CellDetailsChevronDelegate.Model("LIST_ID_REQUIRED_MINIMUM_ITEM", new TextLocalisedClause(com.revolut.feature.wealth.gia.margin_trading.impl.R$string.wealth_trading_margin_status_details_item_title, null, null, 14), 0, false, null, null, null, 2044));
                yp0.b.k(listC3, 0, 0, 0, 0, 31);
                return listC3;
            case 23:
                q.Companion companion2 = q.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.global_markets.impl.data.network.MarketAssetDto", p0Var.b(q.class), new KClass[]{p0Var.b(q.a.class), p0Var.b(q.c.class), p0Var.b(q.d.class), p0Var.b(q.e.class)}, new KSerializer[]{q.a.C1444a.f260555a, q.c.a.f260558a, q.d.a.f260561a, new d1("com.revolut.feature.global_markets.impl.data.network.MarketAssetDto.UnknownAssetDto", q.e.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 24:
                return new d1("com.revolut.feature.global_markets.impl.data.network.MarketAssetDto.UnknownAssetDto", q.e.INSTANCE, new Annotation[0]);
            case 25:
                return new qlm.e(q.INSTANCE.serializer());
            case 26:
                return z.Companion.serializer();
            case 27:
                return new qlm.e(v1.f247718a);
            case 28:
                return new qlm.e(n.f260550a);
            default:
                return new qlm.e(a0.f260528a);
        }
    }
}
