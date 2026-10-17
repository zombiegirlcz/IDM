package kkf;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e5 extends yji.n implements elf.s0 {

    @NotNull
    public static final c5 Companion = new c5();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jr6.a f184656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hr6.l f184657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.f1 f184658n;

    public e5(jr6.a freelancerAcquiringOrderItemMapper, hr6.l freelancerCommandFactory, klf.f1 freelancerDataSource) {
        Intrinsics.checkNotNullParameter(freelancerAcquiringOrderItemMapper, "freelancerAcquiringOrderItemMapper");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerDataSource, "freelancerDataSource");
        this.f184656l = freelancerAcquiringOrderItemMapper;
        this.f184657m = freelancerCommandFactory;
        this.f184658n = freelancerDataSource;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = true;
        if (obj2 instanceof nr6.b) {
            A2(new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.OrderDetails(((nr6.b) obj2).f218537a)));
        } else if (obj2 instanceof FreelancerOrder) {
            A2(((ct6.m) this.f184657m).h((FreelancerOrder) obj2));
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
