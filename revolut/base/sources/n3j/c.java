package n3j;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountFieldsScreen accountFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        String str = model.f52580a;
        ((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE3).getClass();
        return Unit.f186387a;
    }
}
