package khe;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$State;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthCategoryListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TotalWealthCategoryListScreen totalWealthCategoryListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthCategoryListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.o;
        SpaceContentListMapper$ItemParcel.SubspaceHeader subspaceHeader = obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceHeader ? (SpaceContentListMapper$ItemParcel.SubspaceHeader) obj3 : null;
        if (subspaceHeader == null) {
            return Unit.f186387a;
        }
        b bVarE3 = this.v.d();
        ProductSpaceIdentifier spaceIdentifier = subspaceHeader.f89617a;
        pie.v subSpaceIdentifier = subspaceHeader.f89618b;
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar2 = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) bVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        TotalWealthCategoryListContract$State.SubspaceKey subspaceKey = new TotalWealthCategoryListContract$State.SubspaceKey(spaceIdentifier, subSpaceIdentifier);
        cli.h hVar = aVar2.F;
        Set set = ((TotalWealthCategoryListContract$State) ((j2) hVar.f22677a).getValue()).e;
        aVar2.H2(hVar, new an9.t(set.contains(subspaceKey) ? a1.j(set, subspaceKey) : a1.m(set, subspaceKey), 10));
        return Unit.f186387a;
    }
}
