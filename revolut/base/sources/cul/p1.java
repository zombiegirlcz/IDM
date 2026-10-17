package cul;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class p1 extends gim.i implements Function1 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k4l.r0 f109151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109152x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, k4l.r0 r0Var, Continuation continuation) {
        super(1, continuation);
        this.f109152x = eVar;
        this.f109151w = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p1(this.f109152x, this.f109151w, continuation);
            default:
                return new p1(this.f109151w, this.f109152x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f109152x.d3(this.f109151w, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    int[] iArr = q1.f109160a;
                    k4l.r0 r0Var = this.f109151w;
                    int i3 = iArr[r0Var.ordinal()];
                    com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109152x;
                    if (i3 != 1) {
                        Continuation continuation = null;
                        if (i3 == 2 || i3 == 3) {
                            ah1.m mVar = new ah1.m(eVar, r0Var, continuation, 7);
                            this.v = 2;
                            if (com.revolut.trading.orders.ui.invest.placement.screens.edit.e.N2(eVar, r0Var, mVar, this) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p1 p1Var = new p1(eVar, r0Var, (Continuation) null);
                            this.v = 3;
                            if (com.revolut.trading.orders.ui.invest.placement.screens.edit.e.N2(eVar, r0Var, p1Var, this) == aVar2) {
                                return aVar2;
                            }
                        }
                    } else {
                        this.v = 1;
                        if (eVar.d3(r0Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(k4l.r0 r0Var, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation) {
        super(1, continuation);
        this.f109151w = r0Var;
        this.f109152x = eVar;
    }
}
