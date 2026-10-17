package av5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f9917c;

    public f(List filters, List list, i type) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter("", "searchQuery");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f9915a = filters;
        this.f9916b = list;
        this.f9917c = type;
    }

    public static f a(f fVar, ArrayList arrayList, ArrayList arrayList2, int i) {
        List filters = arrayList;
        if ((i & 1) != 0) {
            filters = fVar.f9915a;
        }
        fVar.getClass();
        i type = fVar.f9917c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter("", "searchQuery");
        Intrinsics.checkNotNullParameter(type, "type");
        return new f(filters, arrayList2, type);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f9915a, fVar.f9915a) && Intrinsics.f(this.f9916b, fVar.f9916b) && this.f9917c == fVar.f9917c;
    }

    public final int hashCode() {
        int iHashCode = this.f9915a.hashCode() * 31;
        List list = this.f9916b;
        return this.f9917c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 961);
    }
}
