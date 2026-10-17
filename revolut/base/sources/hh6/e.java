package hh6;

import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MandateDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MandateDetailsScreen mandateDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = mandateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MandateDetailsScreen mandateDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mandateDetailsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) mandateDetailsScreen.T2();
                jki.i iVarT2 = pVar.t2();
                Continuation continuation = null;
                i iVar = iVarT2 instanceof i ? (i) iVarT2 : null;
                if (iVar != null) {
                    pVar.n2(new hg0.n(pVar, iVar, continuation, 4), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
