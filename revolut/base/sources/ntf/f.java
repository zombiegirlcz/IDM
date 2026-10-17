package ntf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferReasonsSearchScreen transferReasonsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(model);
        KProperty[] kPropertyArr = TransferReasonsSearchScreen.T;
        TransferReasonsSearchScreen transferReasonsSearchScreen = this.v;
        transferReasonsSearchScreen.getClass();
        if (Intrinsics.f(model.f52373a, "CLEAR_SEARCH_ID")) {
            transferReasonsSearchScreen.d3().f174565c.i0();
        }
        return Unit.f186387a;
    }
}
