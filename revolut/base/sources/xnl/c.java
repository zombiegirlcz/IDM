package xnl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import tji.m;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.passcode.change_flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.sso.impl.ui.passcode.change_flow.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = aVar;
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
                return ((c) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar2 = this.v;
                aVar2.l2(new mt8.b(aVar2, true, null, 17), new xlb.o(1, aVar2, com.revolut.sso.impl.ui.passcode.change_flow.a.class, "handleInitPasscodeSubmissionError", "handleInitPasscodeSubmissionError(Ljava/lang/Throwable;)Z", 0, 7));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar4 = this.v;
                if (aVar4.o.f106014a) {
                    oki.h.D2(aVar4.f106599w);
                } else {
                    aVar4.C2(ejl.b.f126913a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
