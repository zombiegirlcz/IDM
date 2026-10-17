package pij;

import dfj.v2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dfj.x0 f236569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236570x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, dfj.x0 x0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236570x = bVar;
        this.f236569w = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0(this.f236570x, this.f236569w, continuation, 0);
            case 1:
                return new n0(this.f236569w, this.f236570x, continuation);
            default:
                return new n0(this.f236570x, this.f236569w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v2 v2Var = this.f236570x.f101084r;
                String str = ((dfj.s0) this.f236569w).f114099a;
                this.v = 1;
                Object objD = v2Var.d(str, w4l.h.f294642c, this);
                return objD == aVar ? aVar : objD;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dfj.r0 r0Var = (dfj.r0) this.f236569w;
                    String str2 = r0Var.f114084a;
                    String str3 = r0Var.f114085b;
                    this.v = 1;
                    if (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.I2(this.f236570x, str3, str2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    dfj.q0 q0Var = (dfj.q0) this.f236569w;
                    String str4 = q0Var.f114071a;
                    String str5 = q0Var.f114072b;
                    String str6 = q0Var.f114073c;
                    this.v = 1;
                    if (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.J2(this.f236570x, str4, str5, str6, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dfj.x0 x0Var, com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = 1;
        this.f236569w = x0Var;
        this.f236570x = bVar;
    }
}
