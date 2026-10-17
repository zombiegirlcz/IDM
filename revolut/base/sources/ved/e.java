package ved;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedAlertDetailsScreen f288266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SharedAlertDetailsScreen sharedAlertDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288266w = sharedAlertDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f288266w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f288266w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        SharedAlertDetailsScreen sharedAlertDetailsScreen = this.f288266w;
        switch (i) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarI3 = sharedAlertDetailsScreen.T2();
                String selectedId = g6Var.f54199a;
                oVarI3.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                ngd.a range = ngd.a.valueOf(selectedId);
                j2 j2Var = oVarI3.v;
                ngd.b type = ((ngd.c) j2Var.getValue()).f215135a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(range, "range");
                j2Var.g(null, new ngd.c(type, range));
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarI32 = sharedAlertDetailsScreen.T2();
                Intrinsics.h(clickData);
                oVarI32.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                oVarI32.l2(new v06.i(oVarI32, clickData, continuation, 26), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
