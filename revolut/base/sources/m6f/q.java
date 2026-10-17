package m6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f203079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f203080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f203081c;
    public final l d;

    public q(o stocksSection, k bondsSection, m commoditiesSection, l cashSection) {
        Intrinsics.checkNotNullParameter(stocksSection, "stocksSection");
        Intrinsics.checkNotNullParameter(bondsSection, "bondsSection");
        Intrinsics.checkNotNullParameter(commoditiesSection, "commoditiesSection");
        Intrinsics.checkNotNullParameter(cashSection, "cashSection");
        this.f203079a = stocksSection;
        this.f203080b = bondsSection;
        this.f203081c = commoditiesSection;
        this.d = cashSection;
    }

    public static q a(q qVar, o stocksSection, k bondsSection, m commoditiesSection, l cashSection, int i) {
        if ((i & 1) != 0) {
            stocksSection = qVar.f203079a;
        }
        if ((i & 2) != 0) {
            bondsSection = qVar.f203080b;
        }
        if ((i & 4) != 0) {
            commoditiesSection = qVar.f203081c;
        }
        if ((i & 8) != 0) {
            cashSection = qVar.d;
        }
        Intrinsics.checkNotNullParameter(stocksSection, "stocksSection");
        Intrinsics.checkNotNullParameter(bondsSection, "bondsSection");
        Intrinsics.checkNotNullParameter(commoditiesSection, "commoditiesSection");
        Intrinsics.checkNotNullParameter(cashSection, "cashSection");
        return new q(stocksSection, bondsSection, commoditiesSection, cashSection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f203079a, qVar.f203079a) && Intrinsics.f(this.f203080b, qVar.f203080b) && Intrinsics.f(this.f203081c, qVar.f203081c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f203081c.hashCode() + ((this.f203080b.hashCode() + (this.f203079a.hashCode() * 31)) * 31)) * 31);
    }
}
