package y1f;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p1c.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements Function2 {
    public RevPointsSpareChangeControllerApi$InputData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c f310375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f310375w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.f310375w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c cVar = this.f310375w;
        if (i == 0) {
            o.b(obj2);
            RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData2 = new RevPointsSpareChangeControllerApi$InputData(new RevPointsSpareChangeControllerApi$Mode.Adjust(null, null, 5));
            a2c.e eVar = cVar.f91130s;
            this.u = revPointsSpareChangeControllerApi$InputData2;
            this.v = 1;
            Enum enumB = eVar.b(this);
            if (enumB == aVar) {
                return aVar;
            }
            revPointsSpareChangeControllerApi$InputData = revPointsSpareChangeControllerApi$InputData2;
            obj2 = enumB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            revPointsSpareChangeControllerApi$InputData = this.u;
            o.b(obj2);
        }
        int i2 = d.f310374a[((h) obj2).ordinal()];
        if (i2 == 1) {
            return cVar.C1(new RevPointsSpareChangeFullBannerGridControllerApi$Destination(revPointsSpareChangeControllerApi$InputData, new c(cVar, 1), null, 4));
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.f2(cVar.e1(new p1c.a(revPointsSpareChangeControllerApi$InputData)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new c(cVar, 2));
        return Unit.f186387a;
    }
}
