package kye;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class e3 extends gim.i implements Function2 {
    public final /* synthetic */ k3 u;
    public final /* synthetic */ LargeActionButtonDelegate.Model v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(k3 k3Var, LargeActionButtonDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.u = k3Var;
        this.v = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e3(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k3 k3Var = this.u;
        j60.a.v(k3Var.v, false, null, 3);
        Object obj3 = this.v.i;
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str = (String) obj3;
        String strL = str != null ? m70.a.l(str) : null;
        if (strL == null) {
            return null;
        }
        k3Var.S2(strL);
        return Unit.f186387a;
    }
}
