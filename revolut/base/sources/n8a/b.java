package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.impl.data.network.AliasManagementService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f213296y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, AccountId accountId, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213295x = oVar;
        this.f213296y = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f213295x, this.f213296y, continuation, 0);
                bVar.f213294w = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f213295x, this.f213296y, continuation, 1);
                bVar2.f213294w = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = (String) this.f213294w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    AliasManagementService aliasManagementService = this.f213295x.f213340a;
                    wj0.b bVar = new wj0.b("accept_alias_migration");
                    String strA = vca.a.a(this.f213296y);
                    this.f213294w = null;
                    this.v = 1;
                    if (aliasManagementService.acceptClaim(str, bVar, "PIX", strA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                String str2 = (String) this.f213294w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    AliasManagementService aliasManagementService2 = this.f213295x.f213340a;
                    wj0.b bVar2 = new wj0.b("cancel_alias_migration");
                    String strA2 = vca.a.a(this.f213296y);
                    this.f213294w = null;
                    this.v = 1;
                    if (aliasManagementService2.cancelClaim(str2, bVar2, "PIX", strA2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
