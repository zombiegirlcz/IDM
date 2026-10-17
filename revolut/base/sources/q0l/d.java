package q0l;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241302a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f241302a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f241302a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f241302a, ((d) obj2).f241302a);
    }

    public final int hashCode() {
        return this.f241302a.hashCode();
    }
}
