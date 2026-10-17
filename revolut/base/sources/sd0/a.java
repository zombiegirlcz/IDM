package sd0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f261780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f261781b;

    public a(ArrayList currencies, List list) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f261780a = currencies;
        this.f261781b = list;
    }

    public final List a() {
        return this.f261780a;
    }

    public final List b() {
        return this.f261781b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f261780a.equals(aVar.f261780a) && Intrinsics.f(this.f261781b, aVar.f261781b);
    }

    public final int hashCode() {
        int iHashCode = this.f261780a.hashCode() * 31;
        List list = this.f261781b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
