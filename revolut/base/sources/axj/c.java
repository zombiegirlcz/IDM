package axj;

import a5k.n;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            UserOnboardingNavigationProvider$UseCase.SignIn signIn = new UserOnboardingNavigationProvider$UseCase.SignIn(0);
            this.u = 1;
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar2 = this.v;
            Object objP2 = aVar2.p2(this, new n(2, aVar2, signIn, aVar2, (Object) null, (Continuation) null));
            if (objP2 != aVar) {
                objP2 = Unit.f186387a;
            }
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
