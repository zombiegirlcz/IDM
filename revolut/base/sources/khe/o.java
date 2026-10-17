package khe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthCategoryListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TotalWealthCategoryListScreen totalWealthCategoryListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthCategoryListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        vh model = (vh) pair.f186385a;
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar2 = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) this.v.d();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f54884b).u;
        SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel = obj3 instanceof SpaceContentListMapper$ItemParcel ? (SpaceContentListMapper$ItemParcel) obj3 : null;
        if (spaceContentListMapper$ItemParcel != null) {
            aVar2.n2(new t(spaceContentListMapper$ItemParcel, aVar2, model, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
