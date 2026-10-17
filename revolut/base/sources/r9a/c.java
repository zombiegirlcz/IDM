package r9a;

import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixAuthorisationTransactionLimitScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixAuthorisationTransactionLimitScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pixAuthorisationTransactionLimitScreen.e3().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE3 = pixAuthorisationTransactionLimitScreen.e3();
                kVarE3.getClass();
                kVarE3.l2(new j(kVarE3, null, 0), new qi3.i(1, kVarE3, k.class, "handleApiError", "handleApiError(Ljava/lang/Throwable;)Z", 0, 18));
                break;
        }
        return Unit.f186387a;
    }
}
