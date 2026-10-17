package nf4;

import com.revolut.data.model.Data;
import cv3.u;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kp0.w0;
import skm.k0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f214822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c f214823x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214823x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f214823x, continuation, 0);
                qVar.f214822w = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f214823x, continuation, 1);
                qVar2.f214822w = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        switch (this.u) {
            case 0:
                u uVar = (u) this.f214822w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                try {
                } catch (Throwable th10) {
                    if (th10 instanceof CancellationException) {
                        throw th10;
                    }
                    data = new Data(null, th10, false, 5, null);
                }
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f214822w = uVar;
                    this.v = 1;
                    if (k0.b(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        data = new Data((t) obj2, null, false, 6, null);
                        return data;
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar = this.f214823x;
                l lVar = cVar.f68128p;
                String str = cVar.f68130r.f68120a;
                this.f214822w = null;
                this.v = 2;
                obj2 = lVar.i(str, uVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                data = new Data((t) obj2, null, false, 6, null);
                return data;
            default:
                ax4.b bVar = (ax4.b) this.f214822w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar2 = this.f214823x;
                    cVar2.H2(cVar2.f68132t, new ah4.f(bVar, 10));
                    j2 j2Var = cVar2.f68131s;
                    u uVarL = w0.l(bVar);
                    this.f214822w = null;
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, uVarL);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
