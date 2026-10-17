package zje;

import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabCryptoFlowV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TabCryptoFlowV2 tabCryptoFlowV2, Continuation continuation) {
        super(2, continuation);
        this.v = tabCryptoFlowV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((com.revolut.core.ui_kit.views.navbar.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.views.navbar.c cVar = (com.revolut.core.ui_kit.views.navbar.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.R2().Q(cVar.f59521b);
        return Unit.f186387a;
    }
}
