package jxi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import dwi.i0;
import dwi.o0;
import dwi.r0;
import hwi.c1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import svi.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f179206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c f179208y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f179208y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, this.f179208y, continuation);
                b0Var.f179206w = flowCollector;
                b0Var.f179207x = obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0(1, this.f179208y, continuation);
                b0Var2.f179206w = flowCollector;
                b0Var2.f179207x = obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b0 b0Var3 = new b0(2, this.f179208y, continuation);
                b0Var3.f179206w = flowCollector;
                b0Var3.f179207x = obj3;
                return b0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                b0 b0Var4 = new b0(3, this.f179208y, continuation);
                b0Var4.f179206w = flowCollector;
                b0Var4.f179207x = obj3;
                return b0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                b0 b0Var5 = new b0(4, this.f179208y, continuation);
                b0Var5.f179206w = flowCollector;
                b0Var5.f179207x = obj3;
                return b0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                b0 b0Var6 = new b0(5, this.f179208y, continuation);
                b0Var6.f179206w = flowCollector;
                b0Var6.f179207x = obj3;
                return b0Var6.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var7 = new b0(6, this.f179208y, continuation);
                b0Var7.f179206w = flowCollector;
                b0Var7.f179207x = obj3;
                return b0Var7.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f179206w;
                    Flow flowZ2 = this.f179208y.z.Z2(new i7d.k(new TextLocalisedClause(R$string.airport_lounges_home_help_center_title, null, null, 14), "airport_lounges_home", zhm.u.c(new i7d.g((String) this.f179207x))));
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowZ2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f179206w;
                    vkm.d dVarB = rd0.e.b(this.f179208y.f99094q.a(true, true));
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f179206w;
                    vkm.d dVarB2 = rd0.e.b(((hwi.a0) this.f179208y.f99094q.f120458a).f156191g.e(Unit.f186387a, w4l.i.f294643c));
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f179206w;
                    vkm.d dVarB3 = rd0.e.b(((i0) this.f179208y.f99098w).a());
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f179206w;
                    vkm.d dVarB4 = rd0.e.b(((w4l.f) ((c1) this.f179208y.f99095r.f120411c).e.getValue()).f(Unit.f186387a, false));
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB4, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f179206w;
                    r0 r0Var = this.f179208y.f99095r.d;
                    sfm.b bVar = new sfm.b(r0Var.f120456b.e("android.permission.ACCESS_COARSE_LOCATION"), new dv5.n(new o0(r0Var, 0), 17), 2);
                    Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                    vkm.d dVarB5 = rd0.e.b(bVar);
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, dVarB5, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f179206w;
                    vkm.d dVarA = this.f179208y.B.a(new y0(3), w4l.i.f294643c);
                    this.f179206w = null;
                    this.f179207x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, dVarA, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
