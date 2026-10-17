package yv7;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EmbeddedInsuranceGetHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EmbeddedInsuranceGetHelpScreen embeddedInsuranceGetHelpScreen, Continuation continuation) {
        super(2, continuation);
        this.v = embeddedInsuranceGetHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BannerDelegate.Model model = (BannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.f76136a0.getValue();
        k kVar = (k) gVar;
        kVar.y2(model.k, model.f51700a);
        return Unit.f186387a;
    }
}
