package j2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ y u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, Continuation continuation) {
        super(1, continuation);
        this.u = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVar = this.u;
        yji.l.g2(yVar, new TravelExperiencesDatesSelectionScreen(new TravelExperiencesDatesSelectionScreenContract$InputData(((h) ((j2) yVar.f170892x.f22677a).getValue()).f170866a, o3g.e.RANGE, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.All.f93159a)), null, new p(yVar, 1), 1);
        return Unit.f186387a;
    }
}
