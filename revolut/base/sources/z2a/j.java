package z2a;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f319047b;

    public j(List items, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319046a = items;
        this.f319047b = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f319046a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f319046a, jVar.f319046a) && Intrinsics.f(this.f319047b, jVar.f319047b);
    }

    public final int hashCode() {
        int iHashCode = this.f319046a.hashCode() * 31;
        Integer num = this.f319047b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
