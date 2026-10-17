package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f215939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215940c;

    public m2(String id10, Long l2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f215938a = id10;
        this.f215939b = l2;
        this.f215940c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.f215938a, m2Var.f215938a) && Intrinsics.f(this.f215939b, m2Var.f215939b) && Intrinsics.f(this.f215940c, m2Var.f215940c);
    }

    public final int hashCode() {
        int iHashCode = this.f215938a.hashCode() * 31;
        Long l2 = this.f215939b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f215940c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ m2(int i, Long l2, String str, String str2) {
        this(str, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str2);
    }
}
