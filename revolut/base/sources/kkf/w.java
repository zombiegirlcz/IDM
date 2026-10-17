package kkf;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements oim.o {
    public final /* synthetic */ x A;
    public int u;
    public /* synthetic */ tof.a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ tof.t3 f184987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f184988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ ChargeBreakdown f184989y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Function1 function1, x xVar, Continuation continuation) {
        super(5, continuation);
        this.z = function1;
        this.A = xVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        w wVar = new w(this.z, this.A, (Continuation) obj6);
        wVar.v = (tof.a3) obj2;
        wVar.f184987w = (tof.t3) obj3;
        wVar.f184988x = zBooleanValue;
        wVar.f184989y = (ChargeBreakdown) obj5;
        return wVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tof.a3 a3Var = this.v;
        tof.t3 t3Var = this.f184987w;
        boolean z = this.f184988x;
        ChargeBreakdown chargeBreakdown = this.f184989y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!((Boolean) this.z.invoke(a3Var)).booleanValue()) {
                return zhm.f0.f322471a;
            }
            this.v = null;
            this.f184987w = null;
            this.f184989y = null;
            this.f184988x = z;
            this.u = 1;
            tof.y6 y6Var = a3Var.e;
            tof.y6 y6Var2 = tof.y6.ATM;
            x xVar = this.A;
            obj2 = y6Var == y6Var2 ? xVar.a(chargeBreakdown, this, a3Var, t3Var, z) : xVar.b(chargeBreakdown, this, a3Var, t3Var, z);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (List) obj2;
    }
}
