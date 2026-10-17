package c69;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21738a;

    public t(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f21738a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f21738a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f21738a, ((t) obj2).f21738a);
    }

    public final int hashCode() {
        return this.f21738a.hashCode();
    }
}
