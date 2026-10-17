package mtj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.rewards_hub.network.RewardsHubService;
import d9.e1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import ntj.x;
import ttj.u;
import wim.z;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f208890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f208891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f208892y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208890w = qVar;
        this.f208891x = str;
        this.f208892y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f208890w, this.f208891x, this.f208892y, continuation, 0);
            default:
                return new p(this.f208890w, this.f208891x, this.f208892y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                q qVar = this.f208890w;
                boolean z = true;
                if (i == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService = qVar.f208893a;
                    this.v = 1;
                    obj2 = rewardsHubService.getChallenge(this.f208891x, this.f208892y, this);
                    obj3 = aVar;
                    if (obj2 != aVar) {
                    }
                    return obj3;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                d0j.h hVarV = e1.V((u) obj2);
                xe0.e eVar = qVar.d;
                ne0.d dVar = qVar.f208895c;
                d0j.n nVar = hVarV.d;
                if (nVar != d0j.n.COMPLETED && nVar != d0j.n.EXPIRED) {
                    z = false;
                }
                d0j.m mVar = d0j.m.ACTIVE;
                String strC = q.c(mVar);
                d0j.q qVar2 = (d0j.q) dVar.get(strC);
                if (qVar2 != null) {
                    dVar.f(strC, d0j.q.a(qVar2, q.g(qVar2.f110426b, hVarV, z)));
                }
                String strD = q.d(mVar);
                x xVar = (x) y.t(x.class, eVar, strD);
                obj3 = hVarV;
                if (xVar != null) {
                    d0j.q qVarC = do3.q.C(xVar);
                    eVar.G(do3.q.F(d0j.q.a(qVarC, q.g(qVarC.f110426b, hVarV, z))), strD, z.d(o0.b(x.class)));
                    obj3 = hVarV;
                }
                return obj3;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String str = this.f208891x;
                q qVar3 = this.f208890w;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        RewardsHubService rewardsHubService2 = qVar3.f208893a;
                        String str2 = this.f208892y;
                        this.v = 1;
                        if (rewardsHubService2.revealChallengeCampaign(str, str2, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yhm.o.b(obj2);
                            return new Data(Unit.f186387a, null, false, 6, null);
                        }
                        yhm.o.b(obj2);
                    }
                    x4l.c cVar = qVar3.f208901n;
                    this.v = 2;
                    if (cVar.d(str, false, this) == aVar2) {
                        return aVar2;
                    }
                    return new Data(Unit.f186387a, null, false, 6, null);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    return new Data(null, e2, false, 5, null);
                }
        }
    }
}
