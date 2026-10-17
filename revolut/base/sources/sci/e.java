package sci;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExpectedAmountController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ExpectedAmountController expectedAmountController, Continuation continuation) {
        super(2, continuation);
        this.v = expectedAmountController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        String text = textData.f52598b.toString();
        com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a aVar2 = (com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        aVar2.H2(aVar2.f97768q, new s31.a(aVar2, text, 24));
        return Unit.f186387a;
    }
}
