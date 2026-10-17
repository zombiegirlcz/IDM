package vci;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker.TransactionFrequencyController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionFrequencyController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TransactionFrequencyController transactionFrequencyController, Continuation continuation) {
        super(2, continuation);
        this.v = transactionFrequencyController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.S.getValue();
        Object obj3 = model.f;
        eVar.getClass();
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionFrequency");
        eVar.C2(new d((yci.a) obj3));
        return Unit.f186387a;
    }
}
