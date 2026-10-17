package sai;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261414a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f261414a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f261414a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f261414a, ((i) obj2).f261414a);
    }

    public final int hashCode() {
        return this.f261414a.hashCode();
    }
}
