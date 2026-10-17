package uck;

import com.revolut.retail.feature.plan_referrals.impl.network.PlanReferralsService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f279046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f279047x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279046w = fVar;
        this.f279047x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f279046w, this.f279047x, continuation, 0);
            default:
                return new c(this.f279046w, this.f279047x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                f fVar = this.f279046w;
                if (i == 0) {
                    o.b(obj2);
                    PlanReferralsService planReferralsService = fVar.f279050a;
                    this.v = 1;
                    if (planReferralsService.cancelReferral(this.f279047x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                x4l.c cVar = fVar.d;
                Object obj3 = Unit.f186387a;
                Object objD = cVar.d(obj3, false, this);
                if (objD == aVar) {
                    obj3 = objD;
                }
                if (obj3 == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    PlanReferralsService planReferralsService2 = this.f279046w.f279050a;
                    this.v = 1;
                    if (planReferralsService2.claimReferral(this.f279047x, this) == aVar2) {
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
