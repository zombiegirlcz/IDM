package md8;

import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m2f.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorConsentRequestPromptScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorConsentRequestPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.v, continuation, 0);
            case 1:
                return new v(this.v, continuation, 1);
            default:
                return new v(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((v) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) juniorConsentRequestPromptScreen.d();
                qVar.B2();
                qVar.C2(zc8.c.SKIPPED);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar2 = (q) juniorConsentRequestPromptScreen.d();
                qVar2.getClass();
                qVar2.n2(new b0(qVar2, new l(qVar2, null), (Continuation) null), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar3 = (q) juniorConsentRequestPromptScreen.d();
                qVar3.getClass();
                qVar3.n2(new b0(qVar3, new n(qVar3, continuation, 0), (Continuation) null), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
