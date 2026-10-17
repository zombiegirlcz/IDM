package ocb;

import aqd.n1;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f224191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224191w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f224191w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f224191w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f224191w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(this.f224191w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(this.f224191w, continuation, 4);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(this.f224191w, continuation, 5);
                sVar6.v = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s(this.f224191w, continuation, 6);
                sVar7.v = obj2;
                return sVar7;
            default:
                s sVar8 = new s(this.f224191w, continuation, 7);
                sVar8.v = obj2;
                return sVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((rcb.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f224191w;
        switch (i) {
            case 0:
                final a0 a0Var = (a0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i2 = 0;
                xVar.x2(new Function1() { // from class: ocb.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        g gVar = (g) obj3;
                        switch (i2) {
                            case 0:
                                return g.a(gVar, null, false, null, false, false, null, a0Var, null, null, false, false, false, null, false, null, 32703);
                            case 1:
                                return g.a(gVar, null, false, null, false, false, null, null, null, a0Var, false, false, false, null, false, null, 32511);
                            case 2:
                                return g.a(gVar, null, false, a0Var, false, false, null, null, null, null, false, false, false, null, false, null, 32763);
                            default:
                                return g.a(gVar, null, false, null, false, false, a0Var, null, null, null, false, false, false, null, false, null, 32735);
                        }
                    }
                });
                break;
            case 1:
                Boolean bool = (Boolean) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new n1(14, bool));
                break;
            case 2:
                final a0 a0Var2 = (a0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i3 = 1;
                xVar.x2(new Function1() { // from class: ocb.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        g gVar = (g) obj3;
                        switch (i3) {
                            case 0:
                                return g.a(gVar, null, false, null, false, false, null, a0Var2, null, null, false, false, false, null, false, null, 32703);
                            case 1:
                                return g.a(gVar, null, false, null, false, false, null, null, null, a0Var2, false, false, false, null, false, null, 32511);
                            case 2:
                                return g.a(gVar, null, false, a0Var2, false, false, null, null, null, null, false, false, false, null, false, null, 32763);
                            default:
                                return g.a(gVar, null, false, null, false, false, a0Var2, null, null, null, false, false, false, null, false, null, 32735);
                        }
                    }
                });
                break;
            case 3:
                rcb.c cVar = (rcb.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new o9h.b(cVar, 13));
                break;
            case 4:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new o9a.y(data, 18));
                break;
            case 5:
                final a0 a0Var3 = (a0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i5 = 2;
                xVar.x2(new Function1() { // from class: ocb.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        g gVar = (g) obj3;
                        switch (i5) {
                            case 0:
                                return g.a(gVar, null, false, null, false, false, null, a0Var3, null, null, false, false, false, null, false, null, 32703);
                            case 1:
                                return g.a(gVar, null, false, null, false, false, null, null, null, a0Var3, false, false, false, null, false, null, 32511);
                            case 2:
                                return g.a(gVar, null, false, a0Var3, false, false, null, null, null, null, false, false, false, null, false, null, 32763);
                            default:
                                return g.a(gVar, null, false, null, false, false, a0Var3, null, null, null, false, false, false, null, false, null, 32735);
                        }
                    }
                });
                break;
            case 6:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new djc.z(15, iVar));
                break;
            default:
                final a0 a0Var4 = (a0) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i6 = 3;
                xVar.x2(new Function1() { // from class: ocb.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        g gVar = (g) obj3;
                        switch (i6) {
                            case 0:
                                return g.a(gVar, null, false, null, false, false, null, a0Var4, null, null, false, false, false, null, false, null, 32703);
                            case 1:
                                return g.a(gVar, null, false, null, false, false, null, null, null, a0Var4, false, false, false, null, false, null, 32511);
                            case 2:
                                return g.a(gVar, null, false, a0Var4, false, false, null, null, null, null, false, false, false, null, false, null, 32763);
                            default:
                                return g.a(gVar, null, false, null, false, false, a0Var4, null, null, null, false, false, false, null, false, null, 32735);
                        }
                    }
                });
                break;
        }
        return Unit.f186387a;
    }
}
