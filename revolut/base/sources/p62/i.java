package p62;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f233205a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f233205a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f233205a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f233205a, ((i) obj2).f233205a);
    }

    public final int hashCode() {
        return this.f233205a.hashCode();
    }
}
