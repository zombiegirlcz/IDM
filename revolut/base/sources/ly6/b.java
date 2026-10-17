package ly6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import et6.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ly6.d;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoiceSettings f200705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jy6.h f200706x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, FreelancerInvoiceSettings freelancerInvoiceSettings, jy6.h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f200705w = freelancerInvoiceSettings;
        this.f200706x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f200705w, this.f200706x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            p1 p1Var = cVar.f200707l;
            jy6.h hVar = this.f200706x;
            Object objB = nim.a.b(p1Var.k(FreelancerInvoiceSettings.a(this.f200705w, null, null, null, null, hVar.f179336c ? hVar.f179334a : f0.f322471a, null, null, null, null, null, null, null, 16351)), this);
            if (objB != obj3) {
                objB = Unit.f186387a;
            }
            if (objB == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return cVar.r2().M0(d.a.f200708b);
    }
}
