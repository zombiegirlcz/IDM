package sdl;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.drawables.AnimatedDrawable;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v2.SelectAutopayMethodScreenV2;
import com.revolut.feature.rewards.impl.R$drawable;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.v1;
import sdl.d1;
import sdl.r;
import slc.c;
import slc.d;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262073a;

    public /* synthetic */ y(int i) {
        this.f262073a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f262073a) {
            case 0:
                r.g.Companion bVar = r.g.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 1:
                return i0.Companion.serializer();
            case 2:
                return qlm.j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.TradingProduct.State", i0.values(), new String[]{"DISABLED", "AVAILABLE", "ONBOARDING", "ACTIVE", "REMEDIATION_REQUIRED", "OFFBOARDING", "OFFBOARDED"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 3:
                r.h.Companion bVar2 = r.h.INSTANCE;
                return qlm.j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.AccountState", m.values(), new String[]{"CREATED", "ONBOARDING", "ACTIVE", "SUSPENDED", "OFFBOARDING", "TERMINATED"}, new Annotation[][]{null, null, null, null, null, null});
            case 4:
                r.h.Companion bVar3 = r.h.INSTANCE;
                return l0.Companion.serializer();
            case 5:
                return qlm.j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountHolderTypeDto", l0.values(), new String[]{"PERSONAL", "PERSONAL_JOINT", "YOUTH"}, new Annotation[][]{null, null, null});
            case 6:
                return qlm.j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountPermittedActionDto", q0.values(), new String[]{"TRANSFER_IN", "TRANSFER_OUT"}, new Annotation[][]{null, null});
            case 7:
                return l0.Companion.serializer();
            case 8:
                return new qlm.e(y0.f262074a);
            case 9:
                return new qlm.e(r.INSTANCE.serializer());
            case 10:
                return new qlm.e(s0.f262058a);
            case 11:
                d1.Companion bVar4 = d1.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingProductDetailsDto", p0Var.b(d1.class), new KClass[]{p0Var.b(d1.a.class), p0Var.b(d1.c.a.class), p0Var.b(d1.c.b.class), p0Var.b(d1.c.C1454c.class), p0Var.b(d1.c.d.class)}, new KSerializer[]{d1.a.C1451a.f261950a, d1.c.a.C1452a.f261953a, d1.c.b.a.f261956a, d1.c.C1454c.a.f261959a, d1.c.d.a.f261962a}, new Annotation[]{new h1()});
            case 12:
                return new qlm.e(ie0.o.f160615a);
            case 13:
                return new qlm.e(ie0.o.f160615a);
            case 14:
                sg0.b bVar5 = sg0.c.Companion;
                return Boolean.FALSE;
            case 15:
                return Unit.f186387a;
            case 16:
                return Unit.f186387a;
            case 17:
                return zhm.v.k(Integer.valueOf(R$drawable.placeholder_big_tile_red), Integer.valueOf(R$drawable.placeholder_big_tile_terracota), Integer.valueOf(R$drawable.placeholder_big_tile_orange), Integer.valueOf(R$drawable.placeholder_big_tile_yellow), Integer.valueOf(R$drawable.placeholder_big_tile_lime), Integer.valueOf(R$drawable.placeholder_big_tile_light_green), Integer.valueOf(R$drawable.placeholder_big_tile_green), Integer.valueOf(R$drawable.placeholder_big_tile_teal), Integer.valueOf(R$drawable.placeholder_big_tile_cyan), Integer.valueOf(R$drawable.placeholder_big_tile_sky), Integer.valueOf(R$drawable.placeholder_big_tile_indigo), Integer.valueOf(R$drawable.placeholder_big_tile_deep_purple), Integer.valueOf(R$drawable.placeholder_big_tile_purple), Integer.valueOf(R$drawable.placeholder_big_tile_pink), Integer.valueOf(R$drawable.placeholder_big_tile_brown), Integer.valueOf(R$drawable.placeholder_big_tile_deep_gray));
            case 18:
                KProperty[] kPropertyArr = SelectAutopayMethodScreenV2.c0;
                return new ProductSelectionDelegate();
            case 19:
                return zhm.f0.f322471a;
            case 20:
                c.b.C1470b c1470b = c.b.Companion;
                return qlm.j1.b("com.revolut.feature.robo.impl.data.network.model.RoboAccountDto.AccountInformationDto.OnboardingStatus", c.b.EnumC1471c.values());
            case 21:
                d.b bVar6 = slc.d.Companion;
                return qlm.j1.b("com.revolut.feature.robo.impl.data.network.model.RoboPortfolioDto.State", d.e.values());
            case 22:
                d.b bVar7 = slc.d.Companion;
                return new qlm.e(qlm.j1.b("com.revolut.feature.robo.impl.data.network.model.RoboPortfolioDto.RebalanceType", d.EnumC1474d.values()));
            case 23:
                KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                return new InputChecklistDelegate();
            case 24:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 25:
                KProperty[] kPropertyArr3 = AnalyticsDashboardController.f87528r0;
                return new tw0.x0();
            case 26:
                KProperty[] kPropertyArr4 = WealthTransferPickerController.V;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr5 = BPayReviewScreen.R;
                return new CellDetailsActionDelegate();
            case 28:
                KProperty[] kPropertyArr6 = BPayReviewScreen.R;
                return new CellDetailsNoteDelegate();
            default:
                int i = AnimatedDrawable.e;
                return Unit.f186387a;
        }
    }
}
