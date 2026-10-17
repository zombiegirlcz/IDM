package kgb;

import com.revolut.feature.retail.salary_account.impl.salary_hub.data.service.SalaryHubService;
import gim.i;
import igb.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import mgb.l;
import mgb.m;
import qgb.m0;
import retrofit2.HttpException;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f183941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f183941w = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new d(this.f183941w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new d(this.f183941w, continuation, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new d(this.f183941w, continuation, 2).invokeSuspend(Unit.f186387a);
            default:
                return new d(this.f183941w, continuation, 3).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    SalaryHubService salaryHubService = this.f183941w.f183943a;
                    this.v = 1;
                    obj2 = salaryHubService.getSalaryHubAvailability(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return v13.d.J((igb.i) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        SalaryHubService salaryHubService2 = this.f183941w.f183943a;
                        this.v = 1;
                        obj2 = salaryHubService2.getSalaryHub(this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return new l(vc.o.y((f0) obj2));
                } catch (HttpException e) {
                    if (e.code() == 404) {
                        return m.f205253a;
                    }
                    throw e;
                }
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    SalaryHubService salaryHubService3 = this.f183941w.f183943a;
                    this.v = 1;
                    obj2 = salaryHubService3.getSalaryHubV3Availability(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return edl.a.D((qgb.i) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    SalaryHubService salaryHubService4 = this.f183941w.f183943a;
                    this.v = 1;
                    obj2 = salaryHubService4.getSalaryHubV3(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return foh.i.B((m0) obj2);
        }
    }
}
