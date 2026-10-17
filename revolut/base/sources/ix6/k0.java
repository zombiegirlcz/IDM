package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f169396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g f169397x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169397x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f169397x, continuation, 0);
                k0Var.f169396w = obj2;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.f169397x, continuation, 1);
                k0Var2.f169396w = obj2;
                return k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((h0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((FreelancerInvoice) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar;
        FreelancerInvoice freelancerInvoiceJ2;
        switch (this.u) {
            case 0:
                h0 h0Var = (h0) this.f169396w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = h0Var.f169393a;
                    if (!kotlin.text.d0.W(freelancerInvoiceItemPayload.f73394b) && freelancerInvoiceItemPayload.d > 0.0d && (freelancerInvoiceJ2 = (gVar = this.f169397x).J2()) != null) {
                        ufm.n nVarL = gVar.f73852t.l(freelancerInvoiceJ2.f73374a, h0Var.f169393a.f73393a, h0Var.f169394b);
                        this.f169396w = null;
                        this.v = 1;
                        if (nim.a.b(nVarL, this) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return Unit.f186387a;
            default:
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) this.f169396w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        ufm.n nVarI = this.f169397x.f73852t.i(freelancerInvoice.f73374a, mif.e0.L(freelancerInvoice));
                        this.f169396w = null;
                        this.v = 1;
                        if (nim.a.b(nVarI, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    break;
                } catch (Throwable unused) {
                }
                return Unit.f186387a;
        }
    }
}
