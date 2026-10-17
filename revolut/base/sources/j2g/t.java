package j2g;

import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import j2g.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ y u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, Continuation continuation) {
        super(1, continuation);
        this.u = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(new k.a((TravelExperienceDatesSelection) null, (TravelExperiencesSelectedLocation) null, 7));
        return Unit.f186387a;
    }
}
