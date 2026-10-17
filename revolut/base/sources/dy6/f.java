package dy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import dy6.c;
import et6.p1;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mif.e0;
import ufm.n;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f121066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f121067x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, FreelancerInvoice freelancerInvoice, Set set, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f121066w = freelancerInvoice;
        this.f121067x = set;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f121066w, this.f121067x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            p1 p1Var = gVar.f121068l;
            FreelancerInvoice freelancerInvoice = this.f121066w;
            n nVarI = p1Var.i(freelancerInvoice.f73374a, e0.L(FreelancerInvoice.a(freelancerInvoice, null, d0.d1(this.f121067x), null, null, null, null, null, null, 67100671)));
            this.u = 1;
            if (nim.a.b(nVarI, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return gVar.r2().M0(c.a.f121064b);
    }
}
