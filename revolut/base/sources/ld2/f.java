package ld2;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.services.ideal.impl.ui.qr_auth.IdealQrAuthViewController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ IdealQrAuthViewController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IdealQrAuthViewController idealQrAuthViewController, Continuation continuation) {
        super(2, continuation);
        this.u = idealQrAuthViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((a) this.u.O.getValue()).B2();
        return Unit.f186387a;
    }
}
