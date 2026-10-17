package jp9;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreen;
import com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController;
import jr.b0;
import jr.e0;
import jr.e1;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import m2l.k0;
import qlm.j1;
import qlm.v1;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177243a;

    public /* synthetic */ l(int i) {
        this.f177243a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f177243a) {
            case 0:
                return new qlm.e(a.f177233a);
            case 1:
                KProperty[] kPropertyArr = CreditCardCashbackDetailsScreen.Z;
                return new ListSubheaderDelegate();
            case 2:
                KProperty[] kPropertyArr2 = CreditCardCashbackDetailsScreen.Z;
                return new ListCellDelegate();
            case 3:
                KProperty[] kPropertyArr3 = CreditCardCashbackDetailsScreen.Z;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr4 = CreditCardCashbackDetailsScreen.Z;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr5 = CreditCardCashbackDetailsScreen.Z;
                return new VaultsProgressDelegate();
            case 6:
                KProperty[] kPropertyArr6 = CreditCardCashbackDetailsScreen.Z;
                return new ActionWidgetDelegate();
            case 7:
                FlexibleStakingConsentScreenController.a aVar = FlexibleStakingConsentScreenController.Companion;
                return v.k(new TextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
            case 8:
                return new go.g(null, 2);
            case 9:
                return new qlm.e(v1.f247718a);
            case 10:
                return new qlm.e(jr.g.f177787a);
            case 11:
                return new qlm.e(e0.Companion.serializer());
            case 12:
                return new qlm.e(e1.d);
            case 13:
                return j1.b("com.revolut.camerakit.core.settings.CompressionType", yw.j.values());
            case 14:
                b0.Companion companion = b0.INSTANCE;
                return new qlm.e(jr.a.f177758a);
            case 15:
                b0.Companion companion2 = b0.INSTANCE;
                return new qlm.e(jr.j.f177796a);
            case 16:
                return new qlm.e(jrk.m.f178066a);
            case 17:
                return k0.Companion.serializer();
            case 18:
                return new qlm.e(jrk.v.f178080a);
            case 19:
                return new qlm.e(jrk.e0.f178049a);
            case 20:
                return new qlm.e(jrk.e0.f178049a);
            case 21:
                KProperty[] kPropertyArr7 = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                return new CellDetailsDelegate();
            case 22:
                KProperty[] kPropertyArr8 = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                return new FullScreenStateDelegate();
            case 23:
                KProperty[] kPropertyArr9 = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                return new SuggestionsBarDelegate();
            case 24:
                KProperty[] kPropertyArr10 = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                return new LargeActionButtonDelegate();
            case 25:
                return new ListSubheaderDelegate();
            case 26:
                return new ListSubheaderLoadingDelegate();
            case 27:
                return new RowDelegate(null, null, 7);
            case 28:
                return new CellDetailsDelegate();
            default:
                return new ForecastDelegate();
        }
    }
}
