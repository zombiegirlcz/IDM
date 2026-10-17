package lyb;

import a2c.e;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import gim.i;
import ht0.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p1c.h;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public RevPointsSpareChangeControllerApi$InputData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f200775w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f200775w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f200775w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        d dVar = this.f200775w;
        if (i == 0) {
            o.b(obj2);
            RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData2 = new RevPointsSpareChangeControllerApi$InputData(new RevPointsSpareChangeControllerApi$Mode.Adjust(null, null, 5));
            e eVar = dVar.f200776l;
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
        int i2 = b.f200774a[((h) obj2).ordinal()];
        if (i2 == 1) {
            return dVar.A2(new RevPointsSpareChangeFullBannerGridControllerApi$Destination(revPointsSpareChangeControllerApi$InputData, null, new b0(0, this.f200775w, d.class, "showRewardsActivatedMessage", "showRewardsActivatedMessage()V", 0, 7), 2));
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerO2 = dVar.o2(new p1c.a(revPointsSpareChangeControllerApi$InputData));
        viewControllerO2.k2(new ljd.e(dVar, 21));
        n.P2(dVar, viewControllerO2, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
