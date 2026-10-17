package d7a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f111906b;

    public m(aim.e items, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111905a = items;
        this.f111906b = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f111905a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f111905a, mVar.f111905a) && Intrinsics.f(this.f111906b, mVar.f111906b);
    }

    public final int hashCode() {
        int iHashCode = this.f111905a.hashCode() * 31;
        aw0.i iVar = this.f111906b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
