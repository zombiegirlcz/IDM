package s9b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261155a;

    public i(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f261155a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f261155a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f261155a, ((i) obj2).f261155a);
    }

    public final int hashCode() {
        return this.f261155a.hashCode();
    }
}
