package tf2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f270218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f270219x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f270218w = mVar;
        this.f270219x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f270218w, this.f270219x, continuation, 0);
            default:
                return new k(this.f270218w, this.f270219x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        e eVar = this.f270219x;
        m mVar = this.f270218w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                uvl.c cVar = mVar.o;
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = eVar.f270212a;
                this.v = 1;
                cVar.getClass();
                vf2.a aVar2 = new vf2.a(cVar, apmPaymentAuthorisationSummary, null);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, aVar2, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k kVar = new k(mVar, eVar, continuation, 0);
                this.v = 1;
                Object objT = q.t(mVar, kVar, this);
                return objT == aVar3 ? aVar3 : objT;
        }
    }
}
