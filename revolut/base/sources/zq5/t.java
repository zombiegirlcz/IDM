package zq5;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSendWalletsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CryptoSendWalletsListController cryptoSendWalletsListController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSendWalletsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        SwipeToActionDelegate.SwipeAction action = vhVar.f54883a;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) vVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj3 = action.f;
        if (obj3 instanceof h0) {
            aVar2.v.g3((h0) obj3, action, aVar2.o.f71334a);
        } else if (obj3 instanceof e0) {
            aVar2.u.d3((e0) obj3, action);
        }
        return Unit.f186387a;
    }
}
