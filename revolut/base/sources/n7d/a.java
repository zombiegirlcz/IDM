package n7d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f213068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f213069c;

    public a(String str, List list, List list2) {
        this.f213067a = str;
        this.f213068b = list;
        this.f213069c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213067a, aVar.f213067a) && Intrinsics.f(this.f213068b, aVar.f213068b) && Intrinsics.f(this.f213069c, aVar.f213069c);
    }

    public final int hashCode() {
        String str = this.f213067a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f213068b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f213069c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
