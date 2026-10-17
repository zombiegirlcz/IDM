package f68;

import cu8.r0;
import f5g.l;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ks8.m;
import nj8.n;
import vkm.q;
import w4l.j;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.c f132409w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f132409w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f132409w, continuation, 0);
            default:
                return new c(this.f132409w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objX = q.x(mo3.a.h(((n) this.f132409w.f76662q).k(null, j.f294644c), new et6.a(15), new l(1), 2), this);
                return objX == aVar ? aVar : objX;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r0 r0Var = this.f132409w.f76663r;
                this.v = 1;
                Object objB = m.b(r0Var, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
