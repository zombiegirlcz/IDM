package koe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f186318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f186320c;
    public final List d;

    public j(List taxResidencies, List taxResidencyRules, List taxCertifications, wi0.b userCountry) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(taxCertifications, "taxCertifications");
        this.f186318a = userCountry;
        this.f186319b = taxResidencies;
        this.f186320c = taxResidencyRules;
        this.d = taxCertifications;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f186318a, jVar.f186318a) && Intrinsics.f(this.f186319b, jVar.f186319b) && Intrinsics.f(this.f186320c, jVar.f186320c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f186318a.f297794a.hashCode() * 31, 31, this.f186319b), 31, this.f186320c);
    }
}
