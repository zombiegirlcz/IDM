package j2c;

import aw0.n6;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsSpareChangeFullListController f170805w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsSpareChangeFullListController revPointsSpareChangeFullListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170805w = revPointsSpareChangeFullListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f170805w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f170805w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f170805w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            default:
                c cVar4 = new c(this.f170805w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsSpareChangeFullListController revPointsSpareChangeFullListController = this.f170805w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE3 = revPointsSpareChangeFullListController.e3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) eVarE3).I2(aVar);
                break;
            case 1:
                n6 buttonModel = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE32 = revPointsSpareChangeFullListController.e3();
                Intrinsics.h(buttonModel);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar4 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) eVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                String str = buttonModel.f;
                if (Intrinsics.f(str, "SPARE_CHANGE_DEACTIVATE_BUTTON_TAG")) {
                    aVar4.l2(new s(0, aVar4, null), new p(aVar4, 0));
                } else if (Intrinsics.f(str, "SPARE_CHANGE_ACTIVATE_BUTTON_TAG")) {
                    aVar4.J2();
                }
                break;
            case 2:
                n6 buttonModel2 = (n6) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE33 = revPointsSpareChangeFullListController.e3();
                Intrinsics.h(buttonModel2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar6 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) eVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(buttonModel2, "buttonModel");
                String str2 = buttonModel2.f;
                if (Intrinsics.f(str2, "SPARE_CHANGE_ACTIVATE_BUTTON_TAG")) {
                    aVar6.J2();
                } else if (Intrinsics.f(str2, "SPARE_CHANGE_NOT_NOW_BUTTON_TAG")) {
                    aVar6.C2(RevPointsSpareChangeControllerApi$Result.Skipped.f84132a);
                }
                break;
            default:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE34 = revPointsSpareChangeFullListController.e3();
                Intrinsics.h(aVar7);
                ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) eVarE34).I2(aVar7);
                break;
        }
        return Unit.f186387a;
    }
}
