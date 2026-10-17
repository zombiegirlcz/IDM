package xd3;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304252a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304252a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f304252a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f304252a, ((c) obj2).f304252a);
    }

    public final int hashCode() {
        return this.f304252a.hashCode();
    }
}
