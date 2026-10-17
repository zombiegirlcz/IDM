package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190807w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o1 o1Var = new o1(this.f190807w, continuation);
        o1Var.v = obj2;
        return o1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o1) create((d4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k3 k3Var = this.f190807w;
        n60.a aVar = k3Var.f190768t;
        cli.y yVar = k3Var.f190763d0;
        d4 d4Var = (d4) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!(d4Var instanceof a4)) {
                if (d4Var instanceof z3) {
                    SelectedMethod selectedMethod = ((m) ((vkm.j2) yVar.f22677a).getValue()).f190786s;
                    if (selectedMethod != null) {
                        dj0.d dVar = ((m) ((vkm.j2) yVar.f22677a).getValue()).d;
                        if (dVar == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("Amount money was null on cash deposit warning closed");
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            return Unit.f186387a;
                        }
                        k3Var.C2(new a0(selectedMethod, dVar, k3Var.f190767s.f190795a, ((m) ((vkm.j2) yVar.f22677a).getValue()).f190787t));
                    }
                } else {
                    if (!(d4Var instanceof b4) && !Intrinsics.f(d4Var, y3.f190882a) && !Intrinsics.f(d4Var, c4.f190720a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k3Var.H2(yVar, new m0(7));
                    aVar.S(false);
                }
                return Unit.f186387a;
            }
            y51.a aVar2 = k3Var.A;
            this.v = null;
            this.u = 1;
            u21.k kVar = (u21.k) ((e0f.z) aVar2).f121703a;
            kVar.getClass();
            u21.j jVar = new u21.j(kVar, null, 0);
            skm.p0 p0Var = skm.p0.f264001a;
            Object objJ = skm.e0.J(elm.f.f127540b, jVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k3Var.H2(yVar, new m0(6));
        aVar.S(false);
        return Unit.f186387a;
    }
}
