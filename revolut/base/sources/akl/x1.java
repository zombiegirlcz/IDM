package akl;

import com.revolut.core.account.region.domain.model.AccountRegion;
import com.revolut.sso.impl.network.services.TokenExchangeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jkl.k4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class x1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r10.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f6114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wi0.b f6115y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(r10.a aVar, String str, String str2, wi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f6113w = str;
        this.f6114x = str2;
        this.f6115y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x1(this.v, this.f6113w, this.f6114x, this.f6115y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            r10.a aVar2 = this.v;
            TokenExchangeService tokenExchangeService = (TokenExchangeService) aVar2.f250812b;
            String str = ((rqk.k) ((bjl.p0) aVar2.f250811a)).f256593p;
            wi0.b bVar = this.f6115y;
            String str2 = bVar != null ? bVar.f297794a : null;
            this.u = 1;
            obj2 = tokenExchangeService.exchangeToken(str, this.f6113w, this.f6114x, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k4 k4Var = (k4) obj2;
        String idToken = k4Var.getIdToken();
        String accessToken = k4Var.getAccessToken();
        String tokenType = k4Var.getTokenType();
        long expiresIn = k4Var.getExpiresIn();
        String scope = k4Var.getScope();
        List accountIds = k4Var.getAccountIds();
        if (accountIds != null) {
            List list = accountIds;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(UUID.fromString((String) it8.next()));
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        AccountRegion.Companion companion = AccountRegion.INSTANCE;
        String region = k4Var.getRegion();
        companion.getClass();
        return new cjl.u(idToken, accessToken, tokenType, expiresIn, scope, arrayList, AccountRegion.Companion.a(region));
    }
}
