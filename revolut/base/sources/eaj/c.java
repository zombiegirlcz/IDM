package eaj;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ CryptoNavigationInterceptorScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoNavigationInterceptorScreen cryptoNavigationInterceptorScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoNavigationInterceptorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((f) this.u.f100026a0.getValue()).u2();
        return Unit.f186387a;
    }
}
