package g37;

import au6.d3;
import au6.j3;
import au6.k3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e f140236w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f140236w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(0, this.f140236w, continuation);
            default:
                return new y(1, this.f140236w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar = this.f140236w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    a61.a aVar = eVar.f74293s;
                    this.v = 1;
                    k3 k3Var = (k3) ((d3) aVar.f1531b);
                    k3Var.getClass();
                    j3 j3Var = new j3(k3Var, null, 0);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, j3Var, this);
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar = new z(eVar, continuation, i2);
                this.v = 1;
                Object objP2 = eVar.p2(this, zVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
