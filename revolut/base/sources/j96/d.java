package j96;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172297b;

    public d(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172296a = items;
        this.f172297b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f172296a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f172296a, dVar.f172296a) && this.f172297b == dVar.f172297b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172297b) + (this.f172296a.hashCode() * 31);
    }
}
