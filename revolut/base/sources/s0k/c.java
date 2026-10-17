package s0k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewTab;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthNewsOverviewFlow f258964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(WealthNewsOverviewFlow wealthNewsOverviewFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f258964w = wealthNewsOverviewFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f258964w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f258964w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((WealthNewsOverviewTab) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthNewsOverviewFlow wealthNewsOverviewFlow = this.f258964w;
        switch (i) {
            case 0:
                WealthNewsOverviewTab tab2 = (WealthNewsOverviewTab) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a aVar2 = (com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a) ((d) wealthNewsOverviewFlow.V.getValue());
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(tab2, "tab");
                eki.g.r2(aVar2, com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.b.a(tab2));
                break;
            default:
                e eVar = (e) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = WealthNewsOverviewFlow.X;
                Tabs tabs = wealthNewsOverviewFlow.Y2().f170060c;
                tabs.setVisibility(eVar.f258966b ? 0 : 8);
                List<WealthNewsOverviewTab> list = eVar.f258965a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (WealthNewsOverviewTab wealthNewsOverviewTab : list) {
                    arrayList.add(new q(com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.b.a(wealthNewsOverviewTab), new t(new TextLocalisedClause(wealthNewsOverviewTab.f101850a, null, null, 14)), 50));
                }
                Tabs.setItems$default(tabs, arrayList, null, 2, null);
                WealthNewsOverviewTab wealthNewsOverviewTab2 = eVar.f258967c;
                if (wealthNewsOverviewTab2 != null) {
                    Tabs.u(tabs, com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.b.a(wealthNewsOverviewTab2), false, false, false, 14);
                }
                break;
        }
        return Unit.f186387a;
    }
}
