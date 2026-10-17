package nyb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements eub.h {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f220795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f220796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f220797c;
    public final l80.e d;

    public i(c revPointsBenefitsInteractor, ffk.t pricingPlanInteractor, ue0.c storage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(revPointsBenefitsInteractor, "revPointsBenefitsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f220795a = revPointsBenefitsInteractor;
        this.f220796b = pricingPlanInteractor;
        this.f220797c = storage;
        this.d = dateProvider;
    }
}
