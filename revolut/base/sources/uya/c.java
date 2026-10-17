package uya;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f284121a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f284121a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f284121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f284121a, ((c) obj2).f284121a);
    }

    public final int hashCode() {
        return this.f284121a.hashCode();
    }
}
