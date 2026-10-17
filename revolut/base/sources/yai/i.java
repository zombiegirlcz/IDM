package yai;

import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import com.revolut.feature_retail_user_declarations.email.screen.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EmailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(EmailScreen emailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = emailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmailScreen emailScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.screen.a) emailScreen.e3();
                aVar2.getClass();
                aVar2.l2(new r(aVar2, null, 2), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_retail_user_declarations.email.screen.a) emailScreen.e3()).C2(b.a.f97595a);
                break;
        }
        return Unit.f186387a;
    }
}
