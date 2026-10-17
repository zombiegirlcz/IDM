package u9a;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.payid.impl.screen.send.contacts.ContactsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreen;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.h0;
import qlm.v1;
import uh8.b;
import uh8.e;
import uj1.d;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278431a;

    public /* synthetic */ b(int i) {
        this.f278431a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f278431a) {
            case 0:
                KProperty[] kPropertyArr = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new CellDetailsDelegate();
            case 1:
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 2:
                qta.f[] elements = {qta.f.DAY, qta.f.WEEK, qta.f.MONTH, qta.f.SIX_MONTH, qta.f.YEAR, qta.f.FIVE_YEARS, qta.f.ALL};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return (qta.f[]) kotlin.collections.d.L(elements).toArray(new qta.f[0]);
            case 3:
                return new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
            case 4:
                KProperty[] kPropertyArr2 = ContactsScreen.R;
                return new FullScreenStateDelegate();
            case 5:
                KProperty[] kPropertyArr3 = ContactsScreen.R;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr4 = PixQrCodeMoneyBreakdownScreen.R;
                return new CellDetailsDelegate();
            case 7:
                return new LargeActionButtonDelegate();
            case 8:
                return new PromptMarketingContentDelegate();
            case 9:
                return new PromptMarketingContentLoadingDelegate();
            case 10:
                KProperty[] kPropertyArr5 = YourCashbackHomeScreen.g0;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr6 = YourCashbackHomeScreen.g0;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr7 = YourCashbackHomeScreen.g0;
                return new CounterTextDelegate();
            case 13:
                KProperty[] kPropertyArr8 = YourCashbackHomeScreen.g0;
                return new BannerDelegate();
            case 14:
                KProperty[] kPropertyArr9 = YourCashbackHomeScreen.g0;
                return new ActionWidgetDelegate();
            case 15:
                return vkm.q.a(0, 1, ukm.f.DROP_OLDEST);
            case 16:
                b.Companion companion = uh8.b.INSTANCE;
                return new qlm.e(uh8.k.f280155a);
            case 17:
                e.Companion companion2 = uh8.e.INSTANCE;
                return new qlm.e(uh8.k.f280155a);
            case 18:
                return uha.k.Companion.serializer();
            case 19:
                return new d1("accountClosed", uha.d.INSTANCE, new Annotation[0]);
            case 20:
                return new d1("notOnboarded", uha.f.INSTANCE, new Annotation[0]);
            case 21:
                return new d1("onboarded", uha.g.INSTANCE, new Annotation[0]);
            case 22:
                return uha.x.Companion.serializer();
            case 23:
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 24:
                return ExtendedSubaccountType.INSTANCE.serializer();
            case 25:
                d.Companion bVar = uj1.d.INSTANCE;
                return new qlm.e(uj1.a.f280467a);
            case 26:
                KProperty[] kPropertyArr10 = CFACInsuranceExactReasonScreen.c0;
                return new CellDetailsChevronDelegate();
            case 27:
                KProperty[] kPropertyArr11 = CFACInsuranceExactReasonScreen.c0;
                return new ActionWidgetDelegate();
            case 28:
                return new qlm.e(ujb.e.f280551a);
            default:
                return new qlm.e(ujb.o.f280574a);
        }
    }
}
