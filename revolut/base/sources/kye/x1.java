package kye;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190872w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x1 x1Var = new x1(this.f190872w, continuation);
        x1Var.v = obj2;
        return x1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x1) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k3 k3Var = this.f190872w;
        cli.y yVar = k3Var.f190763d0;
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                k3Var.H2(yVar, new m0(9));
                vte.b bVar = k3Var.K;
                n nVar = k3Var.f190767s;
                yte.n nVarK = pw5.a.K(nVar.f190796b, nVar.f190795a);
                this.v = null;
                this.u = 1;
                eve.b bVar2 = ((xve.d) bVar).f309244b;
                bVar2.getClass();
                etj.l lVar = new etj.l(bVar2, str, nVarK, null, 1);
                skm.p0 p0Var = skm.p0.f264001a;
                obj2 = skm.e0.J(elm.f.f127540b, lVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            k3Var.H2(yVar, new k37.t((List) obj2, 18));
        } catch (Exception e) {
            k3Var.H2(yVar, new m0(10));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            k3Var.l1().M0(new aii.i(e, (aii.a) null, 6));
        }
        return Unit.f186387a;
    }
}
