package g6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f141003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MoneyRequest moneyRequest, r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f141003w = moneyRequest;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.f141003w, this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            this.v.A2(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, this.f141003w.d, null, null, 30)));
        }
        return Unit.f186387a;
    }
}
