package l92;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.p f193025b;

    public b(List enrollments, whf.p pVar) {
        Intrinsics.checkNotNullParameter(enrollments, "enrollments");
        this.f193024a = enrollments;
        this.f193025b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f193024a, bVar.f193024a) && Intrinsics.f(this.f193025b, bVar.f193025b);
    }

    public final int hashCode() {
        int iHashCode = this.f193024a.hashCode() * 31;
        whf.p pVar = this.f193025b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
