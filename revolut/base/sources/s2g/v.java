package s2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ w u;
    public final /* synthetic */ TravelExperienceOptionSelectionV2.OptionWithTimes v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes, Continuation continuation) {
        super(2, continuation);
        this.u = wVar;
        this.v = optionWithTimes;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = this.u;
        j60.a aVar2 = wVar.f259333s;
        u2g.c cVar = wVar.f259334t;
        aVar2.A(((u2g.d) cVar).b(this.v, ((c1g.m) wVar.v).a()));
        return Unit.f186387a;
    }
}
