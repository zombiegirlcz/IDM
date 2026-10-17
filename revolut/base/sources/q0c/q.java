package q0c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f241243c;
    public final List d;
    public final String e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f241244g;

    public q(List items, String str, boolean z, List monthTabs, String str2, Integer num, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(monthTabs, "monthTabs");
        this.f241241a = items;
        this.f241242b = str;
        this.f241243c = z;
        this.d = monthTabs;
        this.e = str2;
        this.f = num;
        this.f241244g = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f241241a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f241241a, qVar.f241241a) && Intrinsics.f(this.f241242b, qVar.f241242b) && this.f241243c == qVar.f241243c && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && this.f241244g == qVar.f241244g;
    }

    public final int hashCode() {
        int iHashCode = this.f241241a.hashCode() * 31;
        String str = this.f241242b;
        int iD = p.a.d(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f241243c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return Boolean.hashCode(this.f241244g) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
