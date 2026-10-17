package nb8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f214017c;
    public final boolean d;

    public g(String userId, boolean z, List allowances, List coParents) {
        Intrinsics.checkNotNullParameter(allowances, "allowances");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(coParents, "coParents");
        this.f214015a = allowances;
        this.f214016b = userId;
        this.f214017c = coParents;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f214015a, gVar.f214015a) && Intrinsics.f(this.f214016b, gVar.f214016b) && Intrinsics.f(this.f214017c, gVar.f214017c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.c(this.f214015a.hashCode() * 31, 31, this.f214016b), 31, this.f214017c);
    }
}
