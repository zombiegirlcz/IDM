package c5j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MissingFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MissingFieldsScreen missingFieldsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = missingFieldsScreen;
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
        MissingFieldsScreen missingFieldsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                missingFieldsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar3 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) missingFieldsScreen.d();
                aVar3.f99771s.Q();
                aVar3.C2(new k(((j) ((j2) aVar3.f99772t.f22677a).getValue()).f21568a));
                break;
        }
        return Unit.f186387a;
    }
}
