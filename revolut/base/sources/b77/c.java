package b77;

import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreen;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DirectDebitFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DirectDebitFormScreen directDebitFormScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = directDebitFormScreen;
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
        DirectDebitFormScreen directDebitFormScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                directDebitFormScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.giro.impl.ui.form.b bVar = (com.revolut.feature.giro.impl.ui.form.b) directDebitFormScreen.R2();
                h hVar = (h) ((j2) bVar.f74552t.f22677a).getValue();
                g gVar = hVar.f12922a;
                FormState formState = hVar.f12923b;
                int i2 = o.f12934b[gVar.ordinal()];
                if (i2 == 1) {
                    bVar.C2(new i(formState));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bVar.o instanceof DirectDebitFormScreenContract$InputData.Edit) {
                        bVar.l2(new av7.l(bVar, formState, null, 16), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }
}
