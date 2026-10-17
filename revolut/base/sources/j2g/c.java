package j2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreen;
import ip0.vr;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelExperiencesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelExperiencesHomeScreen travelExperiencesHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelExperiencesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        vr vrVar = (vr) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(vrVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesHomeScreen travelExperiencesHomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) travelExperiencesHomeScreen.e3();
                yVar.u.Z2(new t(yVar, null));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar2 = (y) travelExperiencesHomeScreen.e3();
                yVar2.u.Z2(new r(yVar2, null));
                break;
        }
        return Unit.f186387a;
    }
}
