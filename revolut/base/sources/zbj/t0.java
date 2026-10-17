package zbj;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewTab;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fcj.b f320940a;

    public t0(fcj.b itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f320940a = itemsMapper;
    }

    public final List a(q qVar) {
        if (!qVar.f320927c.d()) {
            return iii.c.b(null, null, 6, true);
        }
        xi0.b currency = qVar.f320926b;
        Data contactsData = qVar.d;
        boolean zBooleanValue = ((Boolean) qVar.f320927c.c()).booleanValue();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        xj5.c cVar = this.f320940a.f133831b;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return ((vk5.c) cVar).a(contactsData, "", zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(zbj.q r50) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zbj.t0.b(zbj.q):java.util.List");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        final q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f320926b;
        Data data = domainState.f320925a;
        final int i = 0;
        List list = (List) iii.c.f(data, new j0(10), new z8d.h(8), new Function3(this) { // from class: zbj.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f320936b;

            {
                this.f320936b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i) {
                    case 0:
                        w stateType = (w) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(stateType, "stateType");
                        Intrinsics.checkNotNullParameter(stateType, "stateType");
                        q domainState2 = domainState;
                        Intrinsics.checkNotNullParameter(domainState2, "domainState");
                        int i2 = s0.f320938a[stateType.ordinal()];
                        t0 t0Var = this.f320936b;
                        if (i2 == 1) {
                            return t0Var.a(domainState2);
                        }
                        if (i2 == 2) {
                            return t0Var.b(domainState2);
                        }
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u0 u0Var = domainState2.f320932m;
                        if (u0Var == null) {
                            return iii.c.b(null, null, 6, true);
                        }
                        aim.e eVarB = zhm.u.b();
                        CryptoDepositsOverviewTab selectedTab = new CryptoDepositsOverviewTab(u0Var, true);
                        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
                        eVarB.addAll(zhm.u.c(new FixedTabsDelegate.Model("TABS_LIST_ID", zhm.v.k(new FixedTabs.Item(u0.WALLET.a(), new TextLocalisedClause(R$string.crypto_receive_screen_receive_tab_wallet, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item(u0.FRIENDS.a(), new TextLocalisedClause(R$string.crypto_receive_screen_receive_tab_revolut_friends, null, null, 14), (AnalyticsContext) null, 12)), u0Var.a(), null, null, 0, R$attr.uikit_dp8, 0, 0, 432)));
                        int i3 = s0.f320939b[u0Var.ordinal()];
                        if (i3 == 1) {
                            eVarB.addAll(t0Var.b(domainState2));
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eVarB.addAll(t0Var.a(domainState2));
                        }
                        return zhm.u.a(eVarB);
                    default:
                        w stateType2 = (w) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(stateType2, "stateType");
                        return this.f320936b.f320940a.e(domainState.f320926b, stateType2 == w.Wallet || stateType2 == w.Tabs);
                }
            }
        });
        final int i2 = 1;
        Clause clause = (Clause) iii.c.f(data, new z8g.q(this, domainState, 21), new zaf.d(this, domainState, 1), new Function3(this) { // from class: zbj.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f320936b;

            {
                this.f320936b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i2) {
                    case 0:
                        w stateType = (w) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(stateType, "stateType");
                        Intrinsics.checkNotNullParameter(stateType, "stateType");
                        q domainState2 = domainState;
                        Intrinsics.checkNotNullParameter(domainState2, "domainState");
                        int i22 = s0.f320938a[stateType.ordinal()];
                        t0 t0Var = this.f320936b;
                        if (i22 == 1) {
                            return t0Var.a(domainState2);
                        }
                        if (i22 == 2) {
                            return t0Var.b(domainState2);
                        }
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u0 u0Var = domainState2.f320932m;
                        if (u0Var == null) {
                            return iii.c.b(null, null, 6, true);
                        }
                        aim.e eVarB = zhm.u.b();
                        CryptoDepositsOverviewTab selectedTab = new CryptoDepositsOverviewTab(u0Var, true);
                        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
                        eVarB.addAll(zhm.u.c(new FixedTabsDelegate.Model("TABS_LIST_ID", zhm.v.k(new FixedTabs.Item(u0.WALLET.a(), new TextLocalisedClause(R$string.crypto_receive_screen_receive_tab_wallet, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item(u0.FRIENDS.a(), new TextLocalisedClause(R$string.crypto_receive_screen_receive_tab_revolut_friends, null, null, 14), (AnalyticsContext) null, 12)), u0Var.a(), null, null, 0, R$attr.uikit_dp8, 0, 0, 432)));
                        int i3 = s0.f320939b[u0Var.ordinal()];
                        if (i3 == 1) {
                            eVarB.addAll(t0Var.b(domainState2));
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eVarB.addAll(t0Var.a(domainState2));
                        }
                        return zhm.u.a(eVarB);
                    default:
                        w stateType2 = (w) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(stateType2, "stateType");
                        return this.f320936b.f320940a.e(domainState.f320926b, stateType2 == w.Wallet || stateType2 == w.Tabs);
                }
            }
        });
        CurrencyClause currencyClause = new CurrencyClause(bVar, null, null, 6);
        jbj.a aVar = domainState.f320931l;
        return new b0(list, clause, currencyClause, aVar != null ? e36.a.a(aVar.f172647b, aVar.f172646a) : new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new a0(domainState.f320932m, (wk5.a) domainState.f320928g.g()));
    }
}
