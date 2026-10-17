package ks;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rsl.p;
import svi.w;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oki.h f189052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Continuation continuation, oki.h hVar, boolean z) {
        super(1, continuation);
        this.u = i;
        this.f189052w = hVar;
        this.v = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(0, continuation, (com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) this.f189052w, this.v);
            case 1:
                return new g(1, continuation, (l0f.g) this.f189052w, this.v);
            default:
                return new g(this.v, (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) this.f189052w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        boolean z = this.v;
        oki.h hVar = this.f189052w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) hVar).N2(z);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l0f.g) hVar).C2(new l0f.d(z));
                break;
            default:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) hVar;
                y yVar = aVar3.f99146q;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar3.H2(yVar, new p(d0.V0(((w) zi0.c.I(((ryi.c) ((j2) yVar.f22677a).getValue()).f258376a)).f266012a, z ? ((ryi.c) ((j2) yVar.f22677a).getValue()).f258377b.size() + 1 : ((ryi.c) ((j2) yVar.f22677a).getValue()).f258377b.size() - 1), aVar3, 15));
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z, com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.v = z;
        this.f189052w = aVar;
    }
}
