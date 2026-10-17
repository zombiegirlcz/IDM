package ulk;

import ffk.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f281045b;

    public /* synthetic */ o(q qVar, int i) {
        this.f281044a = i;
        this.f281045b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f281044a) {
            case 0:
                hha.d plan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(plan, "selectedPlan");
                q qVar = this.f281045b;
                t tVar = qVar.f281047p;
                hha.i billingCode = qVar.o.f103516b;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                Intrinsics.checkNotNullParameter(billingCode, "billingCode");
                return rd0.e.b(t.u(tVar, plan.f152287a, billingCode, false, 12));
            default:
                qha.a subscriptionInfo = (qha.a) obj2;
                Intrinsics.checkNotNullParameter(subscriptionInfo, "subscriptionInfo");
                q qVar2 = this.f281045b;
                qVar2.H2(qVar2.f281048q, new ud3.n(qVar2, subscriptionInfo, 28));
                return Unit.f186387a;
        }
    }
}
