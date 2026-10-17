package x0f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f301598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f301599b;

    public r(List items, q qVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f301598a = items;
        this.f301599b = qVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f301598a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f301598a, rVar.f301598a) && Intrinsics.f(this.f301599b, rVar.f301599b);
    }

    public final int hashCode() {
        int iHashCode = this.f301598a.hashCode() * 31;
        q qVar = this.f301599b;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }
}
