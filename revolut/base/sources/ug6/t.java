package ug6;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.payto.api.R$string;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExternalAccountTopupPayload.PayToStoredMethodPayload f279967w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, ExternalAccountTopupPayload.PayToStoredMethodPayload payToStoredMethodPayload, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f279967w = payToStoredMethodPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f279967w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ExternalAccountTopupPayload.PayToStoredMethodPayload payToStoredMethodPayload = this.f279967w;
        v vVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vVar.f279972q.a("TOPUP_IDEMPOTENCY_TAG");
            oe6.a aVar2 = vVar.f279969m;
            xg6.j jVar = (xg6.j) aVar2;
            pfm.r rVarK = jVar.k(payToStoredMethodPayload.f73111a, payToStoredMethodPayload.f73112b);
            this.u = 1;
            if (nim.a.a(rVarK, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return vVar.q2().d(new mii.f("DIALOG_ID_TOP_UP_SUCCESS", new TextLocalisedClause(R$string.pay_to_topup_completed_message, zhm.u.c(new MoneyClause(payToStoredMethodPayload.f73111a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 124));
    }
}
