package dwf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f120381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f120382b;

    public i(List items, g gVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120381a = items;
        this.f120382b = gVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f120381a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f120381a, iVar.f120381a) && Intrinsics.f(this.f120382b, iVar.f120382b);
    }

    public final int hashCode() {
        int iHashCode = this.f120381a.hashCode() * 31;
        g gVar = this.f120382b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
