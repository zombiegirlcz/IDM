package l2c;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import m1c.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ yvh.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a f191758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f191759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f191760y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yvh.b bVar, com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar, int i, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f191758w = aVar;
        this.f191759x = i;
        this.f191760y = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f191758w, this.f191759x, this.f191760y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ufm.f fVarQ;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar = this.f191758w;
        rul.e eVar = aVar.f84174q;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            int i2 = this.f191759x;
            yvh.b bVar = this.v;
            if (bVar != null) {
                fVarQ = eVar.d(!bVar.f317177b ? Boolean.TRUE : null, new Integer(i2));
            } else {
                fVarQ = eVar.q(i2);
            }
            this.u = 1;
            obj2 = nim.a.b(fVarQ, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        v1 v1Var = (v1) obj2;
        aVar.C2(this.f191760y ? new RevPointsSpareChangeControllerApi$Result.Activated(v1Var.f201468c) : new RevPointsSpareChangeControllerApi$Result.Updated(v1Var.f201468c));
        return Unit.f186387a;
    }
}
