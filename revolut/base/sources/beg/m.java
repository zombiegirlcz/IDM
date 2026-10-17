package beg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f14836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f14838y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, s sVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f14838y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f14838y, continuation);
                mVar.f14836w = flowCollector;
                mVar.f14837x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            default:
                m mVar2 = new m(1, this.f14838y, continuation);
                mVar2.f14836w = flowCollector;
                mVar2.f14837x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f14836w;
                    xag.c cVar = (xag.c) this.f14837x;
                    Intrinsics.h(cVar);
                    s sVar = this.f14838y;
                    akg.n nVarV = nim.a.v(vkm.q.Q(sVar.f14849t, new m(1, sVar, null)), new k(sVar, cVar, 0));
                    this.f14836w = null;
                    this.f14837x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = nVarV.collect(new a3i.h(flowCollector, cVar, 27), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f14836w;
                    w4l.k loadingStrategy = (w4l.k) this.f14837x;
                    s sVar2 = this.f14838y;
                    fag.o oVar = sVar2.f14845p;
                    TravelHotelsRoomsSelectionAmendmentScreenContract$InputData travelHotelsRoomsSelectionAmendmentScreenContract$InputData = sVar2.o;
                    qei.g params = new qei.g(travelHotelsRoomsSelectionAmendmentScreenContract$InputData.f94001a, travelHotelsRoomsSelectionAmendmentScreenContract$InputData.f94002b, travelHotelsRoomsSelectionAmendmentScreenContract$InputData.f94003c);
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV2 = nim.a.v(oVar.f133354c.b(params, loadingStrategy), q.f14843a);
                    this.f14836w = null;
                    this.f14837x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
