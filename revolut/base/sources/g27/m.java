package g27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139919a;

    public m(List orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f139919a = orders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f139919a, ((m) obj2).f139919a);
    }

    public final int hashCode() {
        return this.f139919a.hashCode();
    }
}
