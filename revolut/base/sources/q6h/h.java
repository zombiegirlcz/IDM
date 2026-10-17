package q6h;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ FullScreenStateDelegate.Model u;
    public final /* synthetic */ com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FullScreenStateDelegate.Model model, com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(this.u.f52373a, "error_item")) {
            this.v.f95471s.b(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
