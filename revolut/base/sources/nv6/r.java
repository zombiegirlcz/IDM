package nv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f219530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f219531b;

    public r(q toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f219530a = toolbarState;
        this.f219531b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f219531b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f219530a, rVar.f219530a) && Intrinsics.f(this.f219531b, rVar.f219531b);
    }

    public final int hashCode() {
        return this.f219531b.hashCode() + (this.f219530a.hashCode() * 31);
    }
}
