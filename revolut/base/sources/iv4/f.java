package iv4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168716a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168716a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f168716a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f168716a, ((f) obj2).f168716a);
    }

    public final int hashCode() {
        return this.f168716a.hashCode();
    }
}
