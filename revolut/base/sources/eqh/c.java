package eqh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.NewCollectionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.NewCollectionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import uqh.t;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NewCollectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(NewCollectionScreen newCollectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = newCollectionScreen;
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

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        NewCollectionScreen newCollectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a) ((e) newCollectionScreen.T.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a aVar3 = (com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a) ((e) newCollectionScreen.T.getValue());
                y yVar = aVar3.f96258s;
                t tVar = ((f) ((j2) yVar.f22677a).getValue()).f128460a.f282183a;
                if (tVar != null && (list = tVar.f282176b) != null) {
                    com.revolut.kompot.navigable.vc.modal.a aVar4 = aVar3.f96259t;
                    sph.o oVar = aVar3.f96255p;
                    zel.f fVar = aVar3.o.f128462a;
                    oVar.getClass();
                    oki.h.v2(aVar4, new NewCollectionScreenContract$ModalStep.SaveScreener(list, sph.o.a(fVar), ((f) ((j2) yVar.f22677a).getValue()).f128460a.e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
