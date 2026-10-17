package pni;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237823a;

    public t(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237823a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f237823a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f237823a, ((t) obj2).f237823a);
    }

    public final int hashCode() {
        return this.f237823a.hashCode();
    }
}
