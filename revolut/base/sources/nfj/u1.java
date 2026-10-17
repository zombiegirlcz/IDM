package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimStatementsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nfj.o1;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class u1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f215057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f215058x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = v1Var;
        this.f215057w = str;
        this.f215058x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u1(this.v, this.f215057w, this.f215058x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        v1 v1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            EsimStatementsService esimStatementsService = v1Var.f215060a;
            this.u = 1;
            obj2 = esimStatementsService.getSubscriptionStatement(this.f215057w, this.f215058x, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Response response = (Response) obj2;
        int iCode = response.code();
        return iCode != 200 ? iCode != 202 ? o1.a.f215008a : o1.b.f215009a : new p1(v1.a(v1Var, response).f100513a);
    }
}
