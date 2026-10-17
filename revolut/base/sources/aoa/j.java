package aoa;

import ffk.t;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.s;
import yna.e1;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f7949h = v.k(s.PLAN, s.CARD);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f7950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sh3.a f7951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f7952c;
    public final toh.d d;
    public final ufm.d e;
    public final e1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f7953g;

    public j(t pricingPlanInteractor, sh3.a checkoutInteractor, gte.a featureToggleInteractor, toh.d revPointsInteractor, ufm.d contextualNudgeInteractor, e1 salaryCampaignStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(contextualNudgeInteractor, "contextualNudgeInteractor");
        Intrinsics.checkNotNullParameter(salaryCampaignStringMapper, "salaryCampaignStringMapper");
        this.f7950a = pricingPlanInteractor;
        this.f7951b = checkoutInteractor;
        this.f7952c = featureToggleInteractor;
        this.d = revPointsInteractor;
        this.e = contextualNudgeInteractor;
        this.f = salaryCampaignStringMapper;
        this.f7953g = yhm.j.b(new a2g.a(this, 23));
    }
}
