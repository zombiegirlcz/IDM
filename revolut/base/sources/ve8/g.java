package ve8;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u001a\u0010 \u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u000f\u0010\"R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b\u0005\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b\u001f\u0010\"¨\u0006."}, d2 = {"Lve8/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "planId", "", "b", "I", "k", "()I", "minimumAge", "c", "h", "maximumUseAge", "d", "g", "maximumRegistrationAgeExclusive", "e", "maxGuardianAccountCount", "f", "maxTotalAccountCount", "Ljo3/a;", "Ljo3/a;", "j", "()Ljo3/a;", "minTopUpAmount", "maxTopUpLimit", "i", "maxCardsPerAccount", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxCoparentsPerJuniorAccount", "", "Ljava/util/List;", "()Ljava/util/List;", ib.b.Features, "", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "suggestUpgradeOnOnboarding", "minAgeDifference", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumAge")
    private final int minimumAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximumUseAge")
    private final int maximumUseAge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maximumRegistrationAge")
    private final int maximumRegistrationAgeExclusive;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("maxGuardianAccountCount")
    private final int maxGuardianAccountCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("maxTotalAccountCount")
    private final int maxTotalAccountCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("minTopUpAmount")
    @NotNull
    private final jo3.a minTopUpAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxMonthlyTopUpAmount")
    private final jo3.a maxTopUpLimit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("maxCardsPerAccount")
    private final int maxCardsPerAccount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxCoGuardiansPerJuniorAccount")
    private final Integer maxCoparentsPerJuniorAccount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("youthFeatures")
    @NotNull
    private final List<String> features;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("shouldSuggestUpgradeOnOnboarding")
    private final Boolean suggestUpgradeOnOnboarding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAgeDifference")
    private final Integer minAgeDifference;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxCardsPerAccount() {
        return this.maxCardsPerAccount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMaxCoparentsPerJuniorAccount() {
        return this.maxCoparentsPerJuniorAccount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxGuardianAccountCount() {
        return this.maxGuardianAccountCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMaxTopUpLimit() {
        return this.maxTopUpLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.planId, gVar.planId) && this.minimumAge == gVar.minimumAge && this.maximumUseAge == gVar.maximumUseAge && this.maximumRegistrationAgeExclusive == gVar.maximumRegistrationAgeExclusive && this.maxGuardianAccountCount == gVar.maxGuardianAccountCount && this.maxTotalAccountCount == gVar.maxTotalAccountCount && Intrinsics.f(this.minTopUpAmount, gVar.minTopUpAmount) && Intrinsics.f(this.maxTopUpLimit, gVar.maxTopUpLimit) && this.maxCardsPerAccount == gVar.maxCardsPerAccount && Intrinsics.f(this.maxCoparentsPerJuniorAccount, gVar.maxCoparentsPerJuniorAccount) && Intrinsics.f(this.features, gVar.features) && Intrinsics.f(this.suggestUpgradeOnOnboarding, gVar.suggestUpgradeOnOnboarding) && Intrinsics.f(this.minAgeDifference, gVar.minAgeDifference);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxTotalAccountCount() {
        return this.maxTotalAccountCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaximumRegistrationAgeExclusive() {
        return this.maximumRegistrationAgeExclusive;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaximumUseAge() {
        return this.maximumUseAge;
    }

    public final int hashCode() {
        int iJ = v7.j(this.minTopUpAmount, j6.a.b(this.maxTotalAccountCount, j6.a.b(this.maxGuardianAccountCount, j6.a.b(this.maximumRegistrationAgeExclusive, j6.a.b(this.maximumUseAge, j6.a.b(this.minimumAge, this.planId.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        jo3.a aVar = this.maxTopUpLimit;
        int iB = j6.a.b(this.maxCardsPerAccount, (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        Integer num = this.maxCoparentsPerJuniorAccount;
        int iD = p.a.d((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.features);
        Boolean bool = this.suggestUpgradeOnOnboarding;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.minAgeDifference;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getMinAgeDifference() {
        return this.minAgeDifference;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getMinTopUpAmount() {
        return this.minTopUpAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getSuggestUpgradeOnOnboarding() {
        return this.suggestUpgradeOnOnboarding;
    }
}
