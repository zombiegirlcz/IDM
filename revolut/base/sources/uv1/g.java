package uv1;

import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BrebAreaScreen f283276w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(BrebAreaScreen brebAreaScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283276w = brebAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f283276w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f283276w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f283276w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrebAreaScreen brebAreaScreen = this.f283276w;
        switch (i) {
            case 0:
                a aVar = (a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVarE3 = brebAreaScreen.d();
                Intrinsics.h(aVar);
                ((d0) wVarE3).J2(aVar);
                return Unit.f186387a;
            case 1:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVarE32 = brebAreaScreen.d();
                Intrinsics.h(clickData);
                d0 d0Var = (d0) wVarE32;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                h12.k kVarB = ((u12.a) d0Var.f283268p).b(clickData);
                if (Intrinsics.f(kVarB, h12.i.f148450a)) {
                    ((pn3.b) d0Var.v).c(d0Var, new uu9.b(d0Var, 4));
                } else if (Intrinsics.f(kVarB, h12.j.f148451a)) {
                    d0Var.l2(new a0(d0Var, null, 0), new yi5.b(26));
                } else if (kVarB != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                a aVar4 = (a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVarE33 = brebAreaScreen.d();
                Intrinsics.h(aVar4);
                ((d0) wVarE33).J2(aVar4);
                return Unit.f186387a;
        }
    }
}
