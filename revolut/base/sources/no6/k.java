package no6;

import com.revolut.feature.external_accounts.api.model.PlaidConfig;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xg6.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            oe6.h hVar = mVar.f217929q;
            ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = mVar.o.f217923a;
            PlaidConfig plaidConfig = directLink.f72278b;
            x61.d dVar = directLink.f72279c;
            this.u = 1;
            obj2 = ((q) hVar).e(plaidConfig, dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        mVar.H2(mVar.f217932t, new nj8.b((String) obj2, 12));
        return Unit.f186387a;
    }
}
