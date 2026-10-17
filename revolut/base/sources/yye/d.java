package yye;

import aw0.n6;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.delay.UnverifiedCardTopUpDelayBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ UnverifiedCardTopUpDelayBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UnverifiedCardTopUpDelayBottomSheetController unverifiedCardTopUpDelayBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = unverifiedCardTopUpDelayBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UnverifiedCardTopUpDelayBottomSheetController unverifiedCardTopUpDelayBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                unverifiedCardTopUpDelayBottomSheetController.R.C2(a.f317936a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                unverifiedCardTopUpDelayBottomSheetController.R.C2(b.f317937a);
                break;
        }
        return Unit.f186387a;
    }
}
