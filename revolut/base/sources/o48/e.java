package o48;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222169a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222169a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f222169a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f222169a, ((e) obj2).f222169a);
    }

    public final int hashCode() {
        return this.f222169a.hashCode();
    }
}
