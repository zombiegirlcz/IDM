package j8f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172202a;

    public n(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172202a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f172202a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f172202a, ((n) obj2).f172202a);
    }

    public final int hashCode() {
        return this.f172202a.hashCode();
    }
}
