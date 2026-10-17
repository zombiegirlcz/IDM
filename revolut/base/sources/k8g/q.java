package k8g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nyb.m0;
import skm.e0;
import skm.p0;
import tnb.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a f182150w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f182150w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(0, this.f182150w, continuation);
            default:
                return new q(1, this.f182150w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar = this.f182150w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m0 m0Var = aVar.f93609s;
                this.v = 1;
                Object objE = m0Var.e(this);
                return objE == aVar2 ? aVar2 : objE;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    g0 g0Var = aVar.f93607q;
                    u2f.j jVar = com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a.f93605y;
                    this.v = 1;
                    jv.o oVar = new jv.o((k1f.k) g0Var.f272384b, jVar, null, 11);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, oVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
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
