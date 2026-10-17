package ix6;

import akl.s1;
import au6.k1;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdateItem;
import et6.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f169406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g f169407x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(FreelancerInvoice freelancerInvoice, com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f169406w = freelancerInvoice;
        this.f169407x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.f169407x, this.f169406w, continuation, 0);
            case 1:
                return new o0(this.f169406w, this.f169407x, continuation, 1);
            case 2:
                return new o0(this.f169406w, this.f169407x, continuation, 2);
            case 3:
                return new o0(this.f169407x, this.f169406w, continuation, 3);
            default:
                return new o0(this.f169407x, this.f169406w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        Object objB2;
        Object objJ;
        int i = this.u;
        int i2 = 11;
        int i3 = 3;
        Continuation continuation = null;
        FreelancerInvoice freelancerInvoice = this.f169406w;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = this.f169407x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p1 p1Var = gVar.f73852t;
                String invoiceId = freelancerInvoice.f73374a;
                dj0.d dVar = new dj0.d(0L, freelancerInvoice.i);
                m70.a.c(t0.f186434a);
                FreelancerInvoiceUpdateItem payload = new FreelancerInvoiceUpdateItem("", sr6.h.UNIT, 1.0d, dVar, zhm.f0.f322471a);
                p1Var.getClass();
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(payload, "payload");
                k1 k1Var = (k1) p1Var.f129298b;
                k1Var.getClass();
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(payload, "payload");
                efm.d0<qt6.b> d0VarAddItemToInvoice = k1Var.f9546a.addItemToInvoice(invoiceId, ft6.h.k(payload));
                atg.n nVar = new atg.n(22, new au0.j0(i2));
                d0VarAddItemToInvoice.getClass();
                ufm.i iVar = new ufm.i(d0VarAddItemToInvoice, nVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.n nVarI0 = te0.w.i0(k1Var.d(iVar));
                this.v = 1;
                Object objB3 = nim.a.b(nVarI0, this);
                return objB3 == aVar ? aVar : objB3;
            case 1:
                p1 p1Var2 = gVar.f73852t;
                String str = freelancerInvoice.f73374a;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 == 1) {
                        yhm.o.b(obj2);
                        objJ = obj2;
                        return (FreelancerInvoice) objJ;
                    }
                    if (i6 == 2) {
                        yhm.o.b(obj2);
                        objB2 = obj2;
                        return (FreelancerInvoice) objB2;
                    }
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                    return (FreelancerInvoice) objB;
                }
                yhm.o.b(obj2);
                if (freelancerInvoice.d()) {
                    this.v = 1;
                    k1 k1Var2 = (k1) p1Var2.f129298b;
                    k1Var2.getClass();
                    s1 s1Var = new s1(k1Var2, str, continuation, i2);
                    p0 p0Var = p0.f264001a;
                    objJ = skm.e0.J(elm.f.f127540b, s1Var, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                    return (FreelancerInvoice) objJ;
                }
                if (mif.e0.x(freelancerInvoice)) {
                    ufm.n nVarF = p1Var2.f(str);
                    this.v = 2;
                    objB2 = nim.a.b(nVarF, this);
                    if (objB2 == aVar2) {
                        return aVar2;
                    }
                    return (FreelancerInvoice) objB2;
                }
                ufm.n nVarG = p1Var2.g(str);
                this.v = 3;
                objB = nim.a.b(nVarG, this);
                if (objB == aVar2) {
                    return aVar2;
                }
                return (FreelancerInvoice) objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    String str2 = freelancerInvoice.f73381m;
                    if (str2 == null) {
                        throw new IllegalStateException("Customer id must not be null");
                    }
                    n0 n0Var = new n0(freelancerInvoice, gVar, str2, (Continuation) null);
                    this.v = 1;
                    if (gVar.p2(this, n0Var) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarA = gVar.f73852t.a(freelancerInvoice.f73374a);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    o0 o0Var = new o0(gVar, freelancerInvoice, continuation, i3);
                    this.v = 1;
                    if (gVar.p2(this, o0Var) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar.C2(u.f169413a);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, FreelancerInvoice freelancerInvoice, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f169407x = gVar;
        this.f169406w = freelancerInvoice;
    }
}
