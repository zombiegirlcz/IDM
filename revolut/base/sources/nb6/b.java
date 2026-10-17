package nb6;

import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.p6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CharitiesOverviewFlow f213988w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CharitiesOverviewFlow charitiesOverviewFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213988w = charitiesOverviewFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f213988w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f213988w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CharitiesOverviewFlow charitiesOverviewFlow = this.f213988w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE3 = charitiesOverviewFlow.e3();
                Intrinsics.h(id10);
                com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar = (com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) cVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_MENU_REV_POINTS_BALANCE")) {
                    oki.h.v2(bVar.v, CharitiesOverviewFlowContract$ModalStep.DonateWithRevPointsIntro.f72016a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                p6 p6Var = (p6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE32 = charitiesOverviewFlow.e3();
                String id11 = p6Var.f209928b;
                com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar2 = (com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) cVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                bVar2.H2(bVar2.f72024t, new mll.h(id11, 22));
                break;
        }
        return Unit.f186387a;
    }
}
