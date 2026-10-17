package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberPortingService;
import kfj.a4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f214957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f214958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214957w = j0Var;
        this.f214958x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f214957w, this.f214958x, continuation, 0);
            default:
                return new i0(this.f214957w, this.f214958x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                j0 j0Var = this.f214957w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberPortingService esimPhoneNumberPortingService = j0Var.f214966a;
                    this.v = 1;
                    obj2 = esimPhoneNumberPortingService.createPortingAuthorization(this.f214958x, this);
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
                kfj.r2 r2Var = (kfj.r2) response.body();
                if (r2Var == null) {
                    throw new IllegalStateException("Missing porting authorization body");
                }
                pfj.i iVarW = md6.s.w(r2Var);
                ulm.u0 u0VarHeaders = response.headers();
                Intrinsics.checkNotNullExpressionValue(u0VarHeaders, "headers(...)");
                long jA = j0Var.a(u0VarHeaders);
                ulm.u0 u0VarHeaders2 = response.headers();
                Intrinsics.checkNotNullExpressionValue(u0VarHeaders2, "headers(...)");
                return new pfj.f(iVarW, jA, j0Var.b(u0VarHeaders2));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    EsimPhoneNumberPortingService esimPhoneNumberPortingService2 = this.f214957w.f214966a;
                    kfj.o2 o2Var = new kfj.o2(new kfj.n2());
                    this.v = 1;
                    obj2 = esimPhoneNumberPortingService2.putPortOutEligibility(this.f214958x, o2Var, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ofj.p.b((a4) obj2, null, null);
        }
    }
}
