package li6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oe6.m;
import oki.h;
import skm.e0;
import skm.p0;
import x61.g;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f195423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f195424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a aVar, Set set, Set set2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f195423w = set;
        this.f195424x = set2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f195423w, this.f195424x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
            m mVar = bVar.f305574a;
            g gVar = new g(str, str2, this.f195423w, this.f195424x);
            hf6.i iVar = (hf6.i) ((mg6.c) mVar).f205160a;
            iVar.getClass();
            h54.o oVar = new h54.o(iVar, gVar, null, 27);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, oVar, this);
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
