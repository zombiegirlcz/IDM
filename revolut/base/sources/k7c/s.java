package k7c;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ xi0.b A;
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u6c.c f181999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f182000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u6c.t f182001y;
    public final /* synthetic */ u6c.u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, u6c.c cVar, String str, u6c.t tVar, u6c.u uVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f181999w = cVar;
        this.f182000x = str;
        this.f182001y = tVar;
        this.z = uVar;
        this.A = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f181999w, this.f182000x, this.f182001y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f182000x;
        z zVar = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                u6c.c cVar = this.f181999w;
                this.u = 1;
                obj2 = z.a(zVar, cVar, str, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            PaymentMethod.Card card = (PaymentMethod.Card) obj2;
            if (card == null) {
                throw new IllegalStateException("Added card has an unknown brand");
            }
            q qVar = new q(card.f84370a, this.f182001y, this.f182000x, this.z, this.A);
            od0.i.Companion.getClass();
            zVar.j(qVar, od0.h.a(card), true);
            Collection collection = (List) zVar.f182026b.get(z.d(str));
            if (collection == null) {
                collection = zhm.f0.f322471a;
            }
            zVar.f.g(new p(str), zhm.d0.F0(card, collection));
            return new com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.a(card);
        } catch (HttpException httpException) {
            d7c.b bVar = zVar.d;
            Intrinsics.checkNotNullParameter(httpException, "httpException");
            ServerError serverErrorC = bVar.f111918a.c(httpException);
            u6c.a aVar2 = null;
            Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
            if (numValueOf != null && numValueOf.intValue() == 90008) {
                aVar2 = new u6c.a(u6c.h.f277556a);
            } else if (numValueOf != null && numValueOf.intValue() == 90009) {
                aVar2 = new u6c.a(u6c.e.f277550a);
            } else if (numValueOf != null && numValueOf.intValue() == 90010) {
                aVar2 = new u6c.a(u6c.f.f277554a);
            } else if (numValueOf != null && numValueOf.intValue() == 90012) {
                aVar2 = new u6c.a(u6c.d.f277549a);
            } else if (numValueOf != null && numValueOf.intValue() == 90013) {
                aVar2 = new u6c.a(u6c.g.f277555a);
            }
            if (aVar2 != null) {
                return aVar2;
            }
            throw httpException;
        }
    }
}
