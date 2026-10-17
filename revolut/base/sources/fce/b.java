package fce;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import fdl.a2;
import fdl.a3;
import fdl.d2;
import fdl.e3;
import fdl.g2;
import fdl.h;
import fdl.i1;
import fdl.m2;
import fdl.o1;
import fdl.q;
import fdl.s2;
import fdl.x1;
import fed.a;
import fed.b;
import fed.b0;
import fed.c;
import fed.c0;
import fed.d;
import fed.e;
import fed.f;
import fed.k;
import fed.l;
import fed.m;
import fed.n;
import fed.o;
import fed.p;
import fed.u;
import fed.y;
import fed.z;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133703a;

    public /* synthetic */ b(int i) {
        this.f133703a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f133703a) {
            case 0:
                int i = SubscriptionDetailsDialogController.f89272a0;
                return new SingleChoiceDelegate();
            case 1:
                int i2 = SubscriptionDetailsDialogController.f89272a0;
                return new TwinHorizontalButtonDelegate();
            case 2:
                int i3 = SubscriptionDetailsDialogController.f89272a0;
                return new InputChecklistDelegate();
            case 3:
                return new d1("com.revolut.shared.feature.wealth.domain.impl.data.network.model.BaseTypeSpecificPropertiesDto.Unknown", h.C0789h.INSTANCE, new Annotation[0]);
            case 4:
                return new qlm.e(m2.f134216a);
            case 5:
                return new qlm.e(a2.f134015a);
            case 6:
                return new qlm.e(o1.f134231a);
            case 7:
                d2.Companion companion = d2.INSTANCE;
                return new qlm.e(i1.f134156a);
            case 8:
                g2.Companion companion2 = g2.INSTANCE;
                return new qlm.e(x1.f134401a);
            case 9:
                s2.Companion aVar = s2.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.shared.feature.wealth.domain.impl.data.network.model.PendingAssetDto", p0Var.b(s2.class), new KClass[]{p0Var.b(fdl.q.class), p0Var.b(a3.class), p0Var.b(e3.class)}, new KSerializer[]{q.a.f134245a, a3.a.f134018a, e3.a.f134090a}, new Annotation[0]);
            case 10:
                a.b bVar = fed.a.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 11:
                b.C0791b c0791b = fed.b.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 12:
                c.b bVar2 = fed.c.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 13:
                d.b bVar3 = fed.d.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 14:
                e.b bVar4 = fed.e.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 15:
                f.a aVar2 = fed.f.Companion;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.shared.wealth.data.corporate_events.EventDto", p0Var2.b(fed.f.class), new KClass[]{p0Var2.b(fed.a.class), p0Var2.b(fed.b.class), p0Var2.b(fed.c.class), p0Var2.b(fed.d.class), p0Var2.b(fed.e.class), p0Var2.b(fed.k.class), p0Var2.b(fed.l.class), p0Var2.b(fed.m.class), p0Var2.b(fed.n.class), p0Var2.b(fed.o.class), p0Var2.b(fed.p.class), p0Var2.b(fed.u.class), p0Var2.b(fed.y.class), p0Var2.b(fed.z.class), p0Var2.b(b0.class), p0Var2.b(c0.class)}, new KSerializer[]{a.C0790a.f134494a, b.a.f134500a, c.a.f134510a, d.a.f134519a, e.a.f134526a, k.a.f134536a, l.a.f134542a, m.a.f134547a, n.a.f134553a, o.a.f134559a, p.a.f134564a, u.a.f134575a, y.a.f134583a, z.a.f134589a, b0.a.f134505a, c0.a.f134513a}, new Annotation[0]);
            case 16:
                return new fed.t();
            case 17:
                k.b bVar5 = fed.k.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 18:
                l.b bVar6 = fed.l.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 19:
                m.b bVar7 = fed.m.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 20:
                n.b bVar8 = fed.n.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 21:
                n.b bVar9 = fed.n.Companion;
                return j1.b("com.revolut.shared.feature.wealth.models.corporate_events.HolidayType", iel.l.values());
            case 22:
                o.b bVar10 = fed.o.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 23:
                p.b bVar11 = fed.p.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 24:
                p.b bVar12 = fed.p.Companion;
                return new qlm.e(fed.q.f134565a);
            case 25:
                return j1.b("com.revolut.shared.feature.wealth.models.corporate_events.RestructuringType", iel.u.values());
            case 26:
                u.b bVar13 = fed.u.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 27:
                u.b bVar14 = fed.u.Companion;
                return new qlm.e(fed.q.f134565a);
            case 28:
                y.b bVar15 = fed.y.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            default:
                z.b bVar16 = fed.z.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
        }
    }
}
