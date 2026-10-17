package mgd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f205263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f205264c;
    public final List d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f205265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f205266h;

    public g(List assetTypeKeys, List alertStates, List list, List list2, Integer num, Integer num2, boolean z, List list3) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(alertStates, "alertStates");
        this.f205262a = assetTypeKeys;
        this.f205263b = alertStates;
        this.f205264c = list;
        this.d = list2;
        this.e = num;
        this.f = num2;
        this.f205265g = z;
        this.f205266h = list3;
    }

    public final List a() {
        return this.f205263b;
    }

    public final List b() {
        return this.f205266h;
    }

    public final List c() {
        return this.f205262a;
    }

    public final List d() {
        return this.f205264c;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205262a, gVar.f205262a) && Intrinsics.f(this.f205263b, gVar.f205263b) && Intrinsics.f(this.f205264c, gVar.f205264c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f205265g == gVar.f205265g && Intrinsics.f(this.f205266h, gVar.f205266h);
    }

    public final Integer f() {
        return this.f;
    }

    public final List g() {
        return this.d;
    }

    public final boolean h() {
        return this.f205265g;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f205262a.hashCode() * 31, 31, this.f205263b);
        List list = this.f205264c;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iC = j6.a.c((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f205265g);
        List list3 = this.f205266h;
        return iC + (list3 != null ? list3.hashCode() : 0);
    }

    public /* synthetic */ g(List list, List list2, List list3, List list4, Integer num, boolean z, List list5, int i) {
        this(list, list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : num, (Integer) null, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : list5);
    }
}
