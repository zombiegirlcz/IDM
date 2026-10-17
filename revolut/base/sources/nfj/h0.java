package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberPortingService;
import kfj.f4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f214952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f214953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f214954y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214952w = j0Var;
        this.f214953x = str;
        this.f214954y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h0(this.f214952w, this.f214953x, this.f214954y, continuation, 0);
            case 1:
                return new h0(this.f214952w, this.f214953x, this.f214954y, continuation, 1);
            default:
                return new h0(this.f214952w, this.f214953x, this.f214954y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f214953x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberPortingService esimPhoneNumberPortingService = this.f214952w.f214966a;
                    lfj.p pVar = new lfj.p(str, this.f214954y);
                    this.v = 1;
                    obj2 = esimPhoneNumberPortingService.createPorting(pVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                f4 f4Var = (f4) obj2;
                return ofj.p.c(f4Var, str, null, f4Var.getId());
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberPortingService esimPhoneNumberPortingService2 = this.f214952w.f214966a;
                    this.v = 1;
                    obj2 = esimPhoneNumberPortingService2.getPortingAuthorization(this.f214953x, this.f214954y, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return md6.s.w((kfj.r2) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                j0 j0Var = this.f214952w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberPortingService esimPhoneNumberPortingService3 = j0Var.f214966a;
                    lfj.o oVar = new lfj.o(this.f214954y);
                    this.v = 1;
                    obj2 = esimPhoneNumberPortingService3.submitPortingAuthorizationCode(this.f214953x, oVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Response response = (Response) obj2;
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                ulm.u0 u0VarHeaders = response.headers();
                Intrinsics.checkNotNullExpressionValue(u0VarHeaders, "headers(...)");
                long jA = j0Var.a(u0VarHeaders);
                ulm.u0 u0VarHeaders2 = response.headers();
                Intrinsics.checkNotNullExpressionValue(u0VarHeaders2, "headers(...)");
                return new pfj.e(jA, j0Var.b(u0VarHeaders2));
        }
    }
}
