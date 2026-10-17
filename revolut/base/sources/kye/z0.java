package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f190886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k3 f190887x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i, Continuation continuation, k3 k3Var) {
        super(2, continuation);
        this.u = i;
        this.f190887x = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z0 z0Var = new z0(0, continuation, this.f190887x);
                z0Var.f190886w = obj2;
                return z0Var;
            default:
                z0 z0Var2 = new z0(1, continuation, this.f190887x);
                z0Var2.f190886w = obj2;
                return z0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z0) create((SelectedMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k3 k3Var = this.f190887x;
        switch (i) {
            case 0:
                SelectedMethod selectedMethod = (SelectedMethod) this.f190886w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (!(selectedMethod instanceof vye.a)) {
                        return null;
                    }
                    efm.d0<hb3.g> currentTopupLimits = k3Var.C.f213980c.f172588a.getCurrentTopupLimits();
                    jb3.h hVar = jb3.h.f;
                    h35.c cVar = new h35.c(27);
                    currentTopupLimits.getClass();
                    ufm.i iVar = new ufm.i(currentTopupLimits, cVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    qfm.i2 i2VarK = mra.d.K(te0.w.i0(iVar), 2000L, new q97.q2(23));
                    this.f190886w = null;
                    this.v = 1;
                    obj2 = nim.a.b(i2VarK, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (fb3.d) obj2;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.f190886w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d3 d3Var = new d3(k3Var, coroutineScope, null);
                    this.f190886w = null;
                    this.v = 1;
                    if (k3Var.p2(this, d3Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
