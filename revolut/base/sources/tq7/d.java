package tq7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273533a;

    public d(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f273533a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f273533a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f273533a, ((d) obj2).f273533a);
    }

    public final int hashCode() {
        return this.f273533a.hashCode();
    }
}
