package nk4;

import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConfirmAutopayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ConfirmAutopayScreen confirmAutopayScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = confirmAutopayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConfirmAutopayScreen confirmAutopayScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) confirmAutopayScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) confirmAutopayScreen.e3()).C2(a.C0475a.f68637a);
                break;
        }
        return Unit.f186387a;
    }
}
