package h2c;

import aw0.n6;
import com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.RevPointsSpareChangeFullGridController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsSpareChangeFullGridController f148770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsSpareChangeFullGridController revPointsSpareChangeFullGridController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f148770w = revPointsSpareChangeFullGridController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f148770w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f148770w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f148770w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsSpareChangeFullGridController revPointsSpareChangeFullGridController = this.f148770w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = revPointsSpareChangeFullGridController.e3();
                Intrinsics.h(clickData);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar2 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) hVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.d, RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a)) {
                    aVar2.l2(new r(1, aVar2, null), new yi5.b(26));
                }
                break;
            case 1:
                n6 buttonModel = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE32 = revPointsSpareChangeFullGridController.e3();
                Intrinsics.h(buttonModel);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar4 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) hVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                String str = buttonModel.f;
                if (Intrinsics.f(str, "SPARE_CHANGE_FM_DEACTIVATE_BUTTON_TAG")) {
                    aVar4.l2(new r(0, aVar4, null), new o(aVar4, 0));
                } else if (Intrinsics.f(str, "SPARE_CHANGE_FM_ACTIVATE_BUTTON_TAG")) {
                    aVar4.I2();
                }
                break;
            default:
                n6 buttonModel2 = (n6) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE33 = revPointsSpareChangeFullGridController.e3();
                Intrinsics.h(buttonModel2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar6 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) hVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(buttonModel2, "buttonModel");
                String str2 = buttonModel2.f;
                if (Intrinsics.f(str2, "SPARE_CHANGE_FM_ACTIVATE_BUTTON_TAG")) {
                    aVar6.I2();
                } else if (Intrinsics.f(str2, "SPARE_CHANGE_FM_NOT_NOW_BUTTON_TAG")) {
                    aVar6.C2(RevPointsSpareChangeControllerApi$Result.Skipped.f84132a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
