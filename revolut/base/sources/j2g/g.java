package j2g;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelExperiencesHomeScreen travelExperiencesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        y yVar = (y) lVarE3;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        yVar.u.Z2(new s(model, yVar, null));
        return Unit.f186387a;
    }
}
