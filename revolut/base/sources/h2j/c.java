package h2j;

import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l1j.e;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DualChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DualChooserScreen dualChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dualChooserScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DualChooserScreen dualChooserScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) dualChooserScreen.e3()).C2(e.a.f191551a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar3 = (com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) dualChooserScreen.e3();
                aVar3.J2(((i) ((j2) aVar3.E.f22677a).getValue()).f148832c);
                break;
        }
        return Unit.f186387a;
    }
}
