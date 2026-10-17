package fn3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f136518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136520c;
    public final ArrayList d;
    public final String e;

    public a(Map filtersWithItemsCount, ArrayList recipientsList, List recentsList, ArrayList extrasList, String str) {
        Intrinsics.checkNotNullParameter(filtersWithItemsCount, "filtersWithItemsCount");
        Intrinsics.checkNotNullParameter(recipientsList, "recipientsList");
        Intrinsics.checkNotNullParameter(recentsList, "recentsList");
        Intrinsics.checkNotNullParameter(extrasList, "extrasList");
        this.f136518a = filtersWithItemsCount;
        this.f136519b = recipientsList;
        this.f136520c = recentsList;
        this.d = extrasList;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136518a, aVar.f136518a) && this.f136519b.equals(aVar.f136519b) && Intrinsics.f(this.f136520c, aVar.f136520c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f136519b, this.f136518a.hashCode() * 31, 31), 31, this.f136520c), 31);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
