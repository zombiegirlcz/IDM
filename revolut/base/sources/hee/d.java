package hee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferTrackerInputFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TransferTrackerInputFormScreen transferTrackerInputFormScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferTrackerInputFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LocalDate localDate;
        TransferArrivalRequest transferArrivalRequest;
        int i = this.u;
        TransferTrackerInputFormScreen transferTrackerInputFormScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) transferTrackerInputFormScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) transferTrackerInputFormScreen.R2();
                j jVar = (j) ((j2) bVar.v.f22677a).getValue();
                String str = jVar.f151691c;
                Continuation continuation = null;
                if (str == null || (localDate = jVar.d) == null) {
                    transferArrivalRequest = null;
                } else {
                    String str2 = (String) zi0.c.I(jVar.f151689a);
                    long jB = bVar.f89420r.b(jVar.f151690b, str2);
                    xi0.b.Companion.getClass();
                    dj0.d dVar = new dj0.d(jB, xi0.a.a(str2));
                    boolean z = false;
                    boolean z3 = jVar.e && yh5.b.s(jVar);
                    if (jVar.f && yh5.b.v(jVar)) {
                        z = true;
                    }
                    transferArrivalRequest = new TransferArrivalRequest(dVar, str, localDate, z3, z);
                }
                if (transferArrivalRequest != null) {
                    bVar.n2(new h54.o(bVar, transferArrivalRequest, continuation, 26), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
