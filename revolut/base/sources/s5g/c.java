package s5g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q4g.r;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f260071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4g.k f260072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f260073c;
    public final q4g.e d;

    public c(a headerMapper, k redeemOptionsSectionMapper, j paymentSummarySectionMapper, i paymentMethodSectionMapper, q4g.k flightSectionMapper, r travellersSectionMapper, q4g.e additionalDetailsSectionMapper, f pointsOptionsProvider, g termsMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(redeemOptionsSectionMapper, "redeemOptionsSectionMapper");
        Intrinsics.checkNotNullParameter(paymentSummarySectionMapper, "paymentSummarySectionMapper");
        Intrinsics.checkNotNullParameter(paymentMethodSectionMapper, "paymentMethodSectionMapper");
        Intrinsics.checkNotNullParameter(flightSectionMapper, "flightSectionMapper");
        Intrinsics.checkNotNullParameter(travellersSectionMapper, "travellersSectionMapper");
        Intrinsics.checkNotNullParameter(additionalDetailsSectionMapper, "additionalDetailsSectionMapper");
        Intrinsics.checkNotNullParameter(pointsOptionsProvider, "pointsOptionsProvider");
        Intrinsics.checkNotNullParameter(termsMapper, "termsMapper");
        this.f260071a = paymentMethodSectionMapper;
        this.f260072b = flightSectionMapper;
        this.f260073c = travellersSectionMapper;
        this.d = additionalDetailsSectionMapper;
    }
}
