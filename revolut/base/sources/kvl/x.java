package kvl;

import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ a0 u;
    public final /* synthetic */ AutoTopUpSource.Pocket v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, AutoTopUpSource.Pocket pocket, Continuation continuation) {
        super(1, continuation);
        this.u = a0Var;
        this.v = pocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0Var = this.u;
        j60.a.v(a0Var.f190158p, false, null, 3);
        Optional source = Optional.of(this.v);
        Intrinsics.checkNotNullExpressionValue(source, "of(...)");
        Intrinsics.checkNotNullParameter(source, "source");
        a0Var.f190161s.setValue(source);
        return Unit.f186387a;
    }
}
