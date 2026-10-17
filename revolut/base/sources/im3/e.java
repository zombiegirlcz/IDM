package im3;

import bw0.n;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2Screen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c;
import cq9.m;
import imk.u;
import ip0.m20;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jq9.t;
import jq9.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mx0.t1;
import mx0.u1;
import mx0.u5;
import ojk.g0;
import qv0.p;
import zhm.f0;
import zhm.r0;
import zm3.j;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162290a;

    public /* synthetic */ e(int i) {
        this.f162290a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList = null;
        switch (this.f162290a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 1:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = (List) it8.get(d3a.a.REVOLUT);
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        t tVar = (t) obj3;
                        if ((tVar instanceof y) && (((y) tVar).f177526a instanceof j)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                LinkedHashMap linkedHashMapZ = r0.z(it8);
                if (arrayList != null) {
                    linkedHashMapZ.put(d3a.a.REVOLUT, arrayList);
                }
                return linkedHashMapZ;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 3:
                t1 it9 = (t1) obj2;
                KProperty[] kPropertyArr = PlanHubV2Screen.m0;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof u1) {
                    return (u1) it9;
                }
                return null;
            case 4:
                u it10 = (u) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f162547c;
            case 5:
                u update = (u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return u.c(update, null, null, c.b.f103570a, null, null, 27);
            case 6:
                return u.c((u) obj2, null, null, c.b.f103570a, null, null, 27);
            case 7:
                return u.c((u) obj2, null, null, c.b.f103570a, null, null, 27);
            case 8:
                return u.c((u) obj2, null, null, c.b.f103570a, null, null, 27);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g0.c();
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "security_manager_key";
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 12:
                ty0.a it11 = (ty0.a) obj2;
                KProperty[] kPropertyArr2 = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.d instanceof inc.f);
            case 13:
                KProperty[] kPropertyArr3 = PortfolioStrategyInformationScreen.f0;
                Object f51719g = ((p) obj2).getF55862c();
                if (f51719g instanceof poc.d) {
                    return (poc.d) f51719g;
                }
                return null;
            case 14:
                ListSubheaderDelegate.Model it12 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj4 = it12.f52715m;
                if (obj4 instanceof poc.c) {
                    return (poc.c) obj4;
                }
                return null;
            case 15:
                PlainTextDelegate.Model it13 = (PlainTextDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.k instanceof ooc.a);
            case 16:
                KProperty[] kPropertyArr6 = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter((PlainTextDelegate.Model) obj2, "it");
                return Boolean.valueOf(!(r8.f instanceof u5));
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new m20("risk-tile-loading");
            case 19:
                Object f51719g2 = ((p) obj2).getF55862c();
                if (f51719g2 instanceof inh.e) {
                    return (inh.e) f51719g2;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 21:
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : events) {
                    if (((kp3.b) obj5).a() instanceof iel.h) {
                        arrayList2.add(obj5);
                    }
                }
                return new inh.f(arrayList2);
            case 22:
                Intrinsics.checkNotNullParameter((ActionsView.Item) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ActionWidgetDelegate.a.C0395a.f51607a;
            case 24:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ActionWidgetDelegate.a.b.f51608a;
            case 25:
                ty0.a it14 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new com.revolut.core.ui_kit.delegates.h(it14);
            case 26:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ActionWidgetDelegate.a.c.f51609a;
            case 27:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ActionWidgetDelegate.a.d.f51610a;
            case 28:
                n it15 = (n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15 == n.END);
            default:
                n it16 = (n) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 == n.START);
        }
    }

    public /* synthetic */ e(m mVar) {
        this.f162290a = 9;
    }
}
