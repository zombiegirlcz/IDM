package moe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f207642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f207644c;

    public a(wi0.b userCountry, List existedTaxResidencies, List taxResidencyRules) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(existedTaxResidencies, "existedTaxResidencies");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        this.f207642a = userCountry;
        this.f207643b = existedTaxResidencies;
        this.f207644c = taxResidencyRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207642a, aVar.f207642a) && Intrinsics.f(this.f207643b, aVar.f207643b) && Intrinsics.f(this.f207644c, aVar.f207644c);
    }

    public final int hashCode() {
        return this.f207644c.hashCode() + p.a.d(this.f207642a.f297794a.hashCode() * 31, 31, this.f207643b);
    }
}
