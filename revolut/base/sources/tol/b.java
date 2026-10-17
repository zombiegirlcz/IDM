package tol;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.sso.impl.ui.protection_check.ProtectionCheckScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tol.d;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ ProtectionCheckScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ProtectionCheckScreen protectionCheckScreen, Continuation continuation) {
        super(2, continuation);
        this.u = protectionCheckScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((g) ((e) this.u.W.getValue())).v2(d.a.f273245a);
        return Unit.f186387a;
    }
}
