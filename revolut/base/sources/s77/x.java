package s77;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;
import s7g.c2;
import s7g.g;
import s7g.g0;
import s7g.i2;
import s7g.j0;
import s7g.p2;
import s7g.s0;
import s7g.v0;
import s7g.w1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260570a;

    public /* synthetic */ x(int i) {
        this.f260570a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f260570a) {
            case 0:
                return j1.b("com.revolut.feature.global_markets.impl.data.network.MarketDto", z.values());
            case 1:
                return new qlm.e(g0.f260726a);
            case 2:
                return new qlm.e(s7g.i.f260737a);
            case 3:
                return new qlm.e(s7g.l.f260756a);
            case 4:
                return new qlm.e(v0.f260804a);
            case 5:
                return new qlm.e(s7g.o.f260772a);
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                return new qlm.e(j0.f260745a);
            case 8:
                return new qlm.e(v1.f247718a);
            case 9:
                return new qlm.e(s7g.u.f260801a);
            case 10:
                return new qlm.e(s7g.r.f260787a);
            case 11:
                return new qlm.e(s0.f260794a);
            case 12:
                return new qlm.e(s7g.l.f260756a);
            case 13:
                return new qlm.e(z7g.g.f319979a);
            case 14:
                return new qlm.e(z7g.v.f320000a);
            case 15:
                return new qlm.e(p2.f260783a);
            case 16:
                return new qlm.e(w1.f260811a);
            case 17:
                return new qlm.e(t7g.s.f268692a);
            case 18:
                return new qlm.e(v1.f247718a);
            case 19:
                return new qlm.e(g.a.f260725a);
            case 20:
                return new qlm.e(v0.f260804a);
            case 21:
                return new qlm.e(c2.f260694a);
            case 22:
                return new qlm.e(c2.f260694a);
            case 23:
                return new qlm.e(i2.f260744a);
            case 24:
                return new qlm.e(s7h.c.f260825a);
            case 25:
                return new qlm.e(v1.f247718a);
            case 26:
                KProperty[] kPropertyArr = LoanToggleBackupCardScreen.f70599e0;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr2 = LoanToggleBackupCardScreen.f70599e0;
                return new CellDetailsSwitcherDelegate();
            case 28:
                KProperty[] kPropertyArr3 = LoanToggleBackupCardScreen.f70599e0;
                return new CellDetailsActionDelegate();
            default:
                KProperty[] kPropertyArr4 = LoanToggleBackupCardScreen.f70599e0;
                return new FullScreenStateDelegate();
        }
    }
}
