package akl;

import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.network.services.AppConsentService;
import jkl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AppConsentService appConsentService = cVar.f5996c;
            String str = ((rqk.k) cVar.f5995b).f256593p;
            this.u = 1;
            obj2 = appConsentService.getAppChallenge(str, this);
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
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        jkl.t0 t0Var = (jkl.t0) cVar.f5994a.c((String) response.body(), jkl.t0.class);
        Intrinsics.h(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        String id10 = t0Var.getId();
        long expiresAt = t0Var.getExpiresAt();
        long createdAt = t0Var.getCreatedAt();
        String hint = t0Var.getHint();
        ConsentChallenge.Device deviceB = yjl.j.b(t0Var.getDevice());
        t0.a client = t0Var.getClient();
        ConsentChallenge.Client clientA = client != null ? yjl.j.a(client) : null;
        t0.e operation = t0Var.getOperation();
        return new ConsentChallenge.App(id10, expiresAt, createdAt, hint, deviceB, clientA, operation != null ? yjl.j.c(operation) : null);
    }
}
