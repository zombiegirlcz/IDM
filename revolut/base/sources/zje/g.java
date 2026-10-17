package zje;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabCryptoFlowV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TabCryptoFlowV2 tabCryptoFlowV2, Continuation continuation) {
        super(2, continuation);
        this.v = tabCryptoFlowV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarR2 = this.v.R2();
        Intrinsics.h(model);
        nVarR2.N1(model);
        return Unit.f186387a;
    }
}
