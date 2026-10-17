package o9c;

import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q6c.k;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class t0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.ui.summary_screen.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t0 t0Var = new t0(this.v, continuation);
        t0Var.u = obj2;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t0) create((q6c.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q6c.h hVar = (q6c.h) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = this.v;
        if (hVar.b(fVar.o.getF84526g()).equals(k.a.f242551a)) {
            q9c.f fVar2 = (q9c.f) ((s) ((j2) fVar.M.f22677a).getValue()).f223236r.getContent();
            if (fVar2 instanceof q9c.e) {
                fVar.C2(new RevolutPaySummaryScreenContract$OutputData.OAuthPaymentSuccessful(((q9c.e) fVar2).f243863a.f277732c));
            } else {
                fVar.C2(RevolutPaySummaryScreenContract$OutputData.OrderComplete.f84558a);
            }
        }
        return nim.a.v(Intrinsics.f(hVar.f242544m.f242535b, "7995") ? nim.a.v(rd0.e.b(fVar.v.f181652a.d.f(Unit.f186387a, true)), new o95.b(15)) : zi0.c.i(Boolean.FALSE), new o3k.a(hVar, 27));
    }
}
