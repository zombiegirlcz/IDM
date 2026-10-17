package fo6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136833a;

    public n(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136833a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f136833a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f136833a, ((n) obj2).f136833a);
    }

    public final int hashCode() {
        return this.f136833a.hashCode();
    }
}
