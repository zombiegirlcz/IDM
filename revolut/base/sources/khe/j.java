package khe;

import com.revolut.feature.tab.accounts.impl.R$id;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.kompot.common.transition.ZoomTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TotalWealthCategoryListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(TotalWealthCategoryListScreen totalWealthCategoryListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = totalWealthCategoryListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TotalWealthCategoryListScreen totalWealthCategoryListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) totalWealthCategoryListScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar3 = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) totalWealthCategoryListScreen.d();
                aVar3.C1(uge.d.a(aVar3.A, null, z92.f.v(aVar3.o.f89587a), new ZoomTarget.ViewId(R$id.screenTotalWealthCategoryList_button), 1));
                break;
        }
        return Unit.f186387a;
    }
}
