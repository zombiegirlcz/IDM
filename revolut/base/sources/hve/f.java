package hve;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.impl.data.network.service.TopupMethodsService;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f155827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopUpMethodsContext f155828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, TopUpMethodsContext topUpMethodsContext, Continuation continuation) {
        super(2, continuation);
        this.f155827w = oVar;
        this.f155828x = topUpMethodsContext;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.f155827w, this.f155828x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                o oVar2 = this.f155827w;
                TopUpMethodsContext topUpMethodsContext = this.f155828x;
                TopupMethodsService topupMethodsService = oVar2.f155849b;
                String str = topUpMethodsContext.f90550a;
                yte.n nVar = topUpMethodsContext.f90551b;
                this.u = oVar2;
                this.v = 1;
                Object cardSteeringSuggestedMethod = topupMethodsService.getCardSteeringSuggestedMethod(str, nVar, this);
                if (cardSteeringSuggestedMethod == aVar) {
                    return aVar;
                }
                oVar = oVar2;
                obj2 = cardSteeringSuggestedMethod;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = this.u;
                yhm.o.b(obj2);
            }
            Response response = (Response) obj2;
            if (response.code() != 204) {
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                xue.c cVar = (xue.c) response.body();
                if (cVar != null) {
                    nue.a aVar2 = oVar.e;
                    return nue.a.a(cVar);
                }
            }
            return null;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
