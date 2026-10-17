package ubl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278935c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f278936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f278937h;
    public final Long i;

    public b(String id10, String state, String assetTypesJson, String str, String kycJson, Long l2, Long l3, String disclosuresJson, String infoJson) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(assetTypesJson, "assetTypesJson");
        Intrinsics.checkNotNullParameter(kycJson, "kycJson");
        Intrinsics.checkNotNullParameter(disclosuresJson, "disclosuresJson");
        Intrinsics.checkNotNullParameter(infoJson, "infoJson");
        this.f278933a = id10;
        this.f278934b = state;
        this.f278935c = assetTypesJson;
        this.d = str;
        this.e = kycJson;
        this.f = disclosuresJson;
        this.f278936g = infoJson;
        this.f278937h = l2;
        this.i = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f278933a, bVar.f278933a) && Intrinsics.f(this.f278934b, bVar.f278934b) && Intrinsics.f(this.f278935c, bVar.f278935c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f278936g, bVar.f278936g) && Intrinsics.f(this.f278937h, bVar.f278937h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f278933a.hashCode() * 31, 31, this.f278934b), 31, this.f278935c);
        String str = this.d;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f278936g);
        Long l2 = this.f278937h;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }
}
