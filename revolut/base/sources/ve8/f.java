package ve8;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\f\u0010 ¨\u0006\""}, d2 = {"Lve8/f;", "", "", "toString", "()Ljava/lang/String;", "Lve8/h;", "a", "Lve8/h;", "d", "()Lve8/h;", "links", "Lve8/c;", "b", "Lve8/c;", "c", "()Lve8/c;", "featureFlags", "Ljava/lang/String;", "e", "onboardingPaywallType", "", "Lve8/g;", "Ljava/util/List;", "f", "()Ljava/util/List;", "planConfigurations", "Lve8/a;", "Lve8/a;", "()Lve8/a;", "consentPromptsEligibility", "Lve8/b;", "Lve8/b;", "()Lve8/b;", "featureConfigurations", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("links")
    @NotNull
    private final h links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("featureFlags")
    @NotNull
    private final c featureFlags;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("onboardingPaywallType")
    private final String onboardingPaywallType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("planConfigurations")
    @NotNull
    private final List<g> planConfigurations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("consentPromptsEligibility")
    @NotNull
    private final a consentPromptsEligibility;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("featureConfigurations")
    @NotNull
    private final b featureConfigurations;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getConsentPromptsEligibility() {
        return this.consentPromptsEligibility;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFeatureConfigurations() {
        return this.featureConfigurations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getFeatureFlags() {
        return this.featureFlags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOnboardingPaywallType() {
        return this.onboardingPaywallType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.links, fVar.links) && Intrinsics.f(this.featureFlags, fVar.featureFlags) && Intrinsics.f(this.onboardingPaywallType, fVar.onboardingPaywallType) && Intrinsics.f(this.planConfigurations, fVar.planConfigurations) && Intrinsics.f(this.consentPromptsEligibility, fVar.consentPromptsEligibility) && Intrinsics.f(this.featureConfigurations, fVar.featureConfigurations);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getPlanConfigurations() {
        return this.planConfigurations;
    }

    public final int hashCode() {
        int iHashCode = (this.featureFlags.hashCode() + (this.links.hashCode() * 31)) * 31;
        String str = this.onboardingPaywallType;
        return this.featureConfigurations.hashCode() + ((this.consentPromptsEligibility.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.planConfigurations)) * 31);
    }
}
