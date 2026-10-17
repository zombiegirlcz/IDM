package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesCheckoutService;
import gwi.r2;
import hwi.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f156254w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f156254w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f156254w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            AirportLoungePassesCheckoutService airportLoungePassesCheckoutService = this.v.f156256a;
            this.u = 1;
            obj2 = airportLoungePassesCheckoutService.getPurchaseState(this.f156254w, this);
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
        if (response.code() == 204) {
            return m.b.f156234a;
        }
        Object objBody = response.body();
        if (objBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = s.f156252a[svi.j0.valueOf(((r2) objBody).f147506b).ordinal()];
        if (i2 == 1) {
            return m.c.f156235a;
        }
        if (i2 == 2) {
            return m.a.f156233a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
