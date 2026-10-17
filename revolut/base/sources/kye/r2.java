package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class r2 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SelectedMethod f190821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f190822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l71.d f190823y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(k3 k3Var, SelectedMethod selectedMethod, dj0.d dVar, l71.d dVar2, Continuation continuation) {
        super(1, continuation);
        this.v = k3Var;
        this.f190821w = selectedMethod;
        this.f190822x = dVar;
        this.f190823y = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r2(this.v, this.f190821w, this.f190822x, this.f190823y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r2) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        SelectedMethod.StoredMethod.Card card = (SelectedMethod.StoredMethod.Card) this.f190821w;
        this.u = 1;
        Object objK2 = k3.K2(this.v, card, this.f190822x, this.f190823y, this);
        return objK2 == aVar ? aVar : objK2;
    }
}
