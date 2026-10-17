package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.StudentPlanService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 {

    @NotNull
    private static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StudentPlanService f235696a;

    public t0(StudentPlanService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f235696a = service;
    }
}
