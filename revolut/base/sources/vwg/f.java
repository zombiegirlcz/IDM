package vwg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f292734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f292735c;
    public final List d;

    public f(String portfolioId, d0 usageRequirements, x xVar, List indicators) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(usageRequirements, "usageRequirements");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.f292733a = portfolioId;
        this.f292734b = usageRequirements;
        this.f292735c = xVar;
        this.d = indicators;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292733a, fVar.f292733a) && Intrinsics.f(this.f292734b, fVar.f292734b) && Intrinsics.f(this.f292735c, fVar.f292735c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f292734b.hashCode() + (this.f292733a.hashCode() * 31)) * 31;
        x xVar = this.f292735c;
        return this.d.hashCode() + ((iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31);
    }
}
