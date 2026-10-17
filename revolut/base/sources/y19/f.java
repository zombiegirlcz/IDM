package y19;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f310341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310342b;

    public f(dj0.d totalSaved, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(totalSaved, "totalSaved");
        this.f310341a = totalSaved;
        this.f310342b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f310341a, fVar.f310341a) && Intrinsics.f(this.f310342b, fVar.f310342b);
    }

    public final int hashCode() {
        int iHashCode = this.f310341a.hashCode() * 31;
        List list = this.f310342b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
