package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LoginFragment v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(LoginFragment loginFragment, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = loginFragment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.v, continuation, 0);
            default:
                return new v(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoginFragment loginFragment = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wl0.c cVar = loginFragment.q0;
                if (cVar != null) {
                    return cVar.c();
                }
                Intrinsics.r("biometricHelper");
                throw null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ie9.h) loginFragment.N()).f160679a.I0("KEY_LAST_VERIFICATION_ATTEMPT_TIME");
                return Unit.f186387a;
        }
    }
}
