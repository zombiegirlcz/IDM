package vha;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f289438b;

    public /* synthetic */ t(q0 q0Var, int i) {
        this.f289437a = i;
        this.f289438b = q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289437a) {
            case 0:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, dii.e.f115068a);
                q0 q0Var = this.f289438b;
                if (zF) {
                    q0Var.V2(new y(q0Var, null, 2), new yi5.b(29));
                } else if (Intrinsics.f(result, dii.f.f115069a)) {
                    q0Var.V2(new y(q0Var, null, 3), new yi5.b(29));
                }
                return Unit.f186387a;
            default:
                d67.u uVar = (d67.u) obj2;
                if (!(uVar instanceof d67.p) && !Intrinsics.f(uVar, d67.q.f111462a) && !Intrinsics.f(uVar, d67.r.f111463a)) {
                    boolean zF2 = Intrinsics.f(uVar, d67.s.f111464a);
                    q0 q0Var2 = this.f289438b;
                    if (zF2) {
                        com.revolut.feature.freelancer.api.navigation.a aVar = com.revolut.feature.freelancer.api.navigation.a.BOOSTER;
                        q0Var2.getClass();
                        q0Var2.A2(new FreelancerBizFeatureConfig.Cashback(aVar));
                    } else {
                        if (!Intrinsics.f(uVar, d67.t.f111465a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j60.a.v(q0Var2.f289421s, false, null, 3);
                        q0Var2.V2(new y(q0Var2, null, 5), new yi5.b(29));
                    }
                }
                return Unit.f186387a;
        }
    }
}
