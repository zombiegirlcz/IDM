package wal;

import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import qlm.h0;
import qlm.i0;
import qlm.j1;
import qlm.v1;
import wb8.k;
import wb8.l;
import wd0.a;
import wd0.b;
import wd0.c;
import wd0.d;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295979a;

    public /* synthetic */ f(int i) {
        this.f295979a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f295979a) {
            case 0:
                return new Regex("\\s+");
            case 1:
                return j1.b("com.revolut.feature.junior_allowance.impl.models.AllowanceRecurringPaymentStateDto", l.values());
            case 2:
                return j1.b("com.revolut.feature.junior_allowance.impl.models.AllowanceRecurringPaymentPeriodDto", k.values());
            case 3:
                return j1.b("com.revolut.feature.junior_allowance.impl.models.AllowanceFailureReasonDto", wb8.a.values());
            case 4:
                PixQrCodeTransactionReviewScreen.a aVar = PixQrCodeTransactionReviewScreen.Companion;
                return new CounterTextDelegate();
            case 5:
                PixQrCodeTransactionReviewScreen.a aVar2 = PixQrCodeTransactionReviewScreen.Companion;
                return new InputTextDelegate(null);
            case 6:
                PixQrCodeTransactionReviewScreen.a aVar3 = PixQrCodeTransactionReviewScreen.Companion;
                return new ListSubheaderDelegate();
            case 7:
                PixQrCodeTransactionReviewScreen.a aVar4 = PixQrCodeTransactionReviewScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 8:
                PixQrCodeTransactionReviewScreen.a aVar5 = PixQrCodeTransactionReviewScreen.Companion;
                return new LargeActionButtonDelegate();
            case 9:
                PixQrCodeTransactionReviewScreen.a aVar6 = PixQrCodeTransactionReviewScreen.Companion;
                return new CellDetailsDelegate();
            case 10:
                PixQrCodeTransactionReviewScreen.a aVar7 = PixQrCodeTransactionReviewScreen.Companion;
                return new CellDetailsActionDelegate();
            case 11:
                PixQrCodeTransactionReviewScreen.a aVar8 = PixQrCodeTransactionReviewScreen.Companion;
                return new CellDetailsAccountDelegate();
            case 12:
                PixQrCodeTransactionReviewScreen.a aVar9 = PixQrCodeTransactionReviewScreen.Companion;
                return new CellDetailsNoteDelegate();
            case 13:
                PixQrCodeTransactionReviewScreen.a aVar10 = PixQrCodeTransactionReviewScreen.Companion;
                return new CellDetailsSwitcherDelegate();
            case 14:
                KProperty[] kPropertyArr = TokenVerificationScreen.T;
                return new TextDelegate();
            case 15:
                KProperty[] kPropertyArr2 = TokenVerificationScreen.T;
                return new CodeEditorDelegate();
            case 16:
                a.b bVar = wd0.a.Companion;
                return new h0(v1.f247718a, d.a.f296451a, 1);
            case 17:
                b.C1635b c1635b = wd0.b.Companion;
                return new qlm.e(c.a.f296448a);
            case 18:
                b.C1635b c1635b2 = wd0.b.Companion;
                return new qlm.e(c.a.f296448a);
            case 19:
                c.b bVar2 = wd0.c.Companion;
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 20:
                c.b bVar3 = wd0.c.Companion;
                v1 v1Var2 = v1.f247718a;
                return new h0(v1Var2, v1Var2, 1);
            case 21:
                return new i0(v1.f247718a, 1);
            case 22:
                SharedAlertsScreen.a aVar11 = SharedAlertsScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 23:
                SharedAlertsScreen.a aVar12 = SharedAlertsScreen.Companion;
                return new FixedTabsDelegate();
            case 24:
                SharedAlertsScreen.a aVar13 = SharedAlertsScreen.Companion;
                return new FullScreenStateDelegate();
            case 25:
                SharedAlertsScreen.a aVar14 = SharedAlertsScreen.Companion;
                return new TextDelegate();
            case 26:
                SharedAlertsScreen.a aVar15 = SharedAlertsScreen.Companion;
                return new RowLoadingDelegate();
            case 27:
                SharedAlertsScreen.a aVar16 = SharedAlertsScreen.Companion;
                return new ListSubheaderDelegate();
            case 28:
                SharedAlertsScreen.a aVar17 = SharedAlertsScreen.Companion;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            default:
                SharedAlertsScreen.a aVar18 = SharedAlertsScreen.Companion;
                return new LargeActionButtonDelegate();
        }
    }
}
