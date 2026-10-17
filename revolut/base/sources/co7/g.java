package co7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25494a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25494a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f25494a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f25494a, ((g) obj2).f25494a);
    }

    public final int hashCode() {
        return this.f25494a.hashCode();
    }
}
