package i2h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157933b;

    public d(String searchQuery, List cashHoldings) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
        this.f157932a = searchQuery;
        this.f157933b = cashHoldings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f157932a, dVar.f157932a) && Intrinsics.f(this.f157933b, dVar.f157933b);
    }

    public final int hashCode() {
        return this.f157933b.hashCode() + (this.f157932a.hashCode() * 31);
    }
}
