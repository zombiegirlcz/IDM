package nme;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeroBannerDelegate.Model model = (HeroBannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarG3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof m19.a) {
            m19.a aVar2 = (m19.a) obj3;
            fVar.M2(aVar2.f201290b, aVar2.f201291c, (com.revolut.analytics.ads.model.a) obj3);
        } else {
            int i = jli.h.f175850a;
        }
        zn.d dVar = obj3 instanceof zn.d ? (zn.d) obj3 : null;
        if (dVar != null) {
            fVar.z.Z2(dVar);
        }
        return Unit.f186387a;
    }
}
