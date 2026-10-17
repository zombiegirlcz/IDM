package hp3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154429c;

    public p(int i, int i2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154427a = i;
        this.f154428b = i2;
        this.f154429c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f154427a == pVar.f154427a && this.f154428b == pVar.f154428b && Intrinsics.f(this.f154429c, pVar.f154429c);
    }

    public final int hashCode() {
        return this.f154429c.hashCode() + j6.a.b(this.f154428b, Integer.hashCode(this.f154427a) * 31, 31);
    }
}
