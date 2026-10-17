package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerSettingsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o2 f9582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f9583x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(o2 o2Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9582w = o2Var;
        this.f9583x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n2(this.f9582w, this.f9583x, continuation, 0);
            case 1:
                return new n2(this.f9582w, this.f9583x, continuation, 1);
            default:
                return new n2(this.f9582w, this.f9583x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FreelancerSettingsService freelancerSettingsService = this.f9582w.f9588a;
                    pt6.a aVar2 = new pt6.a(this.f9583x);
                    this.v = 1;
                    obj2 = freelancerSettingsService.changeEmail(aVar2, this);
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
                if (response.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response);
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FreelancerSettingsService freelancerSettingsService2 = this.f9582w.f9588a;
                    pt6.b bVar = new pt6.b(this.f9583x);
                    this.v = 1;
                    obj2 = freelancerSettingsService2.changeUrl(bVar, new wj0.b("IDEMPOTENCY_TAG_FREELANCER_URL_UPDATE"), this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Response response2 = (Response) obj2;
                if (response2.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FreelancerSettingsService freelancerSettingsService3 = this.f9582w.f9588a;
                    pt6.c cVar = new pt6.c(this.f9583x);
                    this.v = 1;
                    obj2 = freelancerSettingsService3.verifyCode(cVar, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Response response3 = (Response) obj2;
                if (response3.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response3);
        }
    }
}
