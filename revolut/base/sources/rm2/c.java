package rm2;

import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import ip0.xc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BackgroundCatalogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BackgroundCatalogController backgroundCatalogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = backgroundCatalogController;
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
        switch (this.u) {
            case 0:
                return ((c) create((xc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BackgroundCatalogController backgroundCatalogController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) backgroundCatalogController.d();
                bVar.H2(bVar.v, new rj7.b(29));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                backgroundCatalogController.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
