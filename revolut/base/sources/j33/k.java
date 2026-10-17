package j33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170946a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f170946a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f170946a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f170946a, ((k) obj2).f170946a);
    }

    public final int hashCode() {
        return this.f170946a.hashCode();
    }
}
