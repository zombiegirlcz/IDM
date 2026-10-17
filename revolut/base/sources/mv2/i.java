package mv2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f209104b;

    public i(List items, h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f209103a = items;
        this.f209104b = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f209103a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f209103a, iVar.f209103a) && Intrinsics.f(this.f209104b, iVar.f209104b);
    }

    public final int hashCode() {
        int iHashCode = this.f209103a.hashCode() * 31;
        h hVar = this.f209104b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
