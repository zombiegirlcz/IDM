package i27;

import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v17.l f157882b;

    public /* synthetic */ j(v17.l lVar, int i) {
        this.f157881a = i;
        this.f157882b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
        switch (this.f157881a) {
            case 0:
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                break;
            default:
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                break;
        }
        return this.f157882b.f285247a;
    }
}
