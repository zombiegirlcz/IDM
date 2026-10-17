package v0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284826c;
    public final String d;
    public final t61.j e;
    public final t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final do3.n f284827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yte.a f284828h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f284829j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f284830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f284831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f284832n;

    public u(String cardNumber, String expireDate, String cvv, String postcode, t61.j jVar, t currentFocus, do3.n nVar, yte.a cardInfoInputMode, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(currentFocus, "currentFocus");
        Intrinsics.checkNotNullParameter(cardInfoInputMode, "cardInfoInputMode");
        this.f284824a = cardNumber;
        this.f284825b = expireDate;
        this.f284826c = cvv;
        this.d = postcode;
        this.e = jVar;
        this.f = currentFocus;
        this.f284827g = nVar;
        this.f284828h = cardInfoInputMode;
        this.i = z;
        this.f284829j = z3;
        this.k = z4;
        this.f284830l = z6;
        this.f284831m = z11;
        this.f284832n = z12;
    }

    public static u a(u uVar, String str, String str2, String str3, String str4, t61.j jVar, t tVar, do3.n nVar, yte.a aVar, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, int i) {
        String cardNumber = (i & 1) != 0 ? uVar.f284824a : str;
        String expireDate = (i & 2) != 0 ? uVar.f284825b : str2;
        String cvv = (i & 4) != 0 ? uVar.f284826c : str3;
        String postcode = (i & 8) != 0 ? uVar.d : str4;
        t61.j jVar2 = (i & 16) != 0 ? uVar.e : jVar;
        t currentFocus = (i & 32) != 0 ? uVar.f : tVar;
        do3.n nVar2 = (i & 64) != 0 ? uVar.f284827g : nVar;
        yte.a cardInfoInputMode = (i & 128) != 0 ? uVar.f284828h : aVar;
        boolean z29 = (i & 256) != 0 ? uVar.i : z;
        boolean z31 = (i & 512) != 0 ? uVar.f284829j : z3;
        boolean z41 = (i & 1024) != 0 ? uVar.k : z4;
        boolean z49 = (i & 2048) != 0 ? uVar.f284830l : z6;
        boolean z54 = (i & 4096) != 0 ? uVar.f284831m : z11;
        boolean z74 = (i & 8192) != 0 ? uVar.f284832n : z12;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(currentFocus, "currentFocus");
        Intrinsics.checkNotNullParameter(cardInfoInputMode, "cardInfoInputMode");
        return new u(cardNumber, expireDate, cvv, postcode, jVar2, currentFocus, nVar2, cardInfoInputMode, z29, z31, z41, z49, z54, z74);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f284824a, uVar.f284824a) && Intrinsics.f(this.f284825b, uVar.f284825b) && Intrinsics.f(this.f284826c, uVar.f284826c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f && Intrinsics.f(this.f284827g, uVar.f284827g) && this.f284828h == uVar.f284828h && this.i == uVar.i && this.f284829j == uVar.f284829j && this.k == uVar.k && this.f284830l == uVar.f284830l && this.f284831m == uVar.f284831m && this.f284832n == uVar.f284832n;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f284824a.hashCode() * 31, 31, this.f284825b), 31, this.f284826c), 31, this.d);
        t61.j jVar = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        do3.n nVar = this.f284827g;
        return Boolean.hashCode(this.f284832n) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f284828h.hashCode() + ((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 31)) * 31, 31, this.i), 31, this.f284829j), 31, this.k), 31, this.f284830l), 31, this.f284831m);
    }
}
