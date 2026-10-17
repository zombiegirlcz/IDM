package ymf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314976a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f314976a, ((d) obj2).f314976a);
    }

    public final int hashCode() {
        return this.f314976a.hashCode();
    }

    public d(List receipts) {
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        this.f314976a = receipts;
    }

    public d(int i) {
        this(f0.f322471a);
    }
}
