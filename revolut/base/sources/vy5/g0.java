package vy5;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f293154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f293155x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ProductAccountId productAccountId, i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.f293154w = productAccountId;
        this.f293155x = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.f293154w, this.f293155x, continuation);
        g0Var.v = obj2;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vkm.d dVarB;
        i0 i0Var = this.f293155x;
        uy5.f fVar = i0Var.f293163b;
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            skm.e0.C(producerScope, null, null, new vmf.k(i0Var, null, 12), 3);
            ProductAccountId productAccountId = this.f293154w;
            String str = productAccountId.f89729a;
            v0.Companion.getClass();
            if (Intrinsics.f(str, v0.f293220q)) {
                p0 p0Var = (p0) fVar;
                efm.r rVarG = m70.a.g(nim.a.w(kli.a.h(p0Var.a(io3.l.CURRENT), p0Var.b()), new vw4.j(17)), null, new vv7.l(14), 1);
                od0.i.Companion.getClass();
                efm.r rVarSwitchMap = ue0.e.E(rVarG, od0.i.f224256b).switchMap(new vx9.w(new vx9.b(i0Var, 9), 10));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                dVarB = rd0.e.b(rVarSwitchMap);
            } else {
                p0 p0Var2 = (p0) fVar;
                dVarB = rd0.e.b(pd.b.r(kli.a.i(p0Var2.a(io3.l.CURRENT), p0Var2.b(), rd0.e.c(((d89.g) i0Var.e).e(z79.b.MAIN), kotlin.coroutines.g.f186406a)), new vrl.n(productAccountId, i0Var, 20)));
            }
            f0 f0Var = new f0(producerScope);
            this.v = null;
            this.u = 1;
            if (dVarB.collect(f0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
