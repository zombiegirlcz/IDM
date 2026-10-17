package bg5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15129a;

    public e(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f15129a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f15129a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f15129a, ((e) obj2).f15129a);
    }

    public final int hashCode() {
        return this.f15129a.hashCode();
    }
}
