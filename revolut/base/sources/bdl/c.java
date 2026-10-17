package bdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e¨\u0006 "}, d2 = {"Lbdl/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "forbiddenCountries", "Ljava/lang/String;", "g", "registeredIdentityId", "c", "context", "d", "e", "onboardingStoryId", "Lbdl/b;", "Lbdl/b;", "f", "()Lbdl/b;", "orders", "Lbdl/d;", "Lbdl/d;", "()Lbdl/d;", "links", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "investmentPocketsEnabled", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("forbidden-countries")
    @NotNull
    private final List<String> forbiddenCountries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredIdentityId")
    @NotNull
    private final String registeredIdentityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("context")
    @NotNull
    private final String context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("onboarding-story-id")
    @NotNull
    private final String onboardingStoryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("orders")
    @NotNull
    private final b orders;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("links")
    @NotNull
    private final d links;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("investment-pockets-enabled")
    private final Boolean investmentPocketsEnabled;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getForbiddenCountries() {
        return this.forbiddenCountries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getInvestmentPocketsEnabled() {
        return this.investmentPocketsEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOnboardingStoryId() {
        return this.onboardingStoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.forbiddenCountries, cVar.forbiddenCountries) && Intrinsics.f(this.registeredIdentityId, cVar.registeredIdentityId) && Intrinsics.f(this.context, cVar.context) && Intrinsics.f(this.onboardingStoryId, cVar.onboardingStoryId) && Intrinsics.f(this.orders, cVar.orders) && Intrinsics.f(this.links, cVar.links) && Intrinsics.f(this.investmentPocketsEnabled, cVar.investmentPocketsEnabled);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getOrders() {
        return this.orders;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    public final int hashCode() {
        int iHashCode = (this.links.hashCode() + ((this.orders.hashCode() + p.a.c(p.a.c(p.a.c(this.forbiddenCountries.hashCode() * 31, 31, this.registeredIdentityId), 31, this.context), 31, this.onboardingStoryId)) * 31)) * 31;
        Boolean bool = this.investmentPocketsEnabled;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
