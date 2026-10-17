package akf;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f5867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ApmPaymentAuthorisationSummary f5868x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(p0 p0Var, ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f5867w = p0Var;
        this.f5868x = apmPaymentAuthorisationSummary;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0(this.f5867w, this.f5868x, continuation, 0);
            default:
                return new n0(this.f5867w, this.f5868x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = this.f5868x;
        p0 p0Var = this.f5867w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vz1.g gVar = p0Var.f5878n;
                String str = apmPaymentAuthorisationSummary.f61992a;
                this.v = 1;
                gVar.getClass();
                vz1.e eVar = new vz1.e(gVar, str, null, 0);
                skm.p0 p0Var2 = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, eVar, this);
                return objJ == aVar ? aVar : objJ;
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
                n0 n0Var = new n0(p0Var, apmPaymentAuthorisationSummary, continuation, i2);
                this.v = 1;
                Object objY2 = p0Var.Y2(this, n0Var);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
