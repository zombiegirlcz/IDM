package u8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f278169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f278170c;

    public c(String str, List list, List list2) {
        this.f278168a = str;
        this.f278169b = list;
        this.f278170c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f278168a, cVar.f278168a) && Intrinsics.f(this.f278169b, cVar.f278169b) && Intrinsics.f(this.f278170c, cVar.f278170c);
    }

    public final int hashCode() {
        String str = this.f278168a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f278169b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f278170c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
