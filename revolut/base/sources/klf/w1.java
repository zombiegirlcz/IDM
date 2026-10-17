package klf;

import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class w1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f185596w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1() {
        super(2, null);
        this.u = 2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w1 w1Var = new w1(2, 0, continuation);
                w1Var.f185596w = obj2;
                return w1Var;
            case 1:
                w1 w1Var2 = new w1(2, 1, continuation);
                w1Var2.f185596w = obj2;
                return w1Var2;
            case 2:
                w1 w1Var3 = new w1(2, 2, continuation);
                w1Var3.f185596w = obj2;
                return w1Var3;
            case 3:
                w1 w1Var4 = new w1(2, 3, continuation);
                w1Var4.f185596w = obj2;
                return w1Var4;
            case 4:
                w1 w1Var5 = new w1(2, 4, continuation);
                w1Var5.f185596w = obj2;
                return w1Var5;
            case 5:
                w1 w1Var6 = new w1(2, 5, continuation);
                w1Var6.f185596w = obj2;
                return w1Var6;
            case 6:
                w1 w1Var7 = new w1(2, 6, continuation);
                w1Var7.f185596w = obj2;
                return w1Var7;
            case 7:
                w1 w1Var8 = new w1(2, 7, continuation);
                w1Var8.f185596w = obj2;
                return w1Var8;
            case 8:
                w1 w1Var9 = new w1(2, 8, continuation);
                w1Var9.f185596w = obj2;
                return w1Var9;
            case 9:
                w1 w1Var10 = new w1(2, 9, continuation);
                w1Var10.f185596w = obj2;
                return w1Var10;
            case 10:
                w1 w1Var11 = new w1(2, 10, continuation);
                w1Var11.f185596w = obj2;
                return w1Var11;
            case 11:
                w1 w1Var12 = new w1(2, 11, continuation);
                w1Var12.f185596w = obj2;
                return w1Var12;
            case 12:
                w1 w1Var13 = new w1(2, 12, continuation);
                w1Var13.f185596w = obj2;
                return w1Var13;
            case 13:
                w1 w1Var14 = new w1(2, 13, continuation);
                w1Var14.f185596w = obj2;
                return w1Var14;
            case 14:
                w1 w1Var15 = new w1(2, 14, continuation);
                w1Var15.f185596w = obj2;
                return w1Var15;
            case 15:
                w1 w1Var16 = new w1(2, 15, continuation);
                w1Var16.f185596w = obj2;
                return w1Var16;
            case 16:
                w1 w1Var17 = new w1(2, 16, continuation);
                w1Var17.f185596w = obj2;
                return w1Var17;
            case 17:
                w1 w1Var18 = new w1(2, 17, continuation);
                w1Var18.f185596w = obj2;
                return w1Var18;
            case 18:
                w1 w1Var19 = new w1(2, 18, continuation);
                w1Var19.f185596w = obj2;
                return w1Var19;
            case 19:
                w1 w1Var20 = new w1(2, 19, continuation);
                w1Var20.f185596w = obj2;
                return w1Var20;
            case 20:
                w1 w1Var21 = new w1(2, 20, continuation);
                w1Var21.f185596w = obj2;
                return w1Var21;
            case 21:
                w1 w1Var22 = new w1(2, 21, continuation);
                w1Var22.f185596w = obj2;
                return w1Var22;
            case 22:
                w1 w1Var23 = new w1(2, 22, continuation);
                w1Var23.f185596w = obj2;
                return w1Var23;
            case 23:
                w1 w1Var24 = new w1(2, 23, continuation);
                w1Var24.f185596w = obj2;
                return w1Var24;
            case 24:
                w1 w1Var25 = new w1(2, 24, continuation);
                w1Var25.f185596w = obj2;
                return w1Var25;
            case 25:
                w1 w1Var26 = new w1(2, 25, continuation);
                w1Var26.f185596w = obj2;
                return w1Var26;
            case 26:
                w1 w1Var27 = new w1(2, 26, continuation);
                w1Var27.f185596w = obj2;
                return w1Var27;
            case 27:
                w1 w1Var28 = new w1(2, 27, continuation);
                w1Var28.f185596w = obj2;
                return w1Var28;
            case 28:
                w1 w1Var29 = new w1(2, 28, continuation);
                w1Var29.f185596w = obj2;
                return w1Var29;
            default:
                w1 w1Var30 = new w1(2, 29, continuation);
                w1Var30.f185596w = obj2;
                return w1Var30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w1) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f185596w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f185596w = null;
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
                FlowCollector flowCollector2 = (FlowCollector) this.f185596w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector2.emit(null, this) == aVar2) {
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
                FlowCollector flowCollector3 = (FlowCollector) this.f185596w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Map mapG = zhm.r0.g();
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector3.emit(mapG, this) == aVar3) {
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
                FlowCollector flowCollector4 = (FlowCollector) this.f185596w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.f185596w = null;
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
                FlowCollector flowCollector5 = (FlowCollector) this.f185596w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Data data = new Data(null, null, true, 3, null);
                    this.f185596w = null;
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
                FlowCollector flowCollector6 = (FlowCollector) this.f185596w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector6.emit(lc0.u.f193773a, this) == aVar6) {
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
                FlowCollector flowCollector7 = (FlowCollector) this.f185596w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    Data data2 = new Data(zhm.f0.f322471a, null, false, 6, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector7.emit(data2, this) == aVar7) {
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
                FlowCollector flowCollector8 = (FlowCollector) this.f185596w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    Data data3 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector8.emit(data3, this) == aVar8) {
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
                FlowCollector flowCollector9 = (FlowCollector) this.f185596w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    Data data4 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector9.emit(data4, this) == aVar9) {
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
                FlowCollector flowCollector10 = (FlowCollector) this.f185596w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(zhm.f0.f322471a, false, null, 3);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector10.emit(dataP, this) == aVar10) {
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
                FlowCollector flowCollector11 = (FlowCollector) this.f185596w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    Data data5 = new Data(od0.i.f224256b, null, false, 6, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector11.emit(data5, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                FlowCollector flowCollector12 = (FlowCollector) this.f185596w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    Unit unit = Unit.f186387a;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector12.emit(unit, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                FlowCollector flowCollector13 = (FlowCollector) this.f185596w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    Data data6 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector13.emit(data6, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                FlowCollector flowCollector14 = (FlowCollector) this.f185596w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    Data data7 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector14.emit(data7, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                FlowCollector flowCollector15 = (FlowCollector) this.f185596w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    Data data8 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector15.emit(data8, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                FlowCollector flowCollector16 = (FlowCollector) this.f185596w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    zhm.f0 f0Var = zhm.f0.f322471a;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector16.emit(f0Var, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                FlowCollector flowCollector17 = (FlowCollector) this.f185596w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    Data data9 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector17.emit(data9, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                FlowCollector flowCollector18 = (FlowCollector) this.f185596w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    Data data10 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector18.emit(data10, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                FlowCollector flowCollector19 = (FlowCollector) this.f185596w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    Data data11 = new Data(zhm.f0.f322471a, null, true, 2, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector19.emit(data11, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                FlowCollector flowCollector20 = (FlowCollector) this.f185596w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    Data data12 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector20.emit(data12, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                FlowCollector flowCollector21 = (FlowCollector) this.f185596w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    Unit unit2 = Unit.f186387a;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector21.emit(unit2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                FlowCollector flowCollector22 = (FlowCollector) this.f185596w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    zhm.f0 f0Var2 = zhm.f0.f322471a;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector22.emit(f0Var2, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                FlowCollector flowCollector23 = (FlowCollector) this.f185596w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    Data data13 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector23.emit(data13, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                FlowCollector flowCollector24 = (FlowCollector) this.f185596w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    Data data14 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector24.emit(data14, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                FlowCollector flowCollector25 = (FlowCollector) this.f185596w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    Data data15 = new Data(od0.i.f224256b, null, false, 6, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector25.emit(data15, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                FlowCollector flowCollector26 = (FlowCollector) this.f185596w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    Unit unit3 = Unit.f186387a;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector26.emit(unit3, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                FlowCollector flowCollector27 = (FlowCollector) this.f185596w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    Data data16 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector27.emit(data16, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                FlowCollector flowCollector28 = (FlowCollector) this.f185596w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    PixQrCodeDecodeResult pixQrCodeDecodeResult = ube.d.f;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector28.emit(pixQrCodeDecodeResult, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                FlowCollector flowCollector29 = (FlowCollector) this.f185596w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    Data data17 = new Data(null, null, true, 3, null);
                    this.f185596w = null;
                    this.v = 1;
                    vkm.q.w(flowCollector29);
                    Object objEmit = flowCollector29.emit(data17, this);
                    if (objEmit != aVar29) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit != aVar29) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector30 = (FlowCollector) this.f185596w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    Unit unit4 = Unit.f186387a;
                    this.f185596w = null;
                    this.v = 1;
                    if (flowCollector30.emit(unit4, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
