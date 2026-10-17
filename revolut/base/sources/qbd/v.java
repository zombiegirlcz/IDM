package qbd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244210c;
    public final String d;
    public final String e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f244211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f244212h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f244213j;
    public final jo3.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f244214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f244215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f244216n;
    public final e0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f244217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f244218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jo3.a f244219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f244220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f244221t;

    public /* synthetic */ v(int i, String str, String str2, String str3, String str4, String str5, l lVar, String str6, long j2, Long l2, Long l3, jo3.a aVar, String str7, String str8, String str9, e0 e0Var, String str10, String str11, jo3.a aVar2, r rVar, u uVar) {
        if (131071 != (i & 131071)) {
            j1.f(h.f244187a.getDescriptor(), i, 131071);
            throw null;
        }
        this.f244208a = str;
        this.f244209b = str2;
        this.f244210c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lVar;
        this.f244211g = str6;
        this.f244212h = j2;
        this.i = l2;
        this.f244213j = l3;
        this.k = aVar;
        this.f244214l = str7;
        this.f244215m = str8;
        this.f244216n = str9;
        this.o = e0Var;
        this.f244217p = str10;
        this.f244218q = str11;
        if ((131072 & i) == 0) {
            this.f244219r = null;
        } else {
            this.f244219r = aVar2;
        }
        if ((262144 & i) == 0) {
            this.f244220s = null;
        } else {
            this.f244220s = rVar;
        }
        if ((i & 524288) == 0) {
            this.f244221t = null;
        } else {
            this.f244221t = uVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f244208a, vVar.f244208a) && Intrinsics.f(this.f244209b, vVar.f244209b) && Intrinsics.f(this.f244210c, vVar.f244210c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f244211g, vVar.f244211g) && this.f244212h == vVar.f244212h && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f244213j, vVar.f244213j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f244214l, vVar.f244214l) && Intrinsics.f(this.f244215m, vVar.f244215m) && Intrinsics.f(this.f244216n, vVar.f244216n) && Intrinsics.f(this.o, vVar.o) && Intrinsics.f(this.f244217p, vVar.f244217p) && Intrinsics.f(this.f244218q, vVar.f244218q) && Intrinsics.f(this.f244219r, vVar.f244219r) && Intrinsics.f(this.f244220s, vVar.f244220s) && Intrinsics.f(this.f244221t, vVar.f244221t);
    }

    public final int hashCode() {
        int iHashCode = this.f244208a.hashCode() * 31;
        String str = this.f244209b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f244210c;
        int iC = p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        l lVar = this.f;
        int iC2 = a0.d.c(p.a.c((iC + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f244211g), 31, this.f244212h);
        Long l2 = this.i;
        int iHashCode3 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f244213j;
        int iC3 = p.a.c(p.a.c(v7.j(this.k, (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31), 31, this.f244214l), 31, this.f244215m);
        String str3 = this.f244216n;
        int iHashCode4 = (this.o.hashCode() + ((iC3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f244217p;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f244218q;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        jo3.a aVar = this.f244219r;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        r rVar = this.f244220s;
        int iHashCode8 = (iHashCode7 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        u uVar = this.f244221t;
        return iHashCode8 + (uVar != null ? uVar.hashCode() : 0);
    }

    public v(String id10, String str, String str2, String name, String state, l lVar, String productId, long j2, Long l2, Long l3, jo3.a balance, String ownerId, String ownerAccountType, String str3, e0 displayRate, String str4, String str5, jo3.a aVar, r rVar, u uVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(ownerAccountType, "ownerAccountType");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        this.f244208a = id10;
        this.f244209b = str;
        this.f244210c = str2;
        this.d = name;
        this.e = state;
        this.f = lVar;
        this.f244211g = productId;
        this.f244212h = j2;
        this.i = l2;
        this.f244213j = l3;
        this.k = balance;
        this.f244214l = ownerId;
        this.f244215m = ownerAccountType;
        this.f244216n = str3;
        this.o = displayRate;
        this.f244217p = str4;
        this.f244218q = str5;
        this.f244219r = aVar;
        this.f244220s = rVar;
        this.f244221t = uVar;
    }
}
