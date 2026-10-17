package tma;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272173a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f272173a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f272173a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f272173a, ((j) obj2).f272173a);
    }

    public final int hashCode() {
        return this.f272173a.hashCode();
    }
}
