package dy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import dy6.c;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ufm.n;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoiceSettings f121061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f121062x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, FreelancerInvoiceSettings freelancerInvoiceSettings, Set set, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f121061w = freelancerInvoiceSettings;
        this.f121062x = set;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f121061w, this.f121062x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            n nVarK = bVar.f121063l.k(FreelancerInvoiceSettings.a(this.f121061w, null, null, null, null, null, d0.d1(this.f121062x), null, null, null, null, null, null, 16319));
            this.u = 1;
            if (nim.a.b(nVarK, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return bVar.r2().M0(c.a.f121064b);
    }
}
