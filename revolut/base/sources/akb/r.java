package akb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f5781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5782b;

    public r(q header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5781a = header;
        this.f5782b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f5782b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f5781a, rVar.f5781a) && Intrinsics.f(this.f5782b, rVar.f5782b);
    }

    public final int hashCode() {
        return this.f5782b.hashCode() + (this.f5781a.hashCode() * 31);
    }
}
