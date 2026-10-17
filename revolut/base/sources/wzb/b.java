package wzb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreenContract$ModalStep;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExpiryHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevPointsExpiryHomeScreen revPointsExpiryHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExpiryHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.points_expiry.home.a aVar2 = (com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        ArrayList arrayList = null;
        List list = obj3 instanceof List ? (List) obj3 : null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof IssuedPoints) {
                    arrayList.add(obj4);
                }
            }
        }
        if (arrayList != null) {
            oki.h.v2(aVar2.f83835s, new RevPointsExpiryHomeScreenContract$ModalStep.RevPointsExpiryDetails(arrayList, false), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
