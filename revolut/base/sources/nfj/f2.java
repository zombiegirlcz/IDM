package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import java.util.concurrent.CopyOnWriteArrayList;
import kfj.e3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class f2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s2 f214943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f214944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f214945y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(s2 s2Var, String str, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214943w = s2Var;
        this.f214944x = str;
        this.f214945y = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f2(this.f214943w, this.f214944x, this.f214945y, continuation, 0);
            default:
                return new f2(this.f214943w, this.f214944x, this.f214945y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s2 s2Var = this.f214943w;
        String str = this.f214944x;
        boolean z = this.f214945y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    EsimSubscriptionsService esimSubscriptionsService = s2Var.f215038a;
                    lfj.s sVar = new lfj.s(z);
                    this.v = 1;
                    obj2 = esimSubscriptionsService.patchSubscriptionAutoRenewal(str, sVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Response response = (Response) obj2;
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                e3 e3Var = (e3) response.body();
                dej.x1 x1VarH = e3Var != null ? mif.a.H(e3Var) : null;
                if (x1VarH == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsRepositoryImpl", "Can not update auto-renewal state in cache", null, h0Var);
                    return Unit.f186387a;
                }
                this.v = 2;
                if (s2.b(s2Var, str, x1VarH, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    EsimSubscriptionsService esimSubscriptionsService2 = s2Var.f215038a;
                    lfj.v vVar = new lfj.v(null, Boolean.valueOf(z));
                    this.v = 1;
                    obj2 = esimSubscriptionsService2.patchSubscriptionPaymentMethod(str, vVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Response response2 = (Response) obj2;
                if (!response2.isSuccessful()) {
                    throw new HttpException(response2);
                }
                this.v = 2;
                if (s2.d(s2Var, str, z, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
