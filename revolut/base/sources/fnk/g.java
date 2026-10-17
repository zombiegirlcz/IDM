package fnk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f136700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f136701c;
    public final CountryClause d;
    public final w0 e;
    public final Object f;

    public g(String userId, Clause planName, wi0.b planCountry, CountryClause planCountryName, w0 planTier, Clause clause) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(planCountry, "planCountry");
        Intrinsics.checkNotNullParameter(planCountryName, "planCountryName");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f136699a = userId;
        this.f136700b = planName;
        this.f136701c = planCountry;
        this.d = planCountryName;
        this.e = planTier;
        this.f = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f136699a, gVar.f136699a) && this.f136700b.equals(gVar.f136700b) && this.f136701c.equals(gVar.f136701c) && this.d.equals(gVar.d) && this.e == gVar.e && this.f.equals(gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.b(this.f136699a.hashCode() * 31, 31, this.f136700b), 31, this.f136701c.f297794a)) * 31)) * 31);
    }
}
