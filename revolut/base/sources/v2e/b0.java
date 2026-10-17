package v2e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreExclusivesOffer;
import com.revolut.feature.store.api.model.StoreGiftcardsOffer;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import dp4.b1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f285695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f285696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f285697y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Continuation continuation, i0 i0Var) {
        super(3, continuation);
        this.u = i;
        this.f285697y = i0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, continuation, this.f285697y);
                b0Var.f285695w = flowCollector;
                b0Var.f285696x = obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0(1, continuation, this.f285697y);
                b0Var2.f285695w = flowCollector;
                b0Var2.f285696x = obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b0 b0Var3 = new b0(2, continuation, this.f285697y);
                b0Var3.f285695w = flowCollector;
                b0Var3.f285696x = obj3;
                return b0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                b0 b0Var4 = new b0(3, continuation, this.f285697y);
                b0Var4.f285695w = flowCollector;
                b0Var4.f285696x = obj3;
                return b0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                b0 b0Var5 = new b0(4, continuation, this.f285697y);
                b0Var5.f285695w = flowCollector;
                b0Var5.f285696x = obj3;
                return b0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                b0 b0Var6 = new b0(5, continuation, this.f285697y);
                b0Var6.f285695w = flowCollector;
                b0Var6.f285696x = obj3;
                return b0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                b0 b0Var7 = new b0(6, continuation, this.f285697y);
                b0Var7.f285695w = flowCollector;
                b0Var7.f285696x = obj3;
                return b0Var7.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var8 = new b0(7, continuation, this.f285697y);
                b0Var8.f285695w = flowCollector;
                b0Var8.f285696x = obj3;
                return b0Var8.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        StoreExclusivesOffer storeExclusivesOffer;
        StoreGiftcardsOffer storeGiftcardsOffer;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f285695w;
                    StoreMegaOffer.StoreRedeem storeRedeem = (StoreMegaOffer.StoreRedeem) this.f285696x;
                    String str = (storeRedeem == null || (storeExclusivesOffer = storeRedeem.f88559b) == null) ? null : storeExclusivesOffer.f88511a;
                    vii.b bVar = this.f285697y.f285711y;
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = bVar.f289601b.collect(new nj8.g(flowCollector, str, 13), this);
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
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f285695w;
                    Pair pair = (Pair) this.f285696x;
                    String str2 = (String) pair.f186385a;
                    Flow nVar = str2 != null ? new urd.n(this.f285697y.f285705q.l(new t1e.o(13, null, null, str2, null), (w4l.k) pair.f186386b), 29) : new go.g(null, 2);
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVar, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f285695w;
                    w4l.k kVar = (w4l.k) this.f285696x;
                    i0 i0Var = this.f285697y;
                    l2e.a aVar4 = i0Var.f285704p;
                    StoreBrandDetailRedeemScreenContract$InputData storeBrandDetailRedeemScreenContract$InputData = i0Var.o;
                    vkm.d dVarA = aVar4.a(new t1e.u(storeBrandDetailRedeemScreenContract$InputData.f88688a, storeBrandDetailRedeemScreenContract$InputData.f88690c), kVar);
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarA, this) == aVar3) {
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
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f285695w;
                    vkm.d dVarB = rd0.e.b(this.f285697y.f285707s.c(Intrinsics.f((w4l.k) this.f285696x, w4l.i.f294643c)));
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f285695w;
                    String str3 = (String) this.f285696x;
                    Flow flowC = str3 != null ? this.f285697y.f285706r.c(str3, w4l.i.f294643c) : new go.g(new Data(null, null, false, 7, null), 2);
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowC, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f285695w;
                    v1 v1Var = new v1(new b1(this.f285697y, (Data) this.f285696x, null, 5));
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, v1Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f285695w;
                    StoreMegaOffer.StoreRedeem storeRedeem2 = (StoreMegaOffer.StoreRedeem) this.f285696x;
                    if (storeRedeem2 == null || (storeGiftcardsOffer = storeRedeem2.f88558a) == null || storeRedeem2.f88559b != null) {
                        storeGiftcardsOffer = null;
                    }
                    vii.b bVar2 = this.f285697y.v;
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector7);
                    Object objCollect2 = bVar2.f289601b.collect(new q2e.m0(flowCollector7, storeGiftcardsOffer, 1), this);
                    if (objCollect2 != aVar8) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar8) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f285695w;
                    Pair pair2 = (Pair) this.f285696x;
                    StoreGiftcardsOffer storeGiftcardsOffer2 = (StoreGiftcardsOffer) pair2.f186385a;
                    Flow h0Var = storeGiftcardsOffer2 != null ? new h0(this.f285697y.f285706r.d(storeGiftcardsOffer2.f88527a, (w4l.k) pair2.f186386b), 0) : new go.g(null, 2);
                    this.f285695w = null;
                    this.f285696x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, h0Var, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
