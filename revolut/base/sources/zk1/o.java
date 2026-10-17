package zk1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322898a;

    public o(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f322898a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f322898a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f322898a, ((o) obj2).f322898a);
    }

    public final int hashCode() {
        return this.f322898a.hashCode();
    }
}
