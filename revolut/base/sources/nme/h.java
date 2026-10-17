package nme;

import com.revolut.core.ui_kit.delegates.FeedCollectionDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FeedCollectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeedCollectionDelegate.Model model = (FeedCollectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarG3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getF52328h() instanceof k19.c) {
            Object e = model.getF52328h();
            Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.LifestyleAction");
            k19.c cVar = (k19.c) e;
            String str = cVar.f180147a;
            k19.d0 d0Var = cVar.f180148b;
            String str2 = d0Var != null ? d0Var.f180151a : null;
            Object e2 = model.getF52328h();
            fVar.M2(str, str2, e2 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) e2 : null);
        }
        if (model.getF52328h() instanceof cme.a) {
            Object e4 = model.getF52328h();
            Intrinsics.i(e4, "null cannot be cast to non-null type com.revolut.feature.tab.lifestyle.impl.ui.mapper.collection.products.FeedCollectionItemParcelWrapper");
            k19.c cVar2 = ((cme.a) e4).f25212a;
            String str3 = cVar2.f180147a;
            k19.d0 d0Var2 = cVar2.f180148b;
            String str4 = d0Var2 != null ? d0Var2.f180151a : null;
            Object e5 = model.getF52328h();
            fVar.M2(str3, str4, e5 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) e5 : null);
        }
        Object e6 = model.getF52328h();
        zn.d dVar = e6 instanceof zn.d ? (zn.d) e6 : null;
        if (dVar != null) {
            fVar.z.Z2(dVar);
        }
        return Unit.f186387a;
    }
}
