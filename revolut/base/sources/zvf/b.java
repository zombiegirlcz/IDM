package zvf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325675a;

    public b(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f325675a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f325675a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f325675a, ((b) obj2).f325675a);
    }

    public final int hashCode() {
        return this.f325675a.hashCode();
    }
}
