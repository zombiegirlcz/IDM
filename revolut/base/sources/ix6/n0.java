package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import et6.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f169403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g f169404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f169405y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(FreelancerInvoice freelancerInvoice, com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f169403w = freelancerInvoice;
        this.f169404x = gVar;
        this.f169405y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0(this.f169404x, this.f169403w, this.f169405y, continuation);
            default:
                return new n0(this.f169403w, this.f169404x, this.f169405y, continuation);
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
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar;
        Object objV;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p1 p1Var = this.f169404x.f73852t;
                FreelancerInvoice freelancerInvoice = this.f169403w;
                String str = freelancerInvoice.f73374a;
                xi0.b.Companion.getClass();
                ufm.n nVarI = p1Var.i(str, mif.e0.L(FreelancerInvoice.a(freelancerInvoice, xi0.a.a(this.f169405y), null, null, null, null, null, null, null, 67108607)));
                this.v = 1;
                Object objB = nim.a.b(nVarI, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar2 = this.f169404x;
                FreelancerInvoice freelancerInvoice2 = this.f169403w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (!freelancerInvoice2.b()) {
                        gVar2.C2(new s(this.f169405y));
                        return Unit.f186387a;
                    }
                    a3b.i iVar = new a3b.i(gVar2, freelancerInvoice2, 12);
                    o0 o0Var = new o0(freelancerInvoice2, gVar2, (Continuation) null, 1);
                    this.v = 1;
                    gVar = gVar2;
                    objV = n14.k.V(gVar, null, null, iVar, o0Var, this, 2);
                    if (objV == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objV = obj2;
                    gVar = gVar2;
                }
                nii.h hVar = (nii.h) objV;
                if ((hVar instanceof nii.g) && (((nii.g) hVar).f216153b instanceof l1)) {
                    gVar.C2(new v(freelancerInvoice2.f73374a));
                } else {
                    gVar.B2();
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, FreelancerInvoice freelancerInvoice, String str, Continuation continuation) {
        super(1, continuation);
        this.f169404x = gVar;
        this.f169403w = freelancerInvoice;
        this.f169405y = str;
    }
}
