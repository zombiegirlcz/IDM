package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.data.network.AliasManagementService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f213311y;
    public final /* synthetic */ PixKey z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, AccountId accountId, PixKey pixKey, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213310x = oVar;
        this.f213311y = accountId;
        this.z = pixKey;
        this.A = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f213310x, this.f213311y, this.z, this.A, continuation, 0);
                eVar.f213309w = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f213310x, this.f213311y, this.z, this.A, continuation, 1);
                eVar2.f213309w = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = (String) this.f213309w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    AliasManagementService aliasManagementService = this.f213310x.f213340a;
                    wj0.b bVar = new wj0.b("deny_alias_migration");
                    String strA = vca.a.a(this.f213311y);
                    l8a.e eVar = new l8a.e(k8a.c.a(this.z), this.A);
                    this.f213309w = null;
                    this.v = 1;
                    if (aliasManagementService.denyClaim(str, bVar, "PIX", strA, eVar, this) == aVar) {
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
                String str2 = (String) this.f213309w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    AliasManagementService aliasManagementService2 = this.f213310x.f213340a;
                    wj0.b bVar2 = new wj0.b("finish_alias_migration");
                    String strA2 = vca.a.a(this.f213311y);
                    l8a.e eVar2 = new l8a.e(k8a.c.a(this.z), this.A);
                    this.f213309w = null;
                    this.v = 1;
                    if (aliasManagementService2.confirmClaim(str2, bVar2, "PIX", strA2, eVar2, this) == aVar2) {
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
