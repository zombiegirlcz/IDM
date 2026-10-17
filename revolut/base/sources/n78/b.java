package n78;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f213031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f213032c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f213033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f213034h;

    public b(String juniorId, List cards, boolean z, String juniorFirstName, String juniorWalletId, boolean z3, boolean z4, List physicalCardDesigns) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(juniorWalletId, "juniorWalletId");
        Intrinsics.checkNotNullParameter(physicalCardDesigns, "physicalCardDesigns");
        this.f213030a = juniorId;
        this.f213031b = cards;
        this.f213032c = z;
        this.d = juniorFirstName;
        this.e = juniorWalletId;
        this.f = z3;
        this.f213033g = z4;
        this.f213034h = physicalCardDesigns;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f213030a, bVar.f213030a) && Intrinsics.f(this.f213031b, bVar.f213031b) && this.f213032c == bVar.f213032c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && this.f213033g == bVar.f213033g && Intrinsics.f(this.f213034h, bVar.f213034h);
    }

    public final int hashCode() {
        return this.f213034h.hashCode() + j6.a.c(j6.a.c(p.a.c(p.a.c(j6.a.c(p.a.d(this.f213030a.hashCode() * 31, 31, this.f213031b), 31, this.f213032c), 31, this.d), 31, this.e), 31, this.f), 31, this.f213033g);
    }
}
