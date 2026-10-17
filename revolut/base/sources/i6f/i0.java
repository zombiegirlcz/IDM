package i6f;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.c f158937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158937w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i0 i0Var = new i0(this.f158937w, continuation, 0);
                i0Var.v = obj2;
                return i0Var;
            case 1:
                i0 i0Var2 = new i0(this.f158937w, continuation, 1);
                i0Var2.v = obj2;
                return i0Var2;
            case 2:
                i0 i0Var3 = new i0(this.f158937w, continuation, 2);
                i0Var3.v = obj2;
                return i0Var3;
            case 3:
                i0 i0Var4 = new i0(this.f158937w, continuation, 3);
                i0Var4.v = obj2;
                return i0Var4;
            case 4:
                i0 i0Var5 = new i0(this.f158937w, continuation, 4);
                i0Var5.v = obj2;
                return i0Var5;
            case 5:
                i0 i0Var6 = new i0(this.f158937w, continuation, 5);
                i0Var6.v = obj2;
                return i0Var6;
            case 6:
                i0 i0Var7 = new i0(this.f158937w, continuation, 6);
                i0Var7.v = obj2;
                return i0Var7;
            case 7:
                i0 i0Var8 = new i0(this.f158937w, continuation, 7);
                i0Var8.v = obj2;
                return i0Var8;
            case 8:
                i0 i0Var9 = new i0(this.f158937w, continuation, 8);
                i0Var9.v = obj2;
                return i0Var9;
            case 9:
                i0 i0Var10 = new i0(this.f158937w, continuation, 9);
                i0Var10.v = obj2;
                return i0Var10;
            case 10:
                i0 i0Var11 = new i0(this.f158937w, continuation, 10);
                i0Var11.v = obj2;
                return i0Var11;
            case 11:
                i0 i0Var12 = new i0(this.f158937w, continuation, 11);
                i0Var12.v = obj2;
                return i0Var12;
            case 12:
                i0 i0Var13 = new i0(this.f158937w, continuation, 12);
                i0Var13.v = obj2;
                return i0Var13;
            case 13:
                i0 i0Var14 = new i0(this.f158937w, continuation, 13);
                i0Var14.v = obj2;
                return i0Var14;
            case 14:
                i0 i0Var15 = new i0(this.f158937w, continuation, 14);
                i0Var15.v = obj2;
                return i0Var15;
            default:
                i0 i0Var16 = new i0(this.f158937w, continuation, 15);
                i0Var16.v = obj2;
                return i0Var16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i0) create((g7f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i0) create((b7f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i0) create((e7f.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i0) create((i7f.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i0) create((a7f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i0) create((d1h.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i0) create((t6f.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i0) create((r6f.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i0) create((o6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i0) create((j6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i0) create((v6f.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = this.f158937w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new h0(data, 0));
                break;
            case 1:
                g7f.c cVar2 = (g7f.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new i30.a(cVar2, 19));
                break;
            case 2:
                b7f.c cVar3 = (b7f.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new j0(cVar3, 0));
                break;
            case 3:
                e7f.e eVar = (e7f.e) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new i30.a(eVar, 20));
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new h0(data2, 2));
                break;
            case 5:
                i7f.b bVar = (i7f.b) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new i30.a(bVar, 21));
                break;
            case 6:
                a7f.c cVar4 = (a7f.c) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new i30.a(cVar4, 22));
                break;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new h0(data3, 1));
                break;
            case 8:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new b8f.z(gVar, 7));
                break;
            case 9:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new h0(data4, 3));
                break;
            case 10:
                t6f.h hVar = (t6f.h) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new l0(hVar, 0));
                break;
            case 11:
                r6f.e eVar2 = (r6f.e) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new m0(eVar2, 0));
                break;
            case 12:
                o6f.a aVar13 = (o6f.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new n0(aVar13, cVar));
                break;
            case 13:
                j6f.a aVar15 = (j6f.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new o0(aVar15, 0));
                break;
            case 14:
                v6f.e eVar3 = (v6f.e) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new i30.a(eVar3, 23));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new h0(data5, 4));
                break;
        }
        return Unit.f186387a;
    }
}
