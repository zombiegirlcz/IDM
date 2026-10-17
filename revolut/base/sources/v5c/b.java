package v5c;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.revolut_x_promo.impl.ui.in_app_install.RevolutXInAppInstallController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ RevolutXInAppInstallController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevolutXInAppInstallController revolutXInAppInstallController, Continuation continuation) {
        super(2, continuation);
        this.u = revolutXInAppInstallController;
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
        ((g) this.u.L.getValue()).B2();
        return Unit.f186387a;
    }
}
