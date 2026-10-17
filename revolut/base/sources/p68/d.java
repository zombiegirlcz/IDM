package p68;

import aw0.n6;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import s58.a;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TermsAndConditionsDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = termsAndConditionsDetailsScreen;
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
        switch (this.u) {
            case 0:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) termsAndConditionsDetailsScreen.e3();
                iVar.getClass();
                iVar.n2(new omg.e(iVar, null, 23), new whi.b(6));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) termsAndConditionsDetailsScreen.e3()).C2(a.C1440a.f260048a);
                break;
        }
        return Unit.f186387a;
    }
}
