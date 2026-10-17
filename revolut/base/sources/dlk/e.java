package dlk;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e f115783b;

    public /* synthetic */ e(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar, int i) {
        this.f115782a = i;
        this.f115783b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f115782a) {
            case 0:
                this.f115783b.L2(t.NO_OFFERS);
                break;
            case 1:
                this.f115783b.L2(t.DOWNGRADE_REASONS_RESULT);
                break;
            default:
                this.f115783b.L2(t.DOWNGRADE_FEES_AND_TERMS);
                break;
        }
        return Unit.f186387a;
    }
}
