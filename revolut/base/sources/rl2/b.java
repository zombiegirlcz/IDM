package rl2;

import com.revolut.feature.backend_driven_limits.impl.v2.network.RestrictionsService;
import gim.i;
import il2.h;
import il2.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import ql2.k;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function3 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(3, continuation);
        this.v = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return new b(this.v, (Continuation) obj4).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            RestrictionsService restrictionsService = dVar.d;
            this.u = 1;
            obj2 = restrictionsService.getRestrictions(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Response response = (Response) obj2;
        if (response.code() == 204) {
            return i.a.f162058a;
        }
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        Object objBody = response.body();
        if (objBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dVar.f254911a.getClass();
        return new h(pl2.a.a((k) objBody));
    }
}
