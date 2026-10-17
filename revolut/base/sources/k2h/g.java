package k2h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180584b;

    public g(String searchQuery, List instrumentWithTickers) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(instrumentWithTickers, "instrumentWithTickers");
        this.f180583a = searchQuery;
        this.f180584b = instrumentWithTickers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f180583a, gVar.f180583a) && Intrinsics.f(this.f180584b, gVar.f180584b);
    }

    public final int hashCode() {
        return this.f180584b.hashCode() + (this.f180583a.hashCode() * 31);
    }
}
