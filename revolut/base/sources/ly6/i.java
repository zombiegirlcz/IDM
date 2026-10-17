package ly6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ FreelancerInvoiceSettings A;
    public final /* synthetic */ n B;
    public final /* synthetic */ cli.j C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f200714w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f200715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f200716y;
    public final /* synthetic */ FreelancerInvoice z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(n nVar, boolean z, boolean z3, CoroutineScope coroutineScope, FreelancerInvoice freelancerInvoice, cli.j jVar, FreelancerInvoiceSettings freelancerInvoiceSettings, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.B = nVar;
        this.f200714w = z;
        this.f200715x = z3;
        this.f200716y = coroutineScope;
        this.z = freelancerInvoice;
        this.C = jVar;
        this.A = freelancerInvoiceSettings;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((k) this.B, this.f200714w, this.f200715x, this.f200716y, this.z, (jy6.h) this.C, this.A, continuation, 0);
            default:
                return new i((yx6.g) this.B, this.f200714w, this.f200715x, this.f200716y, this.z, (wx6.h) this.C, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                k kVar = (k) this.B;
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
                tji.f fVarQ2 = kVar.q2();
                h hVar = new h(this.f200714w, this.f200715x, kVar, this.f200716y, this.z, (jy6.h) this.C, this.A, null);
                this.v = 1;
                Object objB0 = u0.b0(fVarQ2, "BUTTON_TAG_SAVE", hVar, this);
                return objB0 == aVar ? aVar : objB0;
            default:
                yx6.g gVar = (yx6.g) this.B;
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
                tji.f fVarQ22 = gVar.q2();
                yx6.f fVar = new yx6.f(this.f200714w, this.f200715x, gVar, this.f200716y, this.z, (wx6.h) this.C, this.A, null);
                this.v = 1;
                Object objB02 = u0.b0(fVarQ22, "ADD_MESSAGE_SUBMIT_BUTTON_TAG", fVar, this);
                return objB02 == aVar2 ? aVar2 : objB02;
        }
    }
}
