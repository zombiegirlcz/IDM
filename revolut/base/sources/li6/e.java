package li6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import hf6.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            xg6.b bVar = aVar2.f72504p;
            OpenBankingAuthAccountsAuFlowContract$InputData openBankingAuthAccountsAuFlowContract$InputData = aVar2.o;
            String str = openBankingAuthAccountsAuFlowContract$InputData.f72500b;
            String str2 = openBankingAuthAccountsAuFlowContract$InputData.f72499a;
            this.u = 1;
            hf6.i iVar = (hf6.i) ((mg6.c) bVar.f305574a).f205160a;
            iVar.getClass();
            g gVar = new g(iVar, str, str2, null, 1);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, gVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.D2(aVar2.f72506r);
        return aVar2.C1(new ExternalDestination.Browser((String) obj2, null));
    }
}
