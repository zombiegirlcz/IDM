package iqg;

import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SpareChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SpareChangeScreen spareChangeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = spareChangeScreen;
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
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SpareChangeScreen spareChangeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar = (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) spareChangeScreen.d3();
                bVar.getClass();
                bVar.n2(new n(bVar, null, 1), new whi.b(6));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar2 = (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) spareChangeScreen.d3();
                bVar2.getClass();
                bVar2.n2(new n(bVar2, null, 0), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
