package t1e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f267269c;
    public final Integer d;

    public o() {
        this(15, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f267267a, oVar.f267267a) && Intrinsics.f(this.f267268b, oVar.f267268b) && Intrinsics.f(this.f267269c, oVar.f267269c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f267267a.hashCode() * 31;
        String str = this.f267268b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f267269c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public o(int i, Integer num, Integer num2, String str, List filter) {
        filter = (i & 1) != 0 ? zhm.f0.f322471a : filter;
        str = (i & 2) != 0 ? null : str;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f267267a = filter;
        this.f267268b = str;
        this.f267269c = num;
        this.d = num2;
    }
}
