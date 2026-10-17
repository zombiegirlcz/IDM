package xel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f304702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f304704c;
    public final Boolean d;

    public b(ArrayList documents, ArrayList arrayList, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f304702a = documents;
        this.f304703b = arrayList;
        this.f304704c = bool;
        this.d = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f304702a.equals(bVar.f304702a) && Intrinsics.f(this.f304703b, bVar.f304703b) && Intrinsics.f(this.f304704c, bVar.f304704c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f304702a.hashCode() * 31;
        List list = this.f304703b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f304704c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
