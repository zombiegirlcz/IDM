package brc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17994a;

    public r(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17994a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f17994a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f17994a, ((r) obj2).f17994a);
    }

    public final int hashCode() {
        return this.f17994a.hashCode();
    }
}
