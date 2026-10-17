package a0l;

import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NationalIdentifierDocumentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(NationalIdentifierDocumentController nationalIdentifierDocumentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nationalIdentifierDocumentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        NationalIdentifierDocumentController nationalIdentifierDocumentController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) nationalIdentifierDocumentController.d3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) nationalIdentifierDocumentController.d3();
                xel.a aVar3 = ((b) ((j2) nVar.f442q.f22677a).getValue()).f427b;
                xel.c cVar = nVar.o.f104207a;
                nVar.C2(new d(aVar3 == null ? new xel.f(cVar, false, false) : nVar.f441p.c(cVar, aVar3, false)));
                break;
        }
        return Unit.f186387a;
    }
}
