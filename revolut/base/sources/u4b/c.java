package u4b;

import aw0.n6;
import cli.y;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CfdWithdrawScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CfdWithdrawScreen cfdWithdrawScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cfdWithdrawScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CfdWithdrawScreen cfdWithdrawScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cfdWithdrawScreen.e3().B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = cfdWithdrawScreen.e3();
                y yVar = jVarE3.v;
                if (!(((e) ((j2) yVar.f22677a).getValue()).f277292c.getContent() instanceof x4b.b)) {
                    throw new IllegalStateException("Withdraw button enabled with invalid input");
                }
                jVarE3.C2(new f(new dj0.d(((e) ((j2) yVar.f22677a).getValue()).f277291b, jVarE3.o.f82284b)));
                return Unit.f186387a;
        }
    }
}
