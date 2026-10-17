package khe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthCategoryListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TotalWealthCategoryListScreen totalWealthCategoryListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthCategoryListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar2 = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) bVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model.c cVar = model.k;
        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
        Object obj3 = pfVar != null ? pfVar.f : null;
        SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem subspaceDiscoverItem = obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem ? (SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) obj3 : null;
        if (subspaceDiscoverItem != null) {
            aVar2.J2(subspaceDiscoverItem.f89616c);
        }
        return Unit.f186387a;
    }
}
