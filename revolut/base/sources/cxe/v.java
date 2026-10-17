package cxe;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AttributeSelectorSmallDelegate.Model f109974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar, AttributeSelectorSmallDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f109974w = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.v, this.f109974w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            qwe.s sVar = this.v.f90750x;
            Object obj3 = this.f109974w.f51674g;
            e93.j0 j0Var = obj3 instanceof e93.j0 ? (e93.j0) obj3 : null;
            this.u = 1;
            sVar.f249908a.setValue(j0Var);
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
