package hz2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157001b;

    public p(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157000a = items;
        this.f157001b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f157000a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f157000a, pVar.f157000a) && this.f157001b == pVar.f157001b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157001b) + (this.f157000a.hashCode() * 31);
    }
}
