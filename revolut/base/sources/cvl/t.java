package cvl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f109504b;

    public t(List items, s sVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109503a = items;
        this.f109504b = sVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f109503a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f109503a, tVar.f109503a) && Intrinsics.f(this.f109504b, tVar.f109504b);
    }

    public final int hashCode() {
        int iHashCode = this.f109503a.hashCode() * 31;
        s sVar = this.f109504b;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }
}
