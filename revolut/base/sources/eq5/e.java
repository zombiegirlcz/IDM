package eq5;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSendAmountInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoSendAmountInputScreen cryptoSendAmountInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSendAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((nqi.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        nqi.a amountInputData = (nqi.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        Intrinsics.h(amountInputData);
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) xVarE3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(amountInputData, "amountInputData");
        jVar.H2(jVar.F, new eq4.c(jVar, amountInputData, 6));
        return Unit.f186387a;
    }
}
