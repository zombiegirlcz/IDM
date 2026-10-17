package ho6;

import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.CrossBorderCountryDepartmentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CrossBorderCountryDepartmentsScreen f154227w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f154227w = crossBorderCountryDepartmentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f154227w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f154227w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((se6.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = this.f154227w;
        switch (i) {
            case 0:
                se6.i countryDepartment = (se6.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) crossBorderCountryDepartmentsScreen.d3();
                pVar.getClass();
                Intrinsics.checkNotNullParameter(countryDepartment, "countryDepartment");
                pVar.C2(new k(countryDepartment));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarD3 = crossBorderCountryDepartmentsScreen.d3();
                Intrinsics.h(query);
                p pVar2 = (p) lVarD3;
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                pVar2.H2(pVar2.f154239q, new n(query, 0));
                break;
        }
        return Unit.f186387a;
    }
}
