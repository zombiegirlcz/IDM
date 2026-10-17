package t27;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.FreelancerTaxReservationScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerTaxReservationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(FreelancerTaxReservationScreen freelancerTaxReservationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerTaxReservationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerTaxReservationScreen freelancerTaxReservationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                freelancerTaxReservationScreen.e3().B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = freelancerTaxReservationScreen.e3();
                y yVar = rVarE3.f267443q;
                int i2 = p.f267439a[((i) ((j2) yVar.f22677a).getValue()).f267432b.ordinal()];
                if (i2 == 1) {
                    rVarE3.C2(k.f267435a);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarE3.C2(new j(((i) ((j2) yVar.f22677a).getValue()).d));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                freelancerTaxReservationScreen.e3().C2(l.f267436a);
                return Unit.f186387a;
        }
    }
}
