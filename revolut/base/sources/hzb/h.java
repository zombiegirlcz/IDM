package hzb;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public RevPointsSpareChangeControllerApi$InputData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yvh.b f157102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Integer f157103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f157104y;
    public final /* synthetic */ kotlin.jvm.internal.q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(yvh.b bVar, Integer num, i iVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f157102w = bVar;
        this.f157103x = num;
        this.f157104y = iVar;
        this.z = (kotlin.jvm.internal.q) function1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f157102w, this.f157103x, this.f157104y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        i iVar = this.f157104y;
        if (i == 0) {
            yhm.o.b(obj2);
            RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData2 = new RevPointsSpareChangeControllerApi$InputData(new RevPointsSpareChangeControllerApi$Mode.Adjust(this.f157102w, this.f157103x, 10));
            a2c.e eVar = iVar.f157112t;
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
        int i2 = g.f157101a[((p1c.h) obj2).ordinal()];
        ?? r110 = this.z;
        if (i2 == 1) {
            return iVar.A2(new RevPointsSpareChangeFullBannerGridControllerApi$Destination(revPointsSpareChangeControllerApi$InputData, r110, null, 4));
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        iVar.N2(iVar.o2(new p1c.a(revPointsSpareChangeControllerApi$InputData)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new g2f.b(3, r110));
        return Unit.f186387a;
    }
}
