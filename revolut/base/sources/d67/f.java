package d67;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptContentDelegate.Model f111455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f111456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f111457c;
    public final boolean d;

    public f(PromptContentDelegate.Model promptModel, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z) {
        Intrinsics.checkNotNullParameter(promptModel, "promptModel");
        this.f111455a = promptModel;
        this.f111456b = analyticsProduct;
        this.f111457c = analyticsContext;
        this.d = z;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: J0 */
    public final PromptContentDelegate.Model getZ() {
        return this.f111455a;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: N0 */
    public final boolean getF74493p() {
        return this.d;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF74500y() {
        return this.f111456b;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getF74497t() {
        return this.f111457c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f111455a, fVar.f111455a) && Intrinsics.f(this.f111456b, fVar.f111456b) && Intrinsics.f(this.f111457c, fVar.f111457c) && this.d == fVar.d;
    }

    @Override // d67.g
    /* JADX INFO: renamed from: getFitStatusBar */
    public final boolean getO() {
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f111455a.hashCode() * 31;
        AnalyticsProduct analyticsProduct = this.f111456b;
        int iHashCode2 = (iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f111457c;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode2 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, false);
    }

    @Override // d67.g
    /* JADX INFO: renamed from: p0 */
    public final boolean getF74498w() {
        return false;
    }
}
