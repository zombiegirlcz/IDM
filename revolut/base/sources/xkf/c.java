package xkf;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleActionHeaderDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import xli.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306686a;

    public /* synthetic */ c(int i) {
        this.f306686a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f306686a) {
            case 0:
                return zhm.f0.f322471a;
            case 1:
                return zhm.f0.f322471a;
            case 2:
                return zhm.f0.f322471a;
            case 3:
                return zhm.f0.f322471a;
            case 4:
                return zhm.f0.f322471a;
            case 5:
                return zhm.f0.f322471a;
            case 6:
                return zhm.f0.f322471a;
            case 7:
                return zhm.f0.f322471a;
            case 8:
                return zhm.f0.f322471a;
            case 9:
                return zhm.f0.f322471a;
            case 10:
                return zhm.f0.f322471a;
            case 11:
                return zhm.f0.f322471a;
            case 12:
                return zhm.f0.f322471a;
            case 13:
                return zhm.f0.f322471a;
            case 14:
                a.Companion bVar = xli.a.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 15:
                a.Companion bVar2 = xli.a.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 16:
                a.Companion bVar3 = xli.a.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 17:
                return Calendar.getInstance();
            case 18:
                return new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
            case 19:
                return new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
            case 20:
                KProperty[] kPropertyArr = InstitutionsListScreen.S;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr2 = InstitutionsListScreen.S;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr3 = RateDetailsScreen.f103723e0;
                return new TrendViewDelegate(1000L);
            case 23:
                KProperty[] kPropertyArr4 = RateDetailsScreen.f103723e0;
                return new FixedTabsDelegate();
            case 24:
                KProperty[] kPropertyArr5 = RateDetailsScreen.f103723e0;
                return new TabsDelegate();
            case 25:
                KProperty[] kPropertyArr6 = RateDetailsScreen.f103723e0;
                return new SimpleActionHeaderDelegate();
            case 26:
                KProperty[] kPropertyArr7 = CreditCardRepayDetailsControllerScreen.X;
                return new ProgressStepVerticalDelegate();
            case 27:
                KProperty[] kPropertyArr8 = CreditCardRepayDetailsControllerScreen.X;
                return new CellDetailsDelegate();
            case 28:
                KProperty[] kPropertyArr9 = CreditCardRepayDetailsControllerScreen.X;
                return new FullScreenStateDelegate();
            default:
                KProperty[] kPropertyArr10 = CreditCardRepayDetailsControllerScreen.X;
                return new LargeActionButtonDelegate();
        }
    }
}
