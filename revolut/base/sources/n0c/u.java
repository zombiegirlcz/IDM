package n0c;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mx0.a7;
import mx0.v9;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function2 {
    public RevPointsSpareChangeControllerApi$InputData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ od0.i f211002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.transactions.details.b f211003x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(od0.i iVar, com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f211002w = iVar;
        this.f211003x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.f211002w, this.f211003x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar = this.f211003x;
        if (i == 0) {
            yhm.o.b(obj2);
            RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData2 = new RevPointsSpareChangeControllerApi$InputData(new RevPointsSpareChangeControllerApi$Mode.Adjust((yvh.b) this.f211002w.f224257a, null, 14));
            a2c.e eVar = bVar.f83858t;
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
            yhm.o.b(obj2);
        }
        int i2 = t.f211001a[((p1c.h) obj2).ordinal()];
        if (i2 == 1) {
            return bVar.C1(new RevPointsSpareChangeFullBannerGridControllerApi$Destination(revPointsSpareChangeControllerApi$InputData, new v9(1, bVar.u, o1c.a.class, "showDialogIfNeeded", "showDialogIfNeeded(Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Result;)V", 0, 6), null, 4));
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.f2(bVar.e1(new p1c.a(revPointsSpareChangeControllerApi$InputData)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a7(bVar, 25));
        return Unit.f186387a;
    }
}
