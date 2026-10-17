package hzb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.earn.b f157139w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.rev_points.impl.ui.earn.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f157139w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f157139w, continuation);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(1, this.f157139w, continuation);
                yVar2.v = obj2;
                return yVar2;
            case 2:
                y yVar3 = new y(2, this.f157139w, continuation);
                yVar3.v = obj2;
                return yVar3;
            case 3:
                y yVar4 = new y(3, this.f157139w, continuation);
                yVar4.v = obj2;
                return yVar4;
            case 4:
                y yVar5 = new y(4, this.f157139w, continuation);
                yVar5.v = obj2;
                return yVar5;
            case 5:
                y yVar6 = new y(5, this.f157139w, continuation);
                yVar6.v = obj2;
                return yVar6;
            case 6:
                y yVar7 = new y(6, this.f157139w, continuation);
                yVar7.v = obj2;
                return yVar7;
            case 7:
                y yVar8 = new y(7, this.f157139w, continuation);
                yVar8.v = obj2;
                return yVar8;
            case 8:
                y yVar9 = new y(8, this.f157139w, continuation);
                yVar9.v = obj2;
                return yVar9;
            case 9:
                y yVar10 = new y(9, this.f157139w, continuation);
                yVar10.v = obj2;
                return yVar10;
            case 10:
                y yVar11 = new y(10, this.f157139w, continuation);
                yVar11.v = obj2;
                return yVar11;
            case 11:
                y yVar12 = new y(11, this.f157139w, continuation);
                yVar12.v = obj2;
                return yVar12;
            case 12:
                y yVar13 = new y(12, this.f157139w, continuation);
                yVar13.v = obj2;
                return yVar13;
            case 13:
                y yVar14 = new y(13, this.f157139w, continuation);
                yVar14.v = obj2;
                return yVar14;
            case 14:
                y yVar15 = new y(14, this.f157139w, continuation);
                yVar15.v = obj2;
                return yVar15;
            case 15:
                y yVar16 = new y(15, this.f157139w, continuation);
                yVar16.v = obj2;
                return yVar16;
            default:
                y yVar17 = new y(16, this.f157139w, continuation);
                yVar17.v = obj2;
                return yVar17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.impl.ui.earn.b bVar = this.f157139w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data, 20));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data2, 21));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data3, 22));
                break;
            case 3:
                vf0.a0 a0Var = (vf0.a0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final Boolean bool = (Boolean) a0Var.f288394a;
                final Boolean bool2 = (Boolean) a0Var.f288395b;
                final boolean zBooleanValue = ((Boolean) a0Var.f288396c).booleanValue();
                final Boolean bool3 = (Boolean) a0Var.d;
                final Data data4 = (Data) a0Var.e;
                final Data data5 = (Data) a0Var.f;
                final Data data6 = (Data) a0Var.f288397g;
                final Data data7 = (Data) a0Var.f288398h;
                final Data data8 = (Data) a0Var.i;
                final Data data9 = (Data) a0Var.f288399j;
                final Data data10 = (Data) a0Var.k;
                bVar.H2(bVar.S, new Function1() { // from class: hzb.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        t tVar = (t) obj3;
                        Boolean bool4 = bool;
                        Intrinsics.h(bool4);
                        boolean zBooleanValue2 = bool4.booleanValue();
                        boolean z = bool2.booleanValue() && zBooleanValue;
                        Boolean bool5 = bool3;
                        Intrinsics.h(bool5);
                        boolean zBooleanValue3 = bool5.booleanValue();
                        Object content = data4.getContent();
                        Boolean bool6 = Boolean.TRUE;
                        return t.a(tVar, null, null, null, null, null, null, null, null, zi0.c.P(new s(zBooleanValue2, z, zBooleanValue3, Intrinsics.f(content, bool6), Intrinsics.f(data5.getContent(), bool6), Intrinsics.f(data10.getContent(), bool6), Intrinsics.f(data6.getContent(), bool6), Intrinsics.f(data7.getContent(), bool6), Intrinsics.f(data8.getContent(), bool6), Intrinsics.f(data9.getContent(), bool6)), false, null, 3), null, null, null, null, null, null, null, 130815);
                    }
                });
                break;
            case 4:
                Data data11 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data11, 23));
                break;
            case 5:
                Data data12 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data12, 24));
                break;
            case 6:
                hha.d dVar = (hha.d) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 7:
                Data data13 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data13, 25));
                break;
            case 8:
                Data data14 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data14, 26));
                break;
            case 9:
                Data data15 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data15, 27));
                break;
            case 10:
                Data data16 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data16, 28));
                break;
            case 11:
                Data data17 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new hui.c0(data17, 29));
                break;
            case 12:
                Data data18 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new e0(data18, 0));
                break;
            case 13:
                Data data19 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new e0(data19, 1));
                break;
            case 14:
                Data data20 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new e0(data20, 2));
                break;
            case 15:
                Data data21 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new e0(data21, 3));
                break;
            default:
                Data data22 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.S, new e0(data22, 4));
                break;
        }
        return Unit.f186387a;
    }
}
