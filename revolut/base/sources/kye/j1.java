package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.m;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190752w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j1 j1Var = new j1(this.f190752w, continuation);
        j1Var.v = obj2;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j1) create((SelectedMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        SelectedMethod selectedMethod = (SelectedMethod) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object[] objArr = 0;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                if (!(selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.a)) {
                    return null;
                }
                k3 k3Var = this.f190752w;
                m.Companion companion = yhm.m.INSTANCE;
                vte.b bVar = k3Var.K;
                String str = ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.a) selectedMethod).f90909a;
                this.v = null;
                this.u = 1;
                eve.b bVar2 = ((xve.d) bVar).f309244b;
                bVar2.getClass();
                esa.i iVar = new esa.i(bVar2, str, objArr == true ? 1 : 0, 6);
                skm.p0 p0Var = skm.p0.f264001a;
                obj2 = skm.e0.J(elm.f.f127540b, iVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            objA = (List) obj2;
            m.Companion companion2 = yhm.m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        return (List) (objA instanceof yhm.n ? null : objA);
    }
}
