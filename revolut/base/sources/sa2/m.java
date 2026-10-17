package sa2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f261280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f261281b;

    public m(l lVar, aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f261280a = lVar;
        this.f261281b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f261281b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f261280a, mVar.f261280a) && Intrinsics.f(this.f261281b, mVar.f261281b);
    }

    public final int hashCode() {
        l lVar = this.f261280a;
        return this.f261281b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31);
    }
}
