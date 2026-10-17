package khe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthCategoryListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TotalWealthCategoryListScreen totalWealthCategoryListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthCategoryListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model rowDelegateModel = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.d();
        Intrinsics.h(rowDelegateModel);
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar2 = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) bVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(rowDelegateModel, "rowDelegateModel");
        Object obj3 = rowDelegateModel.u;
        SpaceContentListMapper$ItemParcel.SubspaceValueItem subspaceValueItem = obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem ? (SpaceContentListMapper$ItemParcel.SubspaceValueItem) obj3 : null;
        if (subspaceValueItem != null) {
            ProductAccountDescriptor$Value productAccountDescriptor$Value = subspaceValueItem.f89621c;
            a2 a2Var = aVar2.E;
            if (a2Var != null) {
                a2Var.f(null);
            }
            aVar2.f89598t.a();
            aVar2.E = aVar2.n2(new v(aVar2, productAccountDescriptor$Value, subspaceValueItem, rowDelegateModel, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
