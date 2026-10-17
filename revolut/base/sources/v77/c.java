package v77;

import com.revolut.data.model.Data;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f286565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Throwable f286566x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i) {
        super(3, null);
        this.u = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Throwable th10 = (Throwable) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(3, 0, continuation);
                cVar.f286565w = flowCollector;
                cVar.f286566x = th10;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c(3, 1, continuation);
                cVar2.f286565w = flowCollector;
                cVar2.f286566x = th10;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c(3, 2, continuation);
                cVar3.f286565w = flowCollector;
                cVar3.f286566x = th10;
                return cVar3.invokeSuspend(Unit.f186387a);
            case 3:
                c cVar4 = new c(3, 3, continuation);
                cVar4.f286565w = flowCollector;
                cVar4.f286566x = th10;
                return cVar4.invokeSuspend(Unit.f186387a);
            case 4:
                c cVar5 = new c(3, 4, continuation);
                cVar5.f286565w = flowCollector;
                cVar5.f286566x = th10;
                return cVar5.invokeSuspend(Unit.f186387a);
            case 5:
                c cVar6 = new c(3, 5, continuation);
                cVar6.f286565w = flowCollector;
                cVar6.f286566x = th10;
                return cVar6.invokeSuspend(Unit.f186387a);
            case 6:
                c cVar7 = new c(3, 6, continuation);
                cVar7.f286565w = flowCollector;
                cVar7.f286566x = th10;
                return cVar7.invokeSuspend(Unit.f186387a);
            case 7:
                c cVar8 = new c(3, 7, continuation);
                cVar8.f286565w = flowCollector;
                cVar8.f286566x = th10;
                return cVar8.invokeSuspend(Unit.f186387a);
            case 8:
                c cVar9 = new c(3, 8, continuation);
                cVar9.f286565w = flowCollector;
                cVar9.f286566x = th10;
                return cVar9.invokeSuspend(Unit.f186387a);
            case 9:
                c cVar10 = new c(3, 9, continuation);
                cVar10.f286565w = flowCollector;
                cVar10.f286566x = th10;
                return cVar10.invokeSuspend(Unit.f186387a);
            case 10:
                c cVar11 = new c(3, 10, continuation);
                cVar11.f286565w = flowCollector;
                cVar11.f286566x = th10;
                return cVar11.invokeSuspend(Unit.f186387a);
            case 11:
                c cVar12 = new c(3, 11, continuation);
                cVar12.f286565w = flowCollector;
                cVar12.f286566x = th10;
                return cVar12.invokeSuspend(Unit.f186387a);
            case 12:
                c cVar13 = new c(3, 12, continuation);
                cVar13.f286565w = flowCollector;
                cVar13.f286566x = th10;
                return cVar13.invokeSuspend(Unit.f186387a);
            case 13:
                c cVar14 = new c(3, 13, continuation);
                cVar14.f286565w = flowCollector;
                cVar14.f286566x = th10;
                return cVar14.invokeSuspend(Unit.f186387a);
            case 14:
                c cVar15 = new c(3, 14, continuation);
                cVar15.f286565w = flowCollector;
                cVar15.f286566x = th10;
                return cVar15.invokeSuspend(Unit.f186387a);
            default:
                c cVar16 = new c(3, 15, continuation);
                cVar16.f286565w = flowCollector;
                cVar16.f286566x = th10;
                return cVar16.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = this.f286565w;
                Throwable th10 = this.f286566x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    Data data = new Data(null, th10, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
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
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector2 = this.f286565w;
                Throwable th11 = this.f286566x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    Data data2 = new Data(null, th11, false, 1, null);
                    this.f286565w = null;
                    this.f286566x = null;
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
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector3 = this.f286565w;
                Throwable th12 = this.f286566x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    if (th12 instanceof WidgetNotAvailableException) {
                        this.f286565w = null;
                        this.f286566x = null;
                        this.v = 1;
                        if (flowCollector3.emit(null, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                FlowCollector flowCollector4 = this.f286565w;
                Throwable th13 = this.f286566x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    Data dataO = zi0.c.O(th13);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector4.emit(dataO, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                FlowCollector flowCollector5 = this.f286565w;
                Throwable th14 = this.f286566x;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    if (th14 instanceof CancellationException) {
                        throw th14;
                    }
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector5.emit(null, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                FlowCollector flowCollector6 = this.f286565w;
                Throwable th15 = this.f286566x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    Data data3 = new Data(null, th15, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector6.emit(data3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                FlowCollector flowCollector7 = this.f286565w;
                Throwable th16 = this.f286566x;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    Data data4 = new Data(null, th16, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector7.emit(data4, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                FlowCollector flowCollector8 = this.f286565w;
                Throwable th17 = this.f286566x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    Data data5 = new Data(null, th17, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector8.emit(data5, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector9 = this.f286565w;
                Throwable th18 = this.f286566x;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    Data data6 = new Data(null, th18, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector9.emit(data6, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                FlowCollector flowCollector10 = this.f286565w;
                Throwable th19 = this.f286566x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th19, h0Var);
                    Data dataP = zi0.c.P(f0.f322471a, false, null, 3);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector10.emit(dataP, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                FlowCollector flowCollector11 = this.f286565w;
                Throwable th20 = this.f286566x;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    Data data7 = new Data(null, th20, false, 1, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector11.emit(data7, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                FlowCollector flowCollector12 = this.f286565w;
                Throwable th21 = this.f286566x;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    Data data8 = new Data(null, th21, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector12.emit(data8, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                FlowCollector flowCollector13 = this.f286565w;
                Throwable th22 = this.f286566x;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    Data data9 = new Data(null, th22, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector13.emit(data9, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                FlowCollector flowCollector14 = this.f286565w;
                Throwable th23 = this.f286566x;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    if (th23 instanceof CancellationException) {
                        throw th23;
                    }
                    Data data10 = new Data(null, th23, false, 1, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector14.emit(data10, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                FlowCollector flowCollector15 = this.f286565w;
                Throwable th24 = this.f286566x;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    Data data11 = new Data(null, th24, false, 5, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector15.emit(data11, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector16 = this.f286565w;
                Throwable th25 = this.f286566x;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    Data data12 = new Data(null, th25, false, 1, null);
                    this.f286565w = null;
                    this.f286566x = null;
                    this.v = 1;
                    if (flowCollector16.emit(data12, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
