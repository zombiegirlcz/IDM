package byk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f19849c;
    public final Boolean d;
    public final List e;

    public b(Integer num, List list, Boolean bool, Boolean bool2, List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f19847a = num;
        this.f19848b = list;
        this.f19849c = bool;
        this.d = bool2;
        this.e = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f19847a, bVar.f19847a) && Intrinsics.f(this.f19848b, bVar.f19848b) && Intrinsics.f(this.f19849c, bVar.f19849c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        Integer num = this.f19847a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f19848b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f19849c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
