package pkg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f237176b;

    public g(List after, List before) {
        Intrinsics.checkNotNullParameter(after, "after");
        Intrinsics.checkNotNullParameter(before, "before");
        this.f237175a = after;
        this.f237176b = before;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f237175a, gVar.f237175a) && Intrinsics.f(this.f237176b, gVar.f237176b);
    }

    public final int hashCode() {
        return this.f237176b.hashCode() + (this.f237175a.hashCode() * 31);
    }
}
