package nml;

import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CountrySelectionScreen f217375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CountrySelectionScreen countrySelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217375w = countrySelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f217375w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f217375w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CountrySelectionScreen countrySelectionScreen = this.f217375w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = countrySelectionScreen.e3();
                Intrinsics.h(clickData);
                com.revolut.sso.impl.ui.country_selection.b bVar = (com.revolut.sso.impl.ui.country_selection.b) iVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar.l2(new com.revolut.sso.impl.ui.country_selection.a(bVar, clickData, null), new yi5.b(26));
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = countrySelectionScreen.e3();
                Intrinsics.h(clickData2);
                com.revolut.sso.impl.ui.country_selection.b bVar2 = (com.revolut.sso.impl.ui.country_selection.b) iVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                bVar2.l2(new com.revolut.sso.impl.ui.country_selection.a(bVar2, clickData2, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
