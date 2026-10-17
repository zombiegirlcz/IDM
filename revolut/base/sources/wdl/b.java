package wdl;

import a0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u000f\u0010\u001e¨\u0006 "}, d2 = {"Lwdl/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "forbiddenCountries", "Ljava/lang/String;", "g", "registeredIdentityId", "", "c", "J", "d", "()J", "limitGapPpm", "context", "Lwdl/a;", "e", "Lwdl/a;", "()Lwdl/a;", "links", "f", "onboardingStoryId", "", "Z", "()Z", "investmentPocketsEnabled", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("forbiddenCountries")
    @NotNull
    private final List<String> forbiddenCountries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredIdentityId")
    @NotNull
    private final String registeredIdentityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("limitGapPpm")
    private final long limitGapPpm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("context")
    @NotNull
    private final String context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("links")
    @NotNull
    private final a links;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("onboarding-story-id")
    @NotNull
    private final String onboardingStoryId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("investment-pockets-enabled")
    private final boolean investmentPocketsEnabled;

    public b(ArrayList forbiddenCountries, String registeredIdentityId, long j2, String context, a links, String onboardingStoryId, boolean z) {
        Intrinsics.checkNotNullParameter(forbiddenCountries, "forbiddenCountries");
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(onboardingStoryId, "onboardingStoryId");
        this.forbiddenCountries = forbiddenCountries;
        this.registeredIdentityId = registeredIdentityId;
        this.limitGapPpm = j2;
        this.context = context;
        this.links = links;
        this.onboardingStoryId = onboardingStoryId;
        this.investmentPocketsEnabled = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getForbiddenCountries() {
        return this.forbiddenCountries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getInvestmentPocketsEnabled() {
        return this.investmentPocketsEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLimitGapPpm() {
        return this.limitGapPpm;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getLinks() {
        return this.links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.forbiddenCountries, bVar.forbiddenCountries) && Intrinsics.f(this.registeredIdentityId, bVar.registeredIdentityId) && this.limitGapPpm == bVar.limitGapPpm && Intrinsics.f(this.context, bVar.context) && Intrinsics.f(this.links, bVar.links) && Intrinsics.f(this.onboardingStoryId, bVar.onboardingStoryId) && this.investmentPocketsEnabled == bVar.investmentPocketsEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOnboardingStoryId() {
        return this.onboardingStoryId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.investmentPocketsEnabled) + p.a.c((this.links.hashCode() + p.a.c(d.c(p.a.c(this.forbiddenCountries.hashCode() * 31, 31, this.registeredIdentityId), 31, this.limitGapPpm), 31, this.context)) * 31, 31, this.onboardingStoryId);
    }
}
