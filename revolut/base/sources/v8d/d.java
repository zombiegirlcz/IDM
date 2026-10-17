package v8d;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TopLevelFaqScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TopLevelFaqScreen topLevelFaqScreen, Continuation continuation) {
        super(2, continuation);
        this.v = topLevelFaqScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Z.getValue();
        m mVar = (m) jVar;
        mVar.z2(model.k, model.f52373a);
        return Unit.f186387a;
    }
}
