package pgb;

import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SalaryHubV3Controller f235840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SalaryHubV3Controller salaryHubV3Controller, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235840w = salaryHubV3Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f235840w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f235840w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f235840w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SalaryHubV3Controller salaryHubV3Controller = this.f235840w;
        switch (i) {
            case 0:
                String deeplink = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a aVar2 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) salaryHubV3Controller.e3();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                aVar2.I2(deeplink);
                break;
            case 1:
                String deeplink2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a aVar4 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) salaryHubV3Controller.e3();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                aVar4.I2(deeplink2);
                break;
            default:
                String deeplink3 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a aVar6 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) salaryHubV3Controller.e3();
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(deeplink3, "deeplink");
                aVar6.I2(deeplink3);
                break;
        }
        return Unit.f186387a;
    }
}
