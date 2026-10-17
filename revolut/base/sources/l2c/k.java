package l2c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f191748b;

    public k(List items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f191747a = items;
        this.f191748b = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f191747a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f191747a, kVar.f191747a) && Intrinsics.f(this.f191748b, kVar.f191748b);
    }

    public final int hashCode() {
        int iHashCode = this.f191747a.hashCode() * 31;
        aw0.i iVar = this.f191748b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
