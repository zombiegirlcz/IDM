package d28;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f110781a;

    public e(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f110781a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f110781a, ((e) obj2).f110781a);
    }

    public final int hashCode() {
        return this.f110781a.hashCode();
    }
}
