package uqh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f282182b;

    public y(String query, List results) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(results, "results");
        this.f282181a = query;
        this.f282182b = results;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f282181a, yVar.f282181a) && Intrinsics.f(this.f282182b, yVar.f282182b);
    }

    public final int hashCode() {
        return this.f282182b.hashCode() + (this.f282181a.hashCode() * 31);
    }
}
