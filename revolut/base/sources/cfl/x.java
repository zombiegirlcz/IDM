package cfl;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f23753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f23755c;
    public final List d;

    public x(dj0.d defaultInitialContribution, dj0.d defaultMonthlyContribution, List initialContributionSuggestions, List monthlyContributionSuggestions) {
        Intrinsics.checkNotNullParameter(defaultInitialContribution, "defaultInitialContribution");
        Intrinsics.checkNotNullParameter(initialContributionSuggestions, "initialContributionSuggestions");
        Intrinsics.checkNotNullParameter(defaultMonthlyContribution, "defaultMonthlyContribution");
        Intrinsics.checkNotNullParameter(monthlyContributionSuggestions, "monthlyContributionSuggestions");
        this.f23753a = defaultInitialContribution;
        this.f23754b = initialContributionSuggestions;
        this.f23755c = defaultMonthlyContribution;
        this.d = monthlyContributionSuggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f23753a, xVar.f23753a) && Intrinsics.f(this.f23754b, xVar.f23754b) && Intrinsics.f(this.f23755c, xVar.f23755c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.d(this.f23753a.hashCode() * 31, 31, this.f23754b), 31, this.f23755c);
    }
}
