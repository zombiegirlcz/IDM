package qw2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249758a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249758a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f249758a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f249758a, ((m) obj2).f249758a);
    }

    public final int hashCode() {
        return this.f249758a.hashCode();
    }
}
