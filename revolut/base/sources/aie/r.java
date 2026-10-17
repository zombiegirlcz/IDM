package aie;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountSpacesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AccountSpacesScreen accountSpacesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountSpacesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        vh model = (vh) pair.f186385a;
        com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = (com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.v.k3();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f54884b).u;
        SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel = obj3 instanceof SpaceContentListMapper$ItemParcel ? (SpaceContentListMapper$ItemParcel) obj3 : null;
        if (spaceContentListMapper$ItemParcel == null) {
            hx7.e.n(new IllegalStateException(a0.d.m(((RowDelegate.Model) model.f54884b).u, "Unknown item payload: ")));
        } else {
            iVar.n2(new com.revolut.feature.tab.accounts.impl.ui.spaces.g(spaceContentListMapper$ItemParcel, iVar, model, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
