package ra3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f252780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f252781c;
    public final List d;

    public b(List toBeDelivered, List singleUseVirtual, List multiUseVirtual, List delivered) {
        Intrinsics.checkNotNullParameter(toBeDelivered, "toBeDelivered");
        Intrinsics.checkNotNullParameter(singleUseVirtual, "singleUseVirtual");
        Intrinsics.checkNotNullParameter(multiUseVirtual, "multiUseVirtual");
        Intrinsics.checkNotNullParameter(delivered, "delivered");
        this.f252779a = toBeDelivered;
        this.f252780b = singleUseVirtual;
        this.f252781c = multiUseVirtual;
        this.d = delivered;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f252779a, bVar.f252779a) && Intrinsics.f(this.f252780b, bVar.f252780b) && Intrinsics.f(this.f252781c, bVar.f252781c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f252779a.hashCode() * 31, 31, this.f252780b), 31, this.f252781c);
    }
}
