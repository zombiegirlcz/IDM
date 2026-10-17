package ly6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ FreelancerInvoiceSettings A;
    public final /* synthetic */ n B;
    public final /* synthetic */ cli.j C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f200717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f200718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f200719y;
    public final /* synthetic */ FreelancerInvoice z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, boolean z, boolean z3, FreelancerInvoice freelancerInvoice, cli.j jVar, FreelancerInvoiceSettings freelancerInvoiceSettings, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.B = nVar;
        this.f200718x = z;
        this.f200719y = z3;
        this.z = freelancerInvoice;
        this.C = jVar;
        this.A = freelancerInvoiceSettings;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j((k) this.B, this.f200718x, this.f200719y, this.z, (jy6.h) this.C, this.A, continuation, 0);
                jVar.f200717w = obj2;
                return jVar;
            default:
                j jVar2 = new j((yx6.g) this.B, this.f200718x, this.f200719y, this.z, (wx6.h) this.C, this.A, continuation, 1);
                jVar2.f200717w = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f200717w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k kVar = (k) this.B;
                i iVar = new i(kVar, this.f200718x, this.f200719y, coroutineScope, this.z, (jy6.h) this.C, this.A, null, 0);
                this.f200717w = null;
                this.v = 1;
                Object objB = pu7.a.B(kVar.e, "update_invoice_reminders", iVar, this);
                return objB == aVar ? aVar : objB;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f200717w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                yx6.g gVar = (yx6.g) this.B;
                i iVar2 = new i(gVar, this.f200718x, this.f200719y, coroutineScope2, this.z, (wx6.h) this.C, this.A, null, 1);
                this.f200717w = null;
                this.v = 1;
                Object objB2 = pu7.a.B(gVar.e, "update_invoice_email_message", iVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
