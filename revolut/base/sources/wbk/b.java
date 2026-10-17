package wbk;

import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingEligibilityService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th6.p;
import uyd.e0;
import vvc.s;
import w3c.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftingEligibilityService f296240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f296241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f296242c;

    public b(PlanGiftingEligibilityService planGiftingEligibilityService, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(planGiftingEligibilityService, "planGiftingEligibilityService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f296240a = planGiftingEligibilityService;
        this.f296241b = memoryCache;
        this.f296242c = new x4l.c(new p(this, (Continuation) null, 24), new n(this, 26), new s(this, 28), new rp1.c(2, 23, null), new e0(3, 10, null));
    }
}
