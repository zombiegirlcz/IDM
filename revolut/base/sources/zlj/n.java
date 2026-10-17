package zlj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f323297a;

    public n(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323297a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f323297a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f323297a.equals(((n) obj2).f323297a);
    }

    public final int hashCode() {
        return this.f323297a.hashCode();
    }
}
