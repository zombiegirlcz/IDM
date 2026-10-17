package pya;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f240722a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240722a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f240722a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f240722a, ((j) obj2).f240722a);
    }

    public final int hashCode() {
        return this.f240722a.hashCode();
    }
}
