package rpi;

import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.sso.api.models.UserInfoFromApp;
import do3.n;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import rq7.q;
import rrc.v;
import rrj.o;
import tof.i3;
import yhm.r;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256390a;

    public /* synthetic */ e(int i) {
        this.f256390a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f256390a;
        CreditLimitIncreaseStatus.Available available = CreditLimitIncreaseStatus.Available.f68725a;
        boolean z = true;
        aVar = null;
        rrj.a aVar = null;
        switch (i) {
            case 0:
                c01.b it8 = (c01.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Unit.f186387a;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return available;
            case 2:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 3:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                CreditLimitIncreaseStatus creditLimitIncreaseStatus = (CreditLimitIncreaseStatus) it11.f224257a;
                return creditLimitIncreaseStatus == null ? available : creditLimitIncreaseStatus;
            case 4:
                return rq4.j.a((rq4.j) obj2, new Data(null, null, true, 3, null), null, null, false, false, 62);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                bw0.h.Companion.getClass();
                bw0.h hVarA = bw0.b.a();
                l lVar = l.LOADING;
                eVarB.add(new CenteredAmountDelegate.Model("credit_limit_cap_change_centered_amount_loading", null, hVarA, null, new m(null, lVar, null, false, null, 28), new m(null, lVar, null, false, null, 28), null, false, false, null, null, 1994));
                IntRange intRange = new IntRange(1, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it12 = intRange.iterator();
                while (it12.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("LOADING_STATE_ID_", it12.nextInt()), false, 0, false, 22));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                return new rq4.l(u.a(eVarB));
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems.invoke();
                f0 f0Var = f0.f322471a;
                return new q(list, null, null, null, null, f0Var, f0Var);
            case 7:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return f0.f322471a;
            case 8:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return f0.f322471a;
            case 9:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                String value = user.f116409b;
                if (value != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                } else {
                    value = null;
                }
                String value2 = user.f116408a;
                Intrinsics.checkNotNullParameter(value2, "value");
                String str = user.i;
                String str2 = user.f116411g;
                return new UserInfoFromApp(value, value2, str, str2 != null ? new UserInfoFromApp.Email(str2, user.f116412h) : null);
            case 10:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                throw new IllegalArgumentException("Crypto tab widget has no support of Loading state");
            case 11:
                FullScreenStateDelegate.Model it16 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr = ShareSalaryDetailsScreen.X;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.f52373a, "ID_ERROR_ITEM"));
            case 12:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v.a(update, false, null, null, null, 30);
            case 13:
                NaviCommand it17 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.TRUE;
            case 14:
                qzi.h budgetOverview = (qzi.h) obj2;
                Intrinsics.checkNotNullParameter(budgetOverview, "budgetOverview");
                return new rrj.l(budgetOverview.f250657g, budgetOverview.f250659j, null, null);
            case 15:
                Data it18 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return o.z2(it18.getContent());
            case 16:
                od0.i it19 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                if (it19.d()) {
                    return (qzi.a) it19.c();
                }
                throw new IllegalStateException("Missing budget when observing it");
            case 17:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new Data(null, it20, false, 5, null);
            case 18:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                return o.z2(optional.g());
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ie3.a aVar2 = (ie3.a) pair.f186385a;
                rrj.l lVar2 = (rrj.l) pair.f186386b;
                dj0.d dVar = lVar2.f256864a;
                qzi.e eVar = lVar2.f256865b;
                i3 i3Var = lVar2.f256866c;
                rrj.b bVar = new rrj.b(dVar, eVar, i3Var, true ^ aVar2.f160626a.isEmpty());
                qzi.a aVar3 = lVar2.d;
                if (aVar3 != null) {
                    dj0.d dVar2 = lVar2.f256864a;
                    if (i3Var != null) {
                        aVar = new rrj.a(dVar2, aVar3, i3Var);
                    }
                }
                return new rrj.c(aVar2, bVar, aVar);
            case 20:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Data(null, it21, false, 5, null);
            case 21:
                vh data = (vh) obj2;
                KProperty[] kPropertyArr2 = CategoryBudgetScreen.f101521e0;
                Intrinsics.checkNotNullParameter(data, "data");
                return (RowDelegate.Model) data.f54884b;
            case 22:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new rrj.j((List) getDefaultLoadingItems2.invoke(), rrj.h.f256859a);
            case 23:
                String it22 = (String) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return null;
            case 24:
                WealthAccount it23 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return ((WealthAccount.Robo) it23).f95237c;
            case 25:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) rVar.f314203c).booleanValue();
                if (!zBooleanValue && !zBooleanValue2 && !zBooleanValue3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                n user2 = (n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                od0.h hVar = od0.i.Companion;
                String str3 = user2.f116408a;
                hVar.getClass();
                return od0.h.a(str3);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 28:
                InvestOrder it24 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return tsl.g.b(it24);
            default:
                od0.i it25 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Optional.ofNullable(it25.g());
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f256390a = i;
    }
}
