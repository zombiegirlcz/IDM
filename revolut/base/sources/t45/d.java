package t45;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoanDetails f267896w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, LoanDetails loanDetails, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f267896w = loanDetails;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f267896w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        LoanDetails loanDetails = this.f267896w;
        if (i == 0) {
            o.b(obj2);
            m35.c cVar = this.v.f267909c;
            Intrinsics.h(loanDetails);
            this.u = 1;
            obj2 = ((c55.g) cVar).b(loanDetails, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Intrinsics.h(loanDetails);
        return new FeatureCommand(new LoanKompotFeatureConfig.SetupSepaDirectDebit(loanDetails, (x35.e) obj2));
    }
}
