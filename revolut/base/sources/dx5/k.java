package dx5;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.wealth.api.domain.model.ExchangePocketIsDisabledError;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((rp0.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar = this.v;
        rea.m mVar = nVar.f120888x;
        rp0.c cVar = (rp0.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = cVar.f256051b;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.wealth.api.domain.model.ExchangePocketIsDisabledError.Payload");
        ExchangePocketIsDisabledError.Payload payload = (ExchangePocketIsDisabledError.Payload) obj3;
        String str = payload.f95227b;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        if (str == null) {
            pfm.a aVarE = mVar.e(personal, io3.l.CURRENT, payload.f95226a.f306286a).e(mVar.i(personal));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            Intrinsics.checkNotNullParameter(aVarE, "<this>");
            return new v1(new dlk.k(aVarE, (Continuation) null, 26));
        }
        d0 d0VarH = mVar.h(personal, str);
        dv5.n nVar2 = new dv5.n(new cia.d(1, nVar.f120888x, eda.f.class, "enablePocket", "enablePocket(Lcom/revolut/feature/core/model/domain/wallet/pocket/Pocket;Lcom/revolut/core/model/account/AccountId;)Lio/reactivex/Completable;", 0, 1), 20);
        d0VarH.getClass();
        pfm.a aVarE2 = new pfm.a(d0VarH, nVar2, 4).e(mVar.i(personal));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        Intrinsics.checkNotNullParameter(aVarE2, "<this>");
        return new v1(new dlk.k(aVarE2, (Continuation) null, 26));
    }
}
