package sxd;

import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sqd.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditTopUpOrderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EditTopUpOrderScreen editTopUpOrderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editTopUpOrderScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        EditTopUpOrderScreen editTopUpOrderScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) editTopUpOrderScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) editTopUpOrderScreen.R2();
                zVar.getClass();
                zVar.n2(new h0(zVar, continuation, 4), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar2 = (z) editTopUpOrderScreen.R2();
                zVar2.getClass();
                zVar2.n2(new y(zVar2, null), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
