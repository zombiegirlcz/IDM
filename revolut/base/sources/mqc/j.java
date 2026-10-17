package mqc;

import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import com.revolut.feature.salary_switch.impl.network.PayrollService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SalarySwitchPreview.Account.Clabe f207960w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, SalarySwitchPreview.Account.Clabe clabe, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f207960w = clabe;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f207960w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PayrollService payrollService = this.v.f207962b;
            eqc.d dVar = new eqc.d(eqc.b.CLABE, this.f207960w.f85234a);
            this.u = 1;
            obj2 = payrollService.submitRequest(dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((eqc.k) obj2).f128429a;
    }
}
