package qk4;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f246965a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f246965a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f246965a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f246965a, ((d) obj2).f246965a);
    }

    public final int hashCode() {
        return this.f246965a.hashCode();
    }
}
