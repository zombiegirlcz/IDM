package af8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u000f\u0010\u001dR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0017\u0010\rR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u0005\u0010$R\u001a\u0010*\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b\u001f\u0010\r¨\u0006,"}, d2 = {"Laf8/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "planId", "", "b", "I", "j", "()I", "minimumAge", "c", "h", "maximumUseAge", "d", "g", "maximumRegistrationAgeExclusive", "e", "maxGuardianAccountCount", "f", "maxTotalAccountCount", "maximumCardsPerAccount", "Ljo3/b;", "Ljo3/b;", "k", "()Ljo3/b;", "minimumTopUpAmount", "i", "maxTopUpLimit", "maximumCoparentsPerJuniorAccount", "", "Ljava/util/List;", "()Ljava/util/List;", ib.b.Features, "", "Z", "m", "()Z", "suggestUpgradeOnOnboarding", "minAgeDifference", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @lg.b("maximumCardsPerAccount")
    private final int maximumCardsPerAccount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumTopUpAmount")
    @NotNull
    private final jo3.b minimumTopUpAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("maxTopUpLimit")
    private final jo3.b maxTopUpLimit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximumCoparentsPerJuniorAccount")
    private final int maximumCoparentsPerJuniorAccount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b(ib.b.Features)
    @NotNull
    private final List<String> features;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestUpgradeOnOnboarding")
    private final boolean suggestUpgradeOnOnboarding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAgeDifference")
    private final int minAgeDifference;

    public g(String planId, int i, int i2, int i3, int i5, int i6, int i21, jo3.b minimumTopUpAmount, jo3.b bVar, int i22, ArrayList features, boolean z, int i32) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(minimumTopUpAmount, "minimumTopUpAmount");
        Intrinsics.checkNotNullParameter(features, "features");
        this.planId = planId;
        this.minimumAge = i;
        this.maximumUseAge = i2;
        this.maximumRegistrationAgeExclusive = i3;
        this.maxGuardianAccountCount = i5;
        this.maxTotalAccountCount = i6;
        this.maximumCardsPerAccount = i21;
        this.minimumTopUpAmount = minimumTopUpAmount;
        this.maxTopUpLimit = bVar;
        this.maximumCoparentsPerJuniorAccount = i22;
        this.features = features;
        this.suggestUpgradeOnOnboarding = z;
        this.minAgeDifference = i32;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxGuardianAccountCount() {
        return this.maxGuardianAccountCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getMaxTopUpLimit() {
        return this.maxTopUpLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxTotalAccountCount() {
        return this.maxTotalAccountCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaximumCardsPerAccount() {
        return this.maximumCardsPerAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.planId, gVar.planId) && this.minimumAge == gVar.minimumAge && this.maximumUseAge == gVar.maximumUseAge && this.maximumRegistrationAgeExclusive == gVar.maximumRegistrationAgeExclusive && this.maxGuardianAccountCount == gVar.maxGuardianAccountCount && this.maxTotalAccountCount == gVar.maxTotalAccountCount && this.maximumCardsPerAccount == gVar.maximumCardsPerAccount && Intrinsics.f(this.minimumTopUpAmount, gVar.minimumTopUpAmount) && Intrinsics.f(this.maxTopUpLimit, gVar.maxTopUpLimit) && this.maximumCoparentsPerJuniorAccount == gVar.maximumCoparentsPerJuniorAccount && Intrinsics.f(this.features, gVar.features) && this.suggestUpgradeOnOnboarding == gVar.suggestUpgradeOnOnboarding && this.minAgeDifference == gVar.minAgeDifference;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaximumCoparentsPerJuniorAccount() {
        return this.maximumCoparentsPerJuniorAccount;
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
        int iE = y.e(this.minimumTopUpAmount, j6.a.b(this.maximumCardsPerAccount, j6.a.b(this.maxTotalAccountCount, j6.a.b(this.maxGuardianAccountCount, j6.a.b(this.maximumRegistrationAgeExclusive, j6.a.b(this.maximumUseAge, j6.a.b(this.minimumAge, this.planId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        jo3.b bVar = this.maxTopUpLimit;
        return Integer.hashCode(this.minAgeDifference) + j6.a.c(p.a.d(j6.a.b(this.maximumCoparentsPerJuniorAccount, (iE + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31, this.features), 31, this.suggestUpgradeOnOnboarding);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinAgeDifference() {
        return this.minAgeDifference;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.b getMinimumTopUpAmount() {
        return this.minimumTopUpAmount;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getSuggestUpgradeOnOnboarding() {
        return this.suggestUpgradeOnOnboarding;
    }
}
