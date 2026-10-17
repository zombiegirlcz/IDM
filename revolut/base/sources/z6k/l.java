package z6k;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import tof.i1;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f319796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(3, 0, continuation);
                lVar.f319796w = flowCollector;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l(3, 1, continuation);
                lVar2.f319796w = flowCollector;
                return lVar2.invokeSuspend(Unit.f186387a);
            case 2:
                l lVar3 = new l(3, 2, continuation);
                lVar3.f319796w = flowCollector;
                return lVar3.invokeSuspend(Unit.f186387a);
            case 3:
                l lVar4 = new l(3, 3, continuation);
                lVar4.f319796w = flowCollector;
                return lVar4.invokeSuspend(Unit.f186387a);
            case 4:
                l lVar5 = new l(3, 4, continuation);
                lVar5.f319796w = flowCollector;
                return lVar5.invokeSuspend(Unit.f186387a);
            case 5:
                l lVar6 = new l(3, 5, continuation);
                lVar6.f319796w = flowCollector;
                return lVar6.invokeSuspend(Unit.f186387a);
            case 6:
                l lVar7 = new l(3, 6, continuation);
                lVar7.f319796w = flowCollector;
                return lVar7.invokeSuspend(Unit.f186387a);
            case 7:
                l lVar8 = new l(3, 7, continuation);
                lVar8.f319796w = flowCollector;
                return lVar8.invokeSuspend(Unit.f186387a);
            case 8:
                l lVar9 = new l(3, 8, continuation);
                lVar9.f319796w = flowCollector;
                return lVar9.invokeSuspend(Unit.f186387a);
            case 9:
                l lVar10 = new l(3, 9, continuation);
                lVar10.f319796w = flowCollector;
                return lVar10.invokeSuspend(Unit.f186387a);
            case 10:
                l lVar11 = new l(3, 10, continuation);
                lVar11.f319796w = flowCollector;
                return lVar11.invokeSuspend(Unit.f186387a);
            default:
                l lVar12 = new l(3, 11, continuation);
                lVar12.f319796w = flowCollector;
                return lVar12.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = this.f319796w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    w0a.e.Companion.getClass();
                    w0a.e eVarA = w0a.d.a();
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector.emit(eVarA, this) == aVar) {
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
                FlowCollector flowCollector2 = this.f319796w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool = Boolean.FALSE;
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector2.emit(bool, this) == aVar2) {
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
                FlowCollector flowCollector3 = this.f319796w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool2 = Boolean.FALSE;
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector3.emit(bool2, this) == aVar3) {
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
                FlowCollector flowCollector4 = this.f319796w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool3 = Boolean.FALSE;
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector4.emit(bool3, this) == aVar4) {
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
                FlowCollector flowCollector5 = this.f319796w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Data data = new Data(Boolean.FALSE, null, false, 6, null);
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector5.emit(data, this) == aVar5) {
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
                FlowCollector flowCollector6 = this.f319796w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    List listC = zhm.u.c(i1.f272794a);
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector6.emit(listC, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                FlowCollector flowCollector7 = this.f319796w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector7.emit(od0.i.f224256b, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                FlowCollector flowCollector8 = this.f319796w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector8.emit(od0.i.f224256b, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector9 = this.f319796w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector9.emit(od0.i.f224256b, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                FlowCollector flowCollector10 = this.f319796w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector10.emit(jnd.c.f176709a, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                FlowCollector flowCollector11 = this.f319796w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector11.emit(od0.i.f224256b, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector12 = this.f319796w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    yld.c cVar = yld.c.LINE_CHART;
                    this.f319796w = null;
                    this.v = 1;
                    if (flowCollector12.emit(cVar, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
