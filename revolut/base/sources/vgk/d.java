package vgk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d f289191b;

    public /* synthetic */ d(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar, int i) {
        this.f289190a = i;
        this.f289191b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289190a) {
            case 0:
                if (((Throwable) obj2) != null) {
                    oki.h.D2(this.f289191b.z);
                }
                return Unit.f186387a;
            case 1:
                qik.d result = (qik.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof qik.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                qik.c cVar = (qik.c) result;
                this.f289191b.L2(cVar.f246750a, cVar.f246751b, null);
                return Unit.f186387a;
            default:
                hkk.g result2 = (hkk.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof hkk.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                hkk.f fVar = (hkk.f) result2;
                this.f289191b.L2(fVar.f152943a, fVar.f152944b, null);
                return Unit.f186387a;
        }
    }
}
