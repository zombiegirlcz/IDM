package ji6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$InputData;
import gim.i;
import hae.k;
import he4.r;
import if6.j;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe6.m;
import pi6.g;
import te0.w;
import ufm.n;
import x61.h;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a f174374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f174375x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar, LinkedHashSet linkedHashSet, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f174374w = aVar;
        this.f174375x = linkedHashSet;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f174374w, this.f174375x, continuation, 0);
            default:
                return new c(this.f174374w, this.f174375x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar = this.f174374w;
                OpenBankingAuthAccountsFlowContract$InputData openBankingAuthAccountsFlowContract$InputData = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar = aVar.f72496q;
                String str = openBankingAuthAccountsFlowContract$InputData.e;
                String str2 = openBankingAuthAccountsFlowContract$InputData.d;
                String str3 = openBankingAuthAccountsFlowContract$InputData.f72491b;
                String strL = str3 != null ? m70.a.l(str3) : null;
                String str4 = openBankingAuthAccountsFlowContract$InputData.f72490a;
                String strL2 = str4 != null ? m70.a.l(str4) : null;
                List listD1 = d0.d1(this.f174375x);
                String str5 = openBankingAuthAccountsFlowContract$InputData.f72492c;
                String str6 = openBankingAuthAccountsFlowContract$InputData.f;
                h model = new h(str, str2, strL, strL2, str5, listD1, str6 != null ? m70.a.l(str6) : null);
                mg6.c cVar = (mg6.c) mVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                hf6.i iVar = (hf6.i) cVar.f205160a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                efm.d0<j> d0VarAuthorizeAccounts = iVar.f151760a.authorizeAccounts(uj3.b.B(model));
                k kVar = new k(new r(18), 13);
                d0VarAuthorizeAccounts.getClass();
                ufm.i iVar2 = new ufm.i(d0VarAuthorizeAccounts, kVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                n nVarI0 = w.i0(iVar2);
                this.v = 1;
                Object objB = nim.a.b(nVarI0, this);
                return objB == aVar2 ? aVar2 : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar4 = this.f174374w;
                pi6.d dVar = aVar4.f72495p;
                c cVar2 = new c(aVar4, this.f174375x, null, 0);
                this.v = 1;
                Object objA = ((g) dVar).a(cVar2, this);
                return objA == aVar3 ? aVar3 : objA;
        }
    }
}
