package z3l;

import dj0.d;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f319299b;

    public a(List taxesBreakdown, d total) {
        Intrinsics.checkNotNullParameter(taxesBreakdown, "taxesBreakdown");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f319298a = taxesBreakdown;
        this.f319299b = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319298a, aVar.f319298a) && Intrinsics.f(this.f319299b, aVar.f319299b);
    }

    public final int hashCode() {
        return this.f319299b.hashCode() + (this.f319298a.hashCode() * 31);
    }
}
