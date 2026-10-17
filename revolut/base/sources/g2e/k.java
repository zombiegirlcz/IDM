package g2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f140002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f140003c;
    public final String d;
    public final List e;
    public final List f;

    public k() {
        this(null, null, null, null, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f140001a, kVar.f140001a) && Intrinsics.f(this.f140002b, kVar.f140002b) && Intrinsics.f(this.f140003c, kVar.f140003c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        String str = this.f140001a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f140002b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f140003c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + p.a.d((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    public k(String str, Integer num, Integer num2, String str2, List filters, List quickFilterIds) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(quickFilterIds, "quickFilterIds");
        this.f140001a = str;
        this.f140002b = num;
        this.f140003c = num2;
        this.d = str2;
        this.e = filters;
        this.f = quickFilterIds;
    }

    public k(Integer num, Integer num2, ArrayList arrayList, List list, int i) {
        this(null, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, null, (i & 16) != 0 ? zhm.f0.f322471a : arrayList, (i & 32) != 0 ? zhm.f0.f322471a : list);
    }
}
