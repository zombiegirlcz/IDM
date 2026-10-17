package g64;

import a41.j1;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import et6.u1;
import h93.j0;
import h93.l0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import skm.b0;
import skm.e0;
import skm.k0;
import vkm.q0;
import vkm.t0;
import vkm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a f140843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140843w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f140843w, continuation, 0);
            case 1:
                return new f(this.f140843w, continuation, 1);
            case 2:
                return new f(this.f140843w, continuation, 2);
            case 3:
                return new f(this.f140843w, continuation, 3);
            default:
                return new f(this.f140843w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar = this.f140843w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    long j2 = com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.D;
                    this.v = 1;
                    if (k0.c(j2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                a2 a2Var = aVar.A;
                if (a2Var != null) {
                    a2Var.A(new CancellationException("Card issue took longer than expected"));
                }
                aVar.A = null;
                return Unit.f186387a;
            case 1:
                CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = aVar.f67204q;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar = aVar.u;
                j0 d = cardOrderingFlowContract$InputData.getD();
                l0 e = cardOrderingFlowContract$InputData.getE();
                zVar.getClass();
                t0 t0Var = new t0(new u1(new q0(new v1(new j1(zVar, d, e, (Continuation) null, 6)), new g06.k(aVar, null, 17), 1), aVar, 26), 1);
                this.v = 1;
                Object objX = vkm.q.x(t0Var, this);
                return objX == aVar3 ? aVar3 : objX;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar = new l(aVar, null);
                this.v = 1;
                d dVar = com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Companion;
                Object objB = pu7.a.B(aVar.k, "Issue physical card", lVar, this);
                return objB == aVar4 ? aVar4 : objB;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    m mVar = new m(aVar, continuation, 0);
                    this.v = 1;
                    if (aVar.p2(this, mVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                d dVar2 = com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Companion;
                Object objJ = e0.J(new b0("Issued virtual card"), new f(aVar, continuation, i2), this);
                return objJ == aVar6 ? aVar6 : objJ;
        }
    }
}
