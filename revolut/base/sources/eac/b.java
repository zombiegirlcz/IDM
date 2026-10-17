package eac;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevolutPayManagementHomeController f124164w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RevolutPayManagementHomeController revolutPayManagementHomeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f124164w = revolutPayManagementHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f124164w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f124164w, continuation, 1);
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
                return ((b) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        RevolutPayManagementHomeController revolutPayManagementHomeController = this.f124164w;
        int i2 = 6;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = revolutPayManagementHomeController.d();
                Intrinsics.h(listId);
                com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar2 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("INFO_ICON_ITEM_ID")) {
                    aVar2.n2(new ds4.y(aVar2, continuation, 28), new whi.b(6));
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = revolutPayManagementHomeController.d();
                Intrinsics.h(clickData);
                com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar4 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) iVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ActionWidgetDelegate.a aVar5 = clickData.f54721a;
                if (aVar5 instanceof ActionWidgetDelegate.a.c) {
                    if (Intrinsics.f(clickData.f54722b.f51590a, "ID_REV_POINTS_START_EARNING_WIDGET")) {
                        LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.RevPay.f84002a, false, 6);
                        RevPointsOptInNextDestination.Default r2 = RevPointsOptInNextDestination.Default.f83526a;
                        aVar4.C1(new RevPointsOptInDestination(r2, r2, lifestyleRevPointsOptInController$InputData));
                    }
                } else if (aVar5 instanceof ActionWidgetDelegate.a.C0395a) {
                    aVar4.n2(new e8e.w(aVar4, continuation, i2), new whi.b(6));
                } else {
                    int i3 = jli.h.f175850a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
