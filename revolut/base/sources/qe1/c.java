package qe1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditTaxRateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EditTaxRateScreen editTaxRateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editTaxRateScreen;
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

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditTaxRateScreen editTaxRateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                editTaxRateScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a) ((f) editTaxRateScreen.O.getValue());
                aVar3.getClass();
                aVar3.l2(new k(aVar3, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
