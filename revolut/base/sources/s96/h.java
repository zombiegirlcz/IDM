package s96;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f261122b;

    public h(ArrayList arrayList, g gVar) {
        this.f261121a = arrayList;
        this.f261122b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f261121a, hVar.f261121a) && Intrinsics.f(this.f261122b, hVar.f261122b);
    }

    public final int hashCode() {
        List list = this.f261121a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        g gVar = this.f261122b;
        return iHashCode + (gVar != null ? gVar.f261120a.hashCode() : 0);
    }
}
