package wda;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f296488w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(2, 0, continuation);
                lVar.f296488w = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(2, 1, continuation);
                lVar2.f296488w = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(2, 2, continuation);
                lVar3.f296488w = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l(2, 3, continuation);
                lVar4.f296488w = obj2;
                return lVar4;
            case 4:
                l lVar5 = new l(2, 4, continuation);
                lVar5.f296488w = obj2;
                return lVar5;
            case 5:
                l lVar6 = new l(2, 5, continuation);
                lVar6.f296488w = obj2;
                return lVar6;
            case 6:
                l lVar7 = new l(2, 6, continuation);
                lVar7.f296488w = obj2;
                return lVar7;
            case 7:
                l lVar8 = new l(2, 7, continuation);
                lVar8.f296488w = obj2;
                return lVar8;
            case 8:
                l lVar9 = new l(2, 8, continuation);
                lVar9.f296488w = obj2;
                return lVar9;
            case 9:
                l lVar10 = new l(2, 9, continuation);
                lVar10.f296488w = obj2;
                return lVar10;
            case 10:
                l lVar11 = new l(2, 10, continuation);
                lVar11.f296488w = obj2;
                return lVar11;
            case 11:
                l lVar12 = new l(2, 11, continuation);
                lVar12.f296488w = obj2;
                return lVar12;
            case 12:
                l lVar13 = new l(2, 12, continuation);
                lVar13.f296488w = obj2;
                return lVar13;
            case 13:
                l lVar14 = new l(2, 13, continuation);
                lVar14.f296488w = obj2;
                return lVar14;
            case 14:
                l lVar15 = new l(2, 14, continuation);
                lVar15.f296488w = obj2;
                return lVar15;
            case 15:
                l lVar16 = new l(2, 15, continuation);
                lVar16.f296488w = obj2;
                return lVar16;
            case 16:
                l lVar17 = new l(2, 16, continuation);
                lVar17.f296488w = obj2;
                return lVar17;
            case 17:
                l lVar18 = new l(2, 17, continuation);
                lVar18.f296488w = obj2;
                return lVar18;
            default:
                l lVar19 = new l(2, 18, continuation);
                lVar19.f296488w = obj2;
                return lVar19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f296488w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector.emit(null, this) == aVar) {
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
                FlowCollector flowCollector2 = (FlowCollector) this.f296488w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Map mapG = r0.g();
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector2.emit(mapG, this) == aVar2) {
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
                FlowCollector flowCollector3 = (FlowCollector) this.f296488w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector3.emit(w4l.i.f294643c, this) == aVar3) {
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
                FlowCollector flowCollector4 = (FlowCollector) this.f296488w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector4.emit(null, this) == aVar4) {
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
                FlowCollector flowCollector5 = (FlowCollector) this.f296488w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool = Boolean.FALSE;
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector5.emit(bool, this) == aVar5) {
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
                FlowCollector flowCollector6 = (FlowCollector) this.f296488w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool2 = Boolean.FALSE;
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector6.emit(bool2, this) == aVar6) {
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
                FlowCollector flowCollector7 = (FlowCollector) this.f296488w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    wv.a aVar8 = wv.a.IDLE;
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector7.emit(aVar8, this) == aVar7) {
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
                FlowCollector flowCollector8 = (FlowCollector) this.f296488w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool3 = Boolean.FALSE;
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector8.emit(bool3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector9 = (FlowCollector) this.f296488w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    Data data = new Data(null, null, true, 3, null);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector9.emit(data, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                FlowCollector flowCollector10 = (FlowCollector) this.f296488w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(f0.f322471a, false, null, 3);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector10.emit(dataP, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                FlowCollector flowCollector11 = (FlowCollector) this.f296488w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    Data data2 = new Data(null, null, true, 3, null);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector11.emit(data2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                Function1 function1 = (Function1) this.f296488w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.f296488w = null;
                    this.v = 1;
                    if (function1.invoke(this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                FlowCollector flowCollector12 = (FlowCollector) this.f296488w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector12.emit(null, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                FlowCollector flowCollector13 = (FlowCollector) this.f296488w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    Data data3 = new Data(null, null, true, 3, null);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector13.emit(data3, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                FlowCollector flowCollector14 = (FlowCollector) this.f296488w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    f0 f0Var = f0.f322471a;
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector14.emit(f0Var, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                FlowCollector flowCollector15 = (FlowCollector) this.f296488w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    qf1.t tVar = new qf1.t(qf1.f.LINKED_ACCOUNT.getId());
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector15.emit(tVar, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                FlowCollector flowCollector16 = (FlowCollector) this.f296488w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    Data data4 = new Data(null, null, true, 3, null);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector16.emit(data4, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                FlowCollector flowCollector17 = (FlowCollector) this.f296488w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector17.emit(null, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector18 = (FlowCollector) this.f296488w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    Data data5 = new Data(null, null, true, 3, null);
                    this.f296488w = null;
                    this.v = 1;
                    if (flowCollector18.emit(data5, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
