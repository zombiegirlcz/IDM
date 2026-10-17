package sdl;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f261969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f261970c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new y(12)), null, yhm.j.c(kVar, new y(13))};
    }

    public /* synthetic */ g1(int i, dj0.d dVar, List list, dj0.d dVar2, List list2) {
        if (15 != (i & 15)) {
            qlm.j1.f(e1.f261964a.getDescriptor(), i, 15);
            throw null;
        }
        this.f261968a = dVar;
        this.f261969b = list;
        this.f261970c = dVar2;
        this.d = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f261968a, g1Var.f261968a) && Intrinsics.f(this.f261969b, g1Var.f261969b) && Intrinsics.f(this.f261970c, g1Var.f261970c) && Intrinsics.f(this.d, g1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.d(this.f261968a.hashCode() * 31, 31, this.f261969b), 31, this.f261970c);
    }

    public g1(dj0.d defaultInitialContribution, dj0.d defaultMonthlyContribution, List initialContributionSuggestions, List monthlyContributionSuggestions) {
        Intrinsics.checkNotNullParameter(defaultInitialContribution, "defaultInitialContribution");
        Intrinsics.checkNotNullParameter(initialContributionSuggestions, "initialContributionSuggestions");
        Intrinsics.checkNotNullParameter(defaultMonthlyContribution, "defaultMonthlyContribution");
        Intrinsics.checkNotNullParameter(monthlyContributionSuggestions, "monthlyContributionSuggestions");
        this.f261968a = defaultInitialContribution;
        this.f261969b = initialContributionSuggestions;
        this.f261970c = defaultMonthlyContribution;
        this.d = monthlyContributionSuggestions;
    }
}
