package vch;

import aw0.n6;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WithdrawScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(WithdrawScreen withdrawScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = withdrawScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t1h.h hVar;
        int i = this.u;
        WithdrawScreen withdrawScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                withdrawScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0 x0Var = (x0) withdrawScreen.T2();
                Data data = ((k) x0Var.t2()).f287712h;
                if (data != null) {
                    iii.c.f(data, new v80.a(24), new v78.d(19), new uk2.w(x0Var, 26));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarI3 = withdrawScreen.T2();
                Unit click = Unit.f186387a;
                x0 x0Var2 = (x0) vVarI3;
                x0Var2.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                g0 g0Var = new g0(x0Var2, 0);
                Data data2 = ((k) x0Var2.t2()).f;
                if (data2 != null && (hVar = (t1h.h) data2.getContent()) != null) {
                    g0Var.invoke(hVar);
                }
                return click;
        }
    }
}
