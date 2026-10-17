package zq5;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSendWalletsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CryptoSendWalletsListController cryptoSendWalletsListController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSendWalletsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        String id10 = model.f52708a;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) vVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        aVar2.v.e3(id10);
        return Unit.f186387a;
    }
}
