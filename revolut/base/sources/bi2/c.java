package bi2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15377a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f15377a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f15377a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f15377a, ((c) obj2).f15377a);
    }

    public final int hashCode() {
        return this.f15377a.hashCode();
    }
}
