package pcd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f234877c;
    public final String d;
    public final long e;
    public final Long f;

    public p(String id10, String str, String name, String currency, long j2, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f234875a = id10;
        this.f234876b = str;
        this.f234877c = name;
        this.d = currency;
        this.e = j2;
        this.f = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f234875a, pVar.f234875a) && Intrinsics.f(this.f234876b, pVar.f234876b) && Intrinsics.f(this.f234877c, pVar.f234877c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f234875a.hashCode() * 31;
        String str = this.f234876b;
        int iC = a0.d.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f234877c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        return iC + (l2 != null ? l2.hashCode() : 0);
    }
}
