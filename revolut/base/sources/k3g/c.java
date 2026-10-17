package k3g;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelExperiencesSearchScreen travelExperiencesSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f52708a, "RECENT_SEARCH_TITLE_ITEM_ID")) {
            o oVar = (o) ((l) this.v.g0.getValue());
            oVar.getClass();
            oVar.n2(new n(oVar, null, 2), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
