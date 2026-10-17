package n85;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsActivity;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import nf6.a;
import nf6.b;
import nf6.c;
import nf6.d;
import nf6.e;
import nhl.c0;
import nhl.f0;
import nhl.r;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213205a;

    public /* synthetic */ b(int i) {
        this.f213205a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f213205a) {
            case 0:
                KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                return new FullScreenStateDelegate();
            case 1:
                MoveMoneyTopupScreen.a aVar = MoveMoneyTopupScreen.Companion;
                return new FullScreenStateDelegate();
            case 2:
                MoveMoneyTopupScreen.a aVar2 = MoveMoneyTopupScreen.Companion;
                return new AttributeSelectorSmallDelegate();
            case 3:
                MoveMoneyTopupScreen.a aVar3 = MoveMoneyTopupScreen.Companion;
                return new TextDelegate();
            case 4:
                MoveMoneyTopupScreen.a aVar4 = MoveMoneyTopupScreen.Companion;
                return new FooterTextDelegate();
            case 5:
                KProperty[] kPropertyArr2 = DebtsV3HubController.R;
                return new RowDelegate(null, null, 7);
            case 6:
                return u8f.h.ACAT_FULL;
            case 7:
                int i = MarkRecurringTransactionsActivity.z0;
                return new RowDelegate(null, null, 7);
            case 8:
                int i2 = MarkRecurringTransactionsActivity.z0;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr3 = PriceTargetsFaqLeafScreen.f100160b0;
                return new PlainTextDelegate();
            case 10:
                a.b bVar = nf6.a.Companion;
                return new qlm.e(a.c.C1200a.f214841a);
            case 11:
                b.C1201b c1201b = nf6.b.Companion;
                return new qlm.e(a.C1199a.f214838a);
            case 12:
                b.C1201b c1201b2 = nf6.b.Companion;
                return new qlm.e(a.C1199a.f214838a);
            case 13:
                c.b bVar2 = nf6.c.Companion;
                return new qlm.e(c.C1202c.a.f214852a);
            case 14:
                d.b bVar3 = nf6.d.Companion;
                return new qlm.e(c.a.f214849a);
            case 15:
                e.d.b bVar4 = e.d.Companion;
                return new qlm.e(e.C1204e.a.f214868a);
            case 16:
                e.f.b bVar5 = e.f.Companion;
                return new qlm.e(e.d.a.f214865a);
            case 17:
                return j1.b("com.revolut.shared.feature.wealth.models.screener.ScreenerSortOrder", zel.i.values());
            case 18:
                return new qlm.e(v1.f247718a);
            case 19:
                return j1.b("com.revolut.shared.feature.wealth.models.screener.ScreenerCollection.CreatedBy", zel.d.values());
            case 20:
                return new qlm.e(f0.f215523a);
            case 21:
                return new qlm.e(c0.f215513a);
            case 22:
                r.Companion bVar6 = r.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 23:
                r.Companion bVar7 = r.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 24:
                r.Companion bVar8 = r.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 25:
                r.Companion bVar9 = r.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 26:
                r.Companion bVar10 = r.INSTANCE;
                return new qlm.e(nhl.l.f215534a);
            case 27:
                r.Companion bVar11 = r.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 28:
                r.Companion bVar12 = r.INSTANCE;
                return new qlm.e(v1.f247718a);
            default:
                return new qlm.e(f0.f215523a);
        }
    }
}
