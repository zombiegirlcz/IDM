package bbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f14269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14270x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a f14271y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f14271y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, this.f14271y, continuation);
                a0Var.f14269w = flowCollector;
                a0Var.f14270x = obj3;
                return a0Var.invokeSuspend(Unit.f186387a);
            case 1:
                a0 a0Var2 = new a0(1, this.f14271y, continuation);
                a0Var2.f14269w = flowCollector;
                a0Var2.f14270x = obj3;
                return a0Var2.invokeSuspend(Unit.f186387a);
            default:
                a0 a0Var3 = new a0(2, this.f14271y, continuation);
                a0Var3.f14269w = flowCollector;
                a0Var3.f14270x = obj3;
                return a0Var3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f14269w;
                    boolean zF = Intrinsics.f((w4l.k) this.f14270x, w4l.i.f294643c);
                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = this.f14271y;
                    wkm.l lVarQ = vkm.q.Q(rd0.e.b(ue0.e.p(aVar2.f93828r.a(aVar2.o.f93814a, zF), h0.f322473a)), new c0((Continuation) null, aVar2, zF, 0));
                    this.f14269w = null;
                    this.f14270x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar3 = this.f14271y;
                TravelHotelsAmendmentConfirmationScreenContract$InputData travelHotelsAmendmentConfirmationScreenContract$InputData = aVar3.o;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f14269w;
                    w4l.k loadingStrategy = (w4l.k) this.f14270x;
                    i9g.h hVar = aVar3.f93827q;
                    qei.g params = new qei.g(travelHotelsAmendmentConfirmationScreenContract$InputData.f93814a, travelHotelsAmendmentConfirmationScreenContract$InputData.f93815b, travelHotelsAmendmentConfirmationScreenContract$InputData.f93816c);
                    List selectedBeds = travelHotelsAmendmentConfirmationScreenContract$InputData.d;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    fag.o oVar = hVar.f159796a;
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV = nim.a.v(nim.a.v(oVar.f133354c.b(params, loadingStrategy), new i6j.p(22)), new i25.e(hVar, selectedBeds, 11));
                    this.f14269w = null;
                    this.f14270x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f14269w;
                    w4l.k kVar = (w4l.k) this.f14270x;
                    vkm.d dVarB = rd0.e.b(((nyb.o) this.f14271y.f93830t).f(kVar instanceof w4l.i));
                    this.f14269w = null;
                    this.f14270x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
