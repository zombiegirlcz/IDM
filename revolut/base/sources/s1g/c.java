package s1g;

import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelExperiencesCancellationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelExperiencesCancellationScreen travelExperiencesCancellationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelExperiencesCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesCancellationScreen travelExperiencesCancellationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                travelExperiencesCancellationScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) travelExperiencesCancellationScreen.T2();
                TravelExperiencesCancellationScreenContract$Mode travelExperiencesCancellationScreenContract$Mode = ((g) eVar.t2()).f259135a;
                if (travelExperiencesCancellationScreenContract$Mode instanceof TravelExperiencesCancellationScreenContract$Mode.BookingCancellation) {
                    eVar.l2(new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.d(eVar, (TravelExperiencesCancellationScreenContract$Mode.BookingCancellation) travelExperiencesCancellationScreenContract$Mode, ((g) eVar.t2()).f259136b, null), new yi5.b(26));
                    return Unit.f186387a;
                }
                if (travelExperiencesCancellationScreenContract$Mode instanceof TravelExperiencesCancellationScreenContract$Mode.ExperiencePreview) {
                    throw new IllegalStateException("Cancellation action is not allowed in experience preview mode.");
                }
                throw new NoWhenBranchMatchedException();
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(((com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) travelExperiencesCancellationScreen.T2()).f93039p, false, null, 3);
                return Unit.f186387a;
        }
    }
}
