package zx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.z;
import nii.l1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerServerError.InvoiceNumberTaken f326057w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, FreelancerServerError.InvoiceNumberTaken invoiceNumberTaken, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f326057w = invoiceNumberTaken;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, this.f326057w, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            o oVar = this.v;
            FreelancerInvoiceSettings freelancerInvoiceSettings = ((h) ((j2) oVar.f326064t.f22677a).getValue()).f326047a;
            if (freelancerInvoiceSettings == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            FreelancerServerError.InvoiceNumberTaken invoiceNumberTaken = this.f326057w;
            oVar.n2(new zr5.k(oVar, FreelancerInvoiceSettings.a(freelancerInvoiceSettings, null, null, null, null, null, null, invoiceNumberTaken.f73537b, z.m(invoiceNumberTaken.f73538c), null, null, null, null, 15999), null, 15), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
