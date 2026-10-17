package tna;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272349a;

    public n(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f272349a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f272349a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f272349a, ((n) obj2).f272349a);
    }

    public final int hashCode() {
        return this.f272349a.hashCode();
    }
}
