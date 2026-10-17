package nk4;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FeedPostDelegate;
import com.revolut.core.ui_kit.delegates.FeedPostLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentslist.PayLaterRepaymentsListScreen;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import nka.p;
import nl0.f;
import pka.f0;
import qlm.h0;
import qlm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216647a;

    public /* synthetic */ d(int i) {
        this.f216647a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f216647a) {
            case 0:
                KProperty[] kPropertyArr = ConfirmAutopayScreen.W;
                return new CellDetailsDelegate();
            case 1:
                KProperty[] kPropertyArr2 = ConfirmAutopayScreen.W;
                return new CellDetailsActionDelegate();
            case 2:
                KProperty[] kPropertyArr3 = ConfirmAutopayScreen.W;
                return new FullScreenStateDelegate();
            case 3:
                KProperty[] kPropertyArr4 = ConfirmAutopayScreen.W;
                return new InputChecklistDelegate();
            case 4:
                KProperty[] kPropertyArr5 = ConfirmAutopayScreen.W;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr6 = PayLaterRepaymentsListScreen.f0;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr7 = PayLaterRepaymentsListScreen.f0;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr8 = PayLaterRepaymentsListScreen.f0;
                return new LargeActionButtonDelegate();
            case 8:
                return new qlm.e(f0.Companion.serializer());
            case 9:
                return new qlm.e(nka.e.f216779a);
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                return new qlm.e(nka.a.f216775a);
            case 12:
                return new qlm.e(nka.a.f216775a);
            case 13:
                return new qlm.e(nka.a.f216775a);
            case 14:
                p.Companion bVar = nka.p.INSTANCE;
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 15:
                return zhm.f0.f322471a;
            case 16:
                return zhm.f0.f322471a;
            case 17:
                return f.a.a(nl0.f.Companion, nl0.j.LEGACY);
            case 18:
                return f.a.a(nl0.f.Companion, nl0.j.STANDARD);
            case 19:
                KProperty[] kPropertyArr9 = TabLifestyleScreen.f89903w0;
                return new HeroBannerDelegate(0);
            case 20:
                KProperty[] kPropertyArr10 = TabLifestyleScreen.f89903w0;
                return new ListSubheaderDelegate();
            case 21:
                KProperty[] kPropertyArr11 = TabLifestyleScreen.f89903w0;
                return new RowsWidgetDelegate();
            case 22:
                KProperty[] kPropertyArr12 = TabLifestyleScreen.f89903w0;
                return new FeedPostLoadingDelegate();
            case 23:
                KProperty[] kPropertyArr13 = TabLifestyleScreen.f89903w0;
                return new PlaceholderRowDelegate();
            case 24:
                KProperty[] kPropertyArr14 = TabLifestyleScreen.f89903w0;
                return new FullScreenStateDelegate();
            case 25:
                KProperty[] kPropertyArr15 = TabLifestyleScreen.f89903w0;
                return new VoucherSmallLoadingDelegate();
            case 26:
                KProperty[] kPropertyArr16 = TabLifestyleScreen.f89903w0;
                return new ChallengeMediumLoadingDelegate();
            case 27:
                KProperty[] kPropertyArr17 = TabLifestyleScreen.f89903w0;
                return new ChallengeMediumDelegate();
            case 28:
                KProperty[] kPropertyArr18 = TabLifestyleScreen.f89903w0;
                return new ActionWidgetDelegate();
            default:
                KProperty[] kPropertyArr19 = TabLifestyleScreen.f89903w0;
                return new FeedPostDelegate();
        }
    }
}
