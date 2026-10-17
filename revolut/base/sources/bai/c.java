package bai;

import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AcceptBankTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AcceptBankTermsScreen acceptBankTermsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = acceptBankTermsScreen;
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

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AcceptBankTermsScreen acceptBankTermsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AcceptBankTermsScreen.Companion aVar2 = AcceptBankTermsScreen.INSTANCE;
                acceptBankTermsScreen.d3().f204040b.setExpanded(false);
                ((dli.c) acceptBankTermsScreen.N.getValue()).h().smoothScrollToPosition(((dli.c) r4.getValue()).w().getItemCount() - 1);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_retail_user_declarations.bank_terms.a aVar4 = (com.revolut.feature_retail_user_declarations.bank_terms.a) acceptBankTermsScreen.R2();
                aVar4.getClass();
                aVar4.n2(new aza.g(aVar4, null, 7), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
