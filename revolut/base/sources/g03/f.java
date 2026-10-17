package g03;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139265a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f139265a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f139265a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f139265a, ((f) obj2).f139265a);
    }

    public final int hashCode() {
        return this.f139265a.hashCode();
    }
}
