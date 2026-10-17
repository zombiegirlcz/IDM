package s0k;

import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$Step;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewTab;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends i implements Function2 {
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f258969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f258970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f258971y;
    public final /* synthetic */ com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a aVar, Continuation continuation) {
        super(2, continuation);
        this.z = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.z, continuation);
        gVar.f258971y = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean zContains;
        boolean zContains2;
        char c2;
        char c3;
        boolean z;
        char c5;
        boolean z3;
        com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a aVar = this.z;
        WealthNewsOverviewFlowContract$InputData wealthNewsOverviewFlowContract$InputData = aVar.f101853n;
        List list = (List) this.f258971y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f258970x;
        if (i == 0) {
            o.b(obj2);
            zContains = list.contains(rzj.g.STOCKS);
            boolean zContains3 = list.contains(rzj.g.CRYPTO);
            zContains2 = list.contains(rzj.g.COMMODITIES);
            this.f258971y = null;
            this.u = zContains;
            this.v = zContains3;
            this.f258969w = zContains2;
            this.f258970x = 1;
            WealthNewsOverviewTab.TopStories topStories = WealthNewsOverviewTab.TopStories.d;
            if (!zContains) {
                topStories = null;
            }
            WealthNewsOverviewTab.Stocks stocks = WealthNewsOverviewTab.Stocks.d;
            if (!zContains) {
                stocks = null;
            }
            WealthNewsOverviewTab.Crypto crypto = WealthNewsOverviewTab.Crypto.d;
            if (!zContains3) {
                crypto = null;
            }
            WealthNewsOverviewTab.Commodities commodities = WealthNewsOverviewTab.Commodities.d;
            if (!zContains2) {
                commodities = null;
            }
            c2 = 3;
            WealthNewsOverviewTab[] elements = {topStories, stocks, crypto, commodities};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            j2 j2Var = aVar.f101854p;
            c3 = 2;
            if (((ArrayList) listL).size() > 1) {
                z = true;
                c5 = 1;
            } else {
                z = false;
                c5 = 1;
            }
            e eVar = new e(listL, z, com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a.s2(wealthNewsOverviewFlowContract$InputData.f101847a));
            j2Var.getClass();
            j2Var.g(null, eVar);
            if (Unit.f186387a == aVar2) {
                return aVar2;
            }
            z3 = zContains3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zContains2 = this.f258969w;
            z3 = this.v;
            zContains = this.u;
            o.b(obj2);
            c3 = 2;
            c5 = 1;
            c2 = 3;
        }
        WealthNewsOverviewFlowContract$Step.TopStories topStories2 = new WealthNewsOverviewFlowContract$Step.TopStories(0);
        if (!zContains) {
            topStories2 = null;
        }
        WealthNewsOverviewFlowContract$Step.Stocks stocks2 = new WealthNewsOverviewFlowContract$Step.Stocks(0);
        if (!zContains) {
            stocks2 = null;
        }
        WealthNewsOverviewFlowContract$Step.Crypto crypto2 = new WealthNewsOverviewFlowContract$Step.Crypto(0);
        if (!z3) {
            crypto2 = null;
        }
        WealthNewsOverviewFlowContract$Step.Commodities commodities2 = zContains2 ? new WealthNewsOverviewFlowContract$Step.Commodities(0) : null;
        WealthNewsOverviewFlowContract$Step[] elements2 = new WealthNewsOverviewFlowContract$Step[4];
        elements2[0] = topStories2;
        elements2[c5] = stocks2;
        elements2[c3] = crypto2;
        elements2[c2] = commodities2;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List steps = kotlin.collections.d.L(elements2);
        String strA = com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.b.a(com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a.s2(wealthNewsOverviewFlowContract$InputData.f101847a));
        Intrinsics.checkNotNullParameter(steps, "steps");
        ((MutableSharedFlow) aVar.f127171l.getValue()).k(new fki.c(steps, strA, false));
        return Unit.f186387a;
    }
}
