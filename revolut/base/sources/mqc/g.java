package mqc;

import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import com.revolut.feature.salary_switch.impl.network.PayrollService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SalarySwitchPreview.Account.Card f207957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, SalarySwitchPreview.Account.Card card, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f207957w = card;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f207957w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PayrollService payrollService = this.v.f207962b;
            hqc.d dVar = new hqc.d(hqc.b.EXTERNAL_CARD_TOKEN, this.f207957w.f85233c);
            this.u = 1;
            obj2 = payrollService.getTerms(dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((hqc.g) obj2).f154664a;
    }
}
