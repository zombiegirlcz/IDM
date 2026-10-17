package lph;

import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAddNewCollectionDestination;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ScreenerAllCollectionsRedesignScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ScreenerAllCollectionsRedesignScreen screenerAllCollectionsRedesignScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = screenerAllCollectionsRedesignScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScreenerAllCollectionsRedesignScreen screenerAllCollectionsRedesignScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                screenerAllCollectionsRedesignScreen.e3().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE3 = screenerAllCollectionsRedesignScreen.e3();
                List list = (List) ((a) ((j2) dVarE3.f199131s.f22677a).getValue()).f199123c.getContent();
                dVarE3.f199130r = list != null ? d.I2(list) : null;
                dVarE3.C1(new ScreenerRedesignAddNewCollectionDestination(null));
                break;
        }
        return Unit.f186387a;
    }
}
