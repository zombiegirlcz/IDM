package u95;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OverdraftDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OverdraftDetailsScreen overdraftDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = overdraftDetailsScreen;
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
        i iVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.overdraft.impl.ui.details.a aVar2 = (com.revolut.feature.credit.overdraft.impl.ui.details.a) iVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.f70642q.O1(model);
        return Unit.f186387a;
    }
}
