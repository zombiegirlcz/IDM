package uug;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283234a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283234a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f283234a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f283234a, ((i) obj2).f283234a);
    }

    public final int hashCode() {
        return this.f283234a.hashCode();
    }
}
