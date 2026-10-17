package j82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172095b;

    public l(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172094a = items;
        this.f172095b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f172094a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f172094a, lVar.f172094a) && this.f172095b == lVar.f172095b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172095b) + (this.f172094a.hashCode() * 31);
    }
}
