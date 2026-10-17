package yv7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EmbeddedInsuranceGetHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmbeddedInsuranceGetHelpScreen embeddedInsuranceGetHelpScreen, Continuation continuation) {
        super(2, continuation);
        this.v = embeddedInsuranceGetHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.f76136a0.getValue();
        Object obj3 = model.i;
        k kVar = (k) gVar;
        j60.a.v(kVar.f317135r, false, null, 3);
        if (obj3 instanceof bu7.g) {
            bu7.g gVar2 = (bu7.g) obj3;
            if (gVar2.f18713a == bu7.f.HIDDEN_PHONE) {
                kVar.C1(nu7.a.b(gVar2.f18714b));
            }
        }
        return Unit.f186387a;
    }
}
