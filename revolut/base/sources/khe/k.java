package khe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$Step;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthCategoryListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TotalWealthCategoryListScreen totalWealthCategoryListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthCategoryListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        Object obj3 = model.u;
        if (obj3 instanceof ra7.a) {
            oki.h.v2(aVar2.G, TotalWealthCategoryListContract$Step.HiddenAccounts.f89593a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } else if (obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem) {
            aVar2.J2(((SpaceContentListMapper$ItemParcel.SubspaceValueItem) obj3).f89621c);
        } else if (obj3 instanceof SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) {
            aVar2.J2(((SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) obj3).f89616c);
        }
        return Unit.f186387a;
    }
}
