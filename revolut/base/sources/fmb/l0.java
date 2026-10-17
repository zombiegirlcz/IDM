package fmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$ChallengeInfo;
import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncd.a f136275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f136277c;
    public final List d;
    public final OnboardingConfig.ReviewDetailsScreenConfig e;
    public final od0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f136278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReviewProductDetailsScreenContract$ChallengeInfo f136279h;
    public final pjb.b i;

    public l0(ncd.a availableProduct, boolean z, wi0.b countryCode, List documentsData, OnboardingConfig.ReviewDetailsScreenConfig reviewDetailsScreenConfig, od0.i partnerInfo, j0 j0Var, ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo, pjb.b bVar) {
        Intrinsics.checkNotNullParameter(availableProduct, "availableProduct");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentsData, "documentsData");
        Intrinsics.checkNotNullParameter(partnerInfo, "partnerInfo");
        this.f136275a = availableProduct;
        this.f136276b = z;
        this.f136277c = countryCode;
        this.d = documentsData;
        this.e = reviewDetailsScreenConfig;
        this.f = partnerInfo;
        this.f136278g = j0Var;
        this.f136279h = reviewProductDetailsScreenContract$ChallengeInfo;
        this.i = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f136275a, l0Var.f136275a) && this.f136276b == l0Var.f136276b && Intrinsics.f(this.f136277c, l0Var.f136277c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f136278g, l0Var.f136278g) && Intrinsics.f(this.f136279h, l0Var.f136279h) && Intrinsics.f(this.i, l0Var.i);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(j6.a.c(this.f136275a.hashCode() * 31, 31, this.f136276b), 31, this.f136277c.f297794a), 31, this.d);
        OnboardingConfig.ReviewDetailsScreenConfig reviewDetailsScreenConfig = this.e;
        int iF = r6.b.f(this.f, (iD + (reviewDetailsScreenConfig == null ? 0 : reviewDetailsScreenConfig.hashCode())) * 31, 31);
        j0 j0Var = this.f136278g;
        int iHashCode = (iF + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo = this.f136279h;
        int iHashCode2 = (iHashCode + (reviewProductDetailsScreenContract$ChallengeInfo == null ? 0 : reviewProductDetailsScreenContract$ChallengeInfo.hashCode())) * 31;
        pjb.b bVar = this.i;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
