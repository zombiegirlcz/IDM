package vy5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f293246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, Continuation continuation) {
        super(2, continuation);
        this.f293246w = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z0 z0Var = new z0(this.f293246w, continuation);
        z0Var.v = obj2;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a1 a1Var = this.f293246w;
        uy5.f fVar = a1Var.f293135b;
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            skm.e0.C(producerScope, null, null, new vmf.k(a1Var, null, 14), 3);
            efm.r rVarB = ((p0) fVar).b();
            io3.l type = io3.l.CURRENT;
            p0 p0Var = (p0) fVar;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            efm.r rVarA = p0Var.f293204l.a(type);
            efm.r rVarA2 = ((p0) fVar).a(type);
            efm.r map = a1Var.e.c().map(new mic.a0(27, w0.f293241a));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            cxe.u uVarE = ((d89.g) a1Var.d).e(z79.b.MAIN);
            kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
            efm.r rVarC = rd0.e.c(uVarE, gVar);
            efm.r rVarK = a1Var.f293136c.k(false);
            efm.r rVarC2 = rd0.e.c(((o95.e) a1Var.f293137g).a(), gVar);
            efm.r map2 = rd0.e.c(a1Var.i.k(), gVar).map(new mic.a0(28, x0.f293242a));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            efm.r rVarDistinctUntilChanged = mif.a.j(rVarB, rVarA, rVarA2, map, rVarC, rVarK, rVarC2, map2).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            vkm.d dVarB = rd0.e.b(pd.b.r(rVarDistinctUntilChanged, new vx9.b(a1Var, 10)));
            y0 y0Var = new y0(producerScope);
            this.v = null;
            this.u = 1;
            if (dVarB.collect(y0Var, this) == aVar) {
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
