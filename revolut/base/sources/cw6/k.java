package cw6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerServerError.InvoiceNumberTaken f109550w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, FreelancerServerError.InvoiceNumberTaken invoiceNumberTaken, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f109550w = invoiceNumberTaken;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, this.f109550w, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            FreelancerServerError.InvoiceNumberTaken invoiceNumberTaken = this.f109550w;
            String str = invoiceNumberTaken.f73538c;
            String str2 = invoiceNumberTaken.f73537b;
            l lVar = this.v;
            FreelancerInvoiceNumberData freelancerInvoiceNumberData = ((h) ((j2) lVar.f109555t.f22677a).getValue()).f109547b;
            lVar.n2(new cn0.d(lVar, new FreelancerInvoiceNumberData(str, str2, freelancerInvoiceNumberData != null ? freelancerInvoiceNumberData.f73400c : false), (Continuation) null, 20), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
