package ec6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124451a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124451a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f124451a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f124451a, ((j) obj2).f124451a);
    }

    public final int hashCode() {
        return this.f124451a.hashCode();
    }
}
