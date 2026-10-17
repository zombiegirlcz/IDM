package tjh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.i implements Function1 {
    public final /* synthetic */ LargeActionButtonDelegate.Model u;
    public final /* synthetic */ h0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LargeActionButtonDelegate.Model model, Continuation continuation, h0 h0Var) {
        super(1, continuation);
        this.u = model;
        this.v = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.u, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.i;
        if (obj3 instanceof pjh.c) {
            h hVar = h0.Companion;
            h0 h0Var = this.v;
            Map map = ((bih.h) h0Var.b3()).f15498c;
            String str = ((pjh.c) obj3).f236776a;
            h0Var.d3(new a31.i(str, !(((Boolean) map.get(str)) != null ? r1.booleanValue() : true), 14));
        }
        return Unit.f186387a;
    }
}
