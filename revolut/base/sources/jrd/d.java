package jrd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177996a;

    public d(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f177996a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f177996a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f177996a, ((d) obj2).f177996a);
    }

    public final int hashCode() {
        return this.f177996a.hashCode();
    }
}
