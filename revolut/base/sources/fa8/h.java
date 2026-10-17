package fa8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133254b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f133253a = items;
        this.f133254b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f133253a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f133253a, hVar.f133253a) && this.f133254b == hVar.f133254b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133254b) + (this.f133253a.hashCode() * 31);
    }
}
