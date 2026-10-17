package mu4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208956a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208956a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f208956a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f208956a, ((f) obj2).f208956a);
    }

    public final int hashCode() {
        return this.f208956a.hashCode();
    }
}
