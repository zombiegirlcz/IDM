package t1e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f267273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f267274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f267275c;
    public final List d;

    public v() {
        this(null, null, null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f267273a, vVar.f267273a) && Intrinsics.f(this.f267274b, vVar.f267274b) && Intrinsics.f(this.f267275c, vVar.f267275c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        Integer num = this.f267273a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f267274b;
        return this.d.hashCode() + p.a.d((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 961, 31, this.f267275c);
    }

    public v(Integer num, List filters, List quickFilterIds, int i) {
        Integer num2 = (i & 1) != 0 ? null : 10;
        num = (i & 2) != 0 ? null : num;
        filters = (i & 8) != 0 ? zhm.f0.f322471a : filters;
        quickFilterIds = (i & 16) != 0 ? zhm.f0.f322471a : quickFilterIds;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(quickFilterIds, "quickFilterIds");
        this.f267273a = num2;
        this.f267274b = num;
        this.f267275c = filters;
        this.d = quickFilterIds;
    }
}
