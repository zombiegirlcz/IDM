package bai;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ AcceptBankTermsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AcceptBankTermsScreen acceptBankTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = acceptBankTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_retail_user_declarations.bank_terms.a aVar2 = (com.revolut.feature_retail_user_declarations.bank_terms.a) this.u.R2();
        aVar2.H2(aVar2.f97492t, new b96.a(17));
        aVar2.J2();
        return Unit.f186387a;
    }
}
