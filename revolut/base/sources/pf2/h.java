package pf2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpiAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UpiAreaScreen upiAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = upiAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVarE3 = this.v.d();
        Object obj3 = model.u;
        n nVar = (n) dVarE3;
        if (obj3 instanceof a) {
            nVar.I2((a) obj3);
        } else {
            nVar.getClass();
        }
        return Unit.f186387a;
    }
}
