package zk7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322914a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f322914a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f322914a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f322914a, ((f) obj2).f322914a);
    }

    public final int hashCode() {
        return this.f322914a.hashCode();
    }
}
