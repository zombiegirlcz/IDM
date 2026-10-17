package pf4;

import com.revolut.data.model.Data;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kp0.w0;
import skm.k0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b f235431x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235431x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f235431x, continuation, 0);
                a0Var.f235430w = obj2;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f235431x, continuation, 1);
                a0Var2.f235430w = obj2;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((cv3.u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        switch (this.u) {
            case 0:
                cv3.u uVar = (cv3.u) this.f235430w;
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
                    this.f235430w = uVar;
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
                        data = new Data((cv3.s) obj2, null, false, 6, null);
                        return data;
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar = this.f235431x;
                v vVar = bVar.f68140p;
                String str = bVar.f68141q.f68135c;
                this.f235430w = null;
                this.v = 2;
                obj2 = vVar.g(str, uVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                data = new Data((cv3.s) obj2, null, false, 6, null);
                return data;
            default:
                ax4.b bVar2 = (ax4.b) this.f235430w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar3 = this.f235431x;
                    bVar3.H2(bVar3.f68143s, new ah4.f(bVar2, 12));
                    j2 j2Var = bVar3.f68142r;
                    cv3.u uVarL = w0.l(bVar2);
                    this.f235430w = null;
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
