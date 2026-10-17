package qf7;

import com.revolut.feature.incentive_reward.impl.network.IncentiveRewardService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lf7.k;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f245267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f245268x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245267w = iVar;
        this.f245268x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f245267w, this.f245268x, continuation, 0);
            default:
                return new h(this.f245267w, this.f245268x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    IncentiveRewardService incentiveRewardService = this.f245267w.f245269a;
                    this.v = 1;
                    obj2 = incentiveRewardService.redeemReward(this.f245268x, this);
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
                if (!response.isSuccessful()) {
                    if (response.code() == 412) {
                        return lf7.a.f194655a;
                    }
                    throw new HttpException(response);
                }
                Object objBody = response.body();
                if (objBody != null) {
                    return new lf7.b((k) objBody);
                }
                throw new IllegalStateException("Successful response must contain reward body");
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    IncentiveRewardService incentiveRewardService2 = this.f245267w.f245269a;
                    this.v = 1;
                    if (incentiveRewardService2.rejectReward(this.f245268x, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
