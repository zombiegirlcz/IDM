package zr4;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreen;
import com.revolut.feature.transport.impl.ui.help.main.TransportHelpMainScreen;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import zr7.b;
import zr7.k;
import zr7.m;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324552a;

    public /* synthetic */ b(int i) {
        this.f324552a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f324552a) {
            case 0:
                KProperty[] kPropertyArr = InstalmentDetailsScreen.f69363b0;
                return new LargeActionButtonDelegate();
            case 1:
                KProperty[] kPropertyArr2 = InstalmentDetailsScreen.f69363b0;
                return new CounterTextDelegate();
            case 2:
                KProperty[] kPropertyArr3 = InstalmentDetailsScreen.f69363b0;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr4 = InstalmentDetailsScreen.f69363b0;
                return new FullScreenStateDelegate();
            case 4:
                KProperty[] kPropertyArr5 = InstalmentDetailsScreen.f69363b0;
                return new CellDetailsDelegate();
            case 5:
                KProperty[] kPropertyArr6 = InstalmentDetailsScreen.f69363b0;
                return new CellDetailsActionDelegate();
            case 6:
                return new qlm.e(zr5.g.f324589a);
            case 7:
                return new qlm.e(zr7.k.Companion.serializer());
            case 8:
                b.Companion companion = zr7.b.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.BottomSheetDto.ActionDto", p0Var.b(zr7.b.class), new KClass[]{p0Var.b(b.C1801b.class), p0Var.b(b.c.class)}, new KSerializer[]{new d1("DISMISS", b.C1801b.INSTANCE, new Annotation[]{new zr7.j()}), new d1("UNKNOWN", b.c.INSTANCE, new Annotation[]{new zr7.j()})}, new Annotation[]{new zr7.j()});
            case 9:
                return new d1("DISMISS", b.C1801b.INSTANCE, new Annotation[]{new zr7.j()});
            case 10:
                return new d1("UNKNOWN", b.c.INSTANCE, new Annotation[]{new zr7.j()});
            case 11:
                return zr7.b.INSTANCE.serializer();
            case 12:
                k.b bVar = zr7.k.Companion;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.BottomSheetDto.ItemDto", p0Var2.b(zr7.k.class), new KClass[]{p0Var2.b(k.a.class), p0Var2.b(k.c.class)}, new KSerializer[]{k.a.C1802a.f324632a, new d1("UNKNOWN", k.c.INSTANCE, new Annotation[]{new zr7.j()})}, new Annotation[]{new zr7.j()});
            case 13:
                return new d1("UNKNOWN", k.c.INSTANCE, new Annotation[]{new zr7.j()});
            case 14:
                m.a aVar = zr7.m.Companion;
                p0 p0Var3 = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.ContentItemDto", p0Var3.b(zr7.m.class), new KClass[]{p0Var3.b(m.b.class), p0Var3.b(m.c.class), p0Var3.b(m.d.class)}, new KSerializer[]{m.b.a.f324640a, m.c.a.f324643a, m.d.a.f324647a}, new Annotation[]{new zr7.n()});
            case 15:
                return cs7.b.INSTANCE.serializer();
            case 16:
                return new qlm.e(fs7.v.f137651a);
            case 17:
                return new qlm.e(as7.i.f8844a);
            case 18:
                KProperty[] kPropertyArr7 = CreditCardBoletoDetailsScreen.V;
                return new FullScreenStateDelegate();
            case 19:
                KProperty[] kPropertyArr8 = CreditCardBoletoDetailsScreen.V;
                return new CellDetailsDelegate();
            case 20:
                KProperty[] kPropertyArr9 = CreditCardBoletoDetailsScreen.V;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr10 = CreditCardBoletoDetailsScreen.V;
                return new CellDetailsActionDelegate();
            case 22:
                KProperty[] kPropertyArr11 = InvestmentProjectionsScreen.f107027e0;
                return new ForecastDelegate();
            case 23:
                KProperty[] kPropertyArr12 = InvestmentProjectionsScreen.f107027e0;
                return new HeaderDelegate();
            case 24:
                KProperty[] kPropertyArr13 = InvestmentProjectionsScreen.f107027e0;
                return new InputSliderDelegate();
            case 25:
                KProperty[] kPropertyArr14 = InvestmentProjectionsScreen.f107027e0;
                return new TextDelegate();
            case 26:
                KProperty[] kPropertyArr15 = InvestmentProjectionsScreen.f107027e0;
                return new FullScreenStateDelegate();
            case 27:
                KProperty[] kPropertyArr16 = TransportHelpMainScreen.S;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr17 = TransportHelpMainScreen.S;
                return new PlainTextWarningDelegate();
            default:
                KProperty[] kPropertyArr18 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                return new PlainTextDelegate();
        }
    }
}
