package hr4;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingStatus;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import gim.i;
import java.util.Optional;
import k4l.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import u6c.f0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f154765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f154766x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Data data = (Data) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(3, 0, continuation);
                bVar.f154765w = flowCollector;
                bVar.f154766x = data;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b(3, 1, continuation);
                bVar2.f154765w = flowCollector;
                bVar2.f154766x = data;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                b bVar3 = new b(3, 2, continuation);
                bVar3.f154765w = flowCollector;
                bVar3.f154766x = data;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 3:
                b bVar4 = new b(3, 3, continuation);
                bVar4.f154765w = flowCollector;
                bVar4.f154766x = data;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar5 = new b(3, 4, continuation);
                bVar5.f154765w = flowCollector;
                bVar5.f154766x = data;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar6 = new b(3, 5, continuation);
                bVar6.f154765w = flowCollector;
                bVar6.f154766x = data;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar7 = new b(3, 6, continuation);
                bVar7.f154765w = flowCollector;
                bVar7.f154766x = data;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar8 = new b(3, 7, continuation);
                bVar8.f154765w = flowCollector;
                bVar8.f154766x = data;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar9 = new b(3, 8, continuation);
                bVar9.f154765w = flowCollector;
                bVar9.f154766x = data;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar10 = new b(3, 9, continuation);
                bVar10.f154765w = flowCollector;
                bVar10.f154766x = data;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar11 = new b(3, 10, continuation);
                bVar11.f154765w = flowCollector;
                bVar11.f154766x = data;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar12 = new b(3, 11, continuation);
                bVar12.f154765w = flowCollector;
                bVar12.f154766x = data;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar13 = new b(3, 12, continuation);
                bVar13.f154765w = flowCollector;
                bVar13.f154766x = data;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar14 = new b(3, 13, continuation);
                bVar14.f154765w = flowCollector;
                bVar14.f154766x = data;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar15 = new b(3, 14, continuation);
                bVar15.f154765w = flowCollector;
                bVar15.f154766x = data;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar16 = new b(3, 15, continuation);
                bVar16.f154765w = flowCollector;
                bVar16.f154766x = data;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar17 = new b(3, 16, continuation);
                bVar17.f154765w = flowCollector;
                bVar17.f154766x = data;
                return bVar17.invokeSuspend(Unit.f186387a);
            default:
                b bVar18 = new b(3, 17, continuation);
                bVar18.f154765w = flowCollector;
                bVar18.f154766x = data;
                return bVar18.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DeFiAssetDetails deFiAssetDetails;
        DeFiAssetRiskAssessment deFiAssetRiskAssessment;
        WealthMarginStatus wealthMarginStatus;
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus;
        udh.c cVar;
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = this.f154765w;
                Data data = this.f154766x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data;
                    this.v = 1;
                    if (flowCollector.emit(data, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data.getContent() != null);
            case 1:
                FlowCollector flowCollector2 = this.f154765w;
                Data data2 = this.f154766x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                boolean z = true;
                if (i2 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data2;
                    this.v = 1;
                    if (flowCollector2.emit(data2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (data2.getError() == null && data2.getContent() != null && ((deFiAssetDetails = (DeFiAssetDetails) data2.getContent()) == null || (deFiAssetRiskAssessment = deFiAssetDetails.k) == null || !deFiAssetRiskAssessment.f71687c)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                FlowCollector flowCollector3 = this.f154765w;
                Data data3 = this.f154766x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data3;
                    this.v = 1;
                    if (flowCollector3.emit(data3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data3.getLoading());
            case 3:
                FlowCollector flowCollector4 = this.f154765w;
                Data data4 = this.f154766x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                boolean z3 = true;
                if (i5 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data4;
                    this.v = 1;
                    if (flowCollector4.emit(data4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (!data4.getLoading() && (data4.getContent() == null || data4.getError() != null)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 4:
                FlowCollector flowCollector5 = this.f154765w;
                Data data5 = this.f154766x;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data5;
                    this.v = 1;
                    if (flowCollector5.emit(data5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data5.getContent() == null);
            case 5:
                FlowCollector flowCollector6 = this.f154765w;
                Data data6 = this.f154766x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data6;
                    this.v = 1;
                    if (flowCollector6.emit(data6, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Optional optional = (Optional) data6.getContent();
                return Boolean.valueOf(optional != null ? optional.isPresent() : true);
            case 6:
                FlowCollector flowCollector7 = this.f154765w;
                Data data7 = this.f154766x;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data7;
                    this.v = 1;
                    if (flowCollector7.emit(data7, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data7.getContent() == null);
            case 7:
                FlowCollector flowCollector8 = this.f154765w;
                Data data8 = this.f154766x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data8;
                    this.v = 1;
                    if (flowCollector8.emit(data8, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data8.getContent() == null);
            case 8:
                FlowCollector flowCollector9 = this.f154765w;
                Data data9 = this.f154766x;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data9;
                    this.v = 1;
                    if (flowCollector9.emit(data9, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data9.getContent() == null);
            case 9:
                FlowCollector flowCollector10 = this.f154765w;
                Data data10 = this.f154766x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data10;
                    this.v = 1;
                    if (flowCollector10.emit(data10, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data10.getContent() == null);
            case 10:
                FlowCollector flowCollector11 = this.f154765w;
                Data data11 = this.f154766x;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data11;
                    this.v = 1;
                    if (flowCollector11.emit(data11, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data11.getContent() == null);
            case 11:
                FlowCollector flowCollector12 = this.f154765w;
                Data data12 = this.f154766x;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data12;
                    this.v = 1;
                    if (flowCollector12.emit(data12, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data12.getContent() == null);
            case 12:
                FlowCollector flowCollector13 = this.f154765w;
                Data data13 = this.f154766x;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                boolean z4 = true;
                if (i74 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data13;
                    this.v = 1;
                    if (flowCollector13.emit(data13, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (!data13.getLoading()) {
                    TradingOrderExitStrategies tradingOrderExitStrategies = (TradingOrderExitStrategies) data13.getContent();
                    if ((tradingOrderExitStrategies != null ? tradingOrderExitStrategies.d : null) != m0.PENDING) {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
            case 13:
                FlowCollector flowCollector14 = this.f154765w;
                Data data14 = this.f154766x;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                boolean zA = true;
                if (i92 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data14;
                    this.v = 1;
                    if (flowCollector14.emit(data14, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (zi0.c.E(data14)) {
                    od0.i iVar = (od0.i) data14.getContent();
                    zA = (iVar == null || (wealthMarginStatus = (WealthMarginStatus) iVar.f224257a) == null || (wealthMarginBorrowingStatus = wealthMarginStatus.e) == null || (cVar = wealthMarginBorrowingStatus.f95670a) == null) ? false : cVar.a();
                }
                return Boolean.valueOf(zA);
            case 14:
                FlowCollector flowCollector15 = this.f154765w;
                Data data15 = this.f154766x;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                boolean z6 = true;
                if (i96 == 0) {
                    o.b(obj2);
                    f0 f0Var = (f0) data15.getContent();
                    if (f0Var != null && (f0Var.a() || f0Var.c())) {
                        this.f154765w = null;
                        this.f154766x = null;
                        this.v = 1;
                        if (flowCollector15.emit(f0Var, this) == aVar15) {
                            return aVar15;
                        }
                    }
                    return Boolean.valueOf(z6);
                }
                if (i96 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                z6 = false;
                return Boolean.valueOf(z6);
            case 15:
                FlowCollector flowCollector16 = this.f154765w;
                Data data16 = this.f154766x;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                boolean z11 = true;
                if (i99 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data16;
                    this.v = 1;
                    if (flowCollector16.emit(data16, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                WeroRegistrationStatus weroRegistrationStatus = (WeroRegistrationStatus) data16.getContent();
                if ((weroRegistrationStatus instanceof WeroRegistrationStatus.Active) || (weroRegistrationStatus instanceof WeroRegistrationStatus.NotRegistered)) {
                    z11 = false;
                } else if (!(weroRegistrationStatus instanceof WeroRegistrationStatus.Pending) && weroRegistrationStatus != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z11);
            case 16:
                FlowCollector flowCollector17 = this.f154765w;
                Data data17 = this.f154766x;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data17;
                    this.v = 1;
                    if (flowCollector17.emit(data17, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data17.getContent() == null);
            default:
                FlowCollector flowCollector18 = this.f154765w;
                Data data18 = this.f154766x;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    this.f154765w = null;
                    this.f154766x = data18;
                    this.v = 1;
                    if (flowCollector18.emit(data18, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(data18.getContent() == null);
        }
    }
}
