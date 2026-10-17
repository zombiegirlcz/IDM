package p3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f232748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f232749c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f232750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f232751h;
    public final Long i;

    public a(String id10, String state, String assetTypes, String str, String kyc2, Long l2, Long l3, String disclosures, String info) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(disclosures, "disclosures");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f232747a = id10;
        this.f232748b = state;
        this.f232749c = assetTypes;
        this.d = str;
        this.e = kyc2;
        this.f = disclosures;
        this.f232750g = info;
        this.f232751h = l2;
        this.i = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f232747a, aVar.f232747a) && Intrinsics.f(this.f232748b, aVar.f232748b) && Intrinsics.f(this.f232749c, aVar.f232749c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f232750g, aVar.f232750g) && Intrinsics.f(this.f232751h, aVar.f232751h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f232747a.hashCode() * 31, 31, this.f232748b), 31, this.f232749c);
        String str = this.d;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f232750g);
        Long l2 = this.f232751h;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }
}
