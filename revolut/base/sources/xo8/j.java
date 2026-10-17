package xo8;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f307708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final psg.a f307709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307710c;
    public final h d;
    public final oc8.c e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f307711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f307712h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f307713j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f307714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f307715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProductAccountId f307716n;

    public j(Data juniorProfile, psg.a aVar, boolean z, h hVar, oc8.c cardControlsState, Map juniorConsents, String str, boolean z3, boolean z4, boolean z6, boolean z11, Data juniorKyc, Data pocket, ProductAccountId productAccountId) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(cardControlsState, "cardControlsState");
        Intrinsics.checkNotNullParameter(juniorConsents, "juniorConsents");
        Intrinsics.checkNotNullParameter(juniorKyc, "juniorKyc");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f307708a = juniorProfile;
        this.f307709b = aVar;
        this.f307710c = z;
        this.d = hVar;
        this.e = cardControlsState;
        this.f = juniorConsents;
        this.f307711g = str;
        this.f307712h = z3;
        this.i = z4;
        this.f307713j = z6;
        this.k = z11;
        this.f307714l = juniorKyc;
        this.f307715m = pocket;
        this.f307716n = productAccountId;
    }

    public static j a(j jVar, Data data, psg.a aVar, boolean z, h hVar, oc8.c cVar, Map map, String str, boolean z3, boolean z4, boolean z6, boolean z11, Data data2, Data data3, ProductAccountId productAccountId, int i) {
        Data juniorProfile = (i & 1) != 0 ? jVar.f307708a : data;
        psg.a aVar2 = (i & 2) != 0 ? jVar.f307709b : aVar;
        boolean z12 = (i & 4) != 0 ? jVar.f307710c : z;
        h hVar2 = (i & 8) != 0 ? jVar.d : hVar;
        oc8.c cardControlsState = (i & 16) != 0 ? jVar.e : cVar;
        Map juniorConsents = (i & 32) != 0 ? jVar.f : map;
        String str2 = (i & 64) != 0 ? jVar.f307711g : str;
        boolean z29 = (i & 128) != 0 ? jVar.f307712h : z3;
        boolean z31 = (i & 256) != 0 ? jVar.i : z4;
        boolean z41 = (i & 512) != 0 ? jVar.f307713j : z6;
        boolean z49 = (i & 1024) != 0 ? jVar.k : z11;
        Data juniorKyc = (i & 2048) != 0 ? jVar.f307714l : data2;
        Data pocket = (i & 4096) != 0 ? jVar.f307715m : data3;
        ProductAccountId productAccountId2 = (i & 8192) != 0 ? jVar.f307716n : productAccountId;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(cardControlsState, "cardControlsState");
        Intrinsics.checkNotNullParameter(juniorConsents, "juniorConsents");
        Intrinsics.checkNotNullParameter(juniorKyc, "juniorKyc");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        return new j(juniorProfile, aVar2, z12, hVar2, cardControlsState, juniorConsents, str2, z29, z31, z41, z49, juniorKyc, pocket, productAccountId2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f307708a, jVar.f307708a) && Intrinsics.f(this.f307709b, jVar.f307709b) && this.f307710c == jVar.f307710c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f307711g, jVar.f307711g) && this.f307712h == jVar.f307712h && this.i == jVar.i && this.f307713j == jVar.f307713j && this.k == jVar.k && Intrinsics.f(this.f307714l, jVar.f307714l) && Intrinsics.f(this.f307715m, jVar.f307715m) && Intrinsics.f(this.f307716n, jVar.f307716n);
    }

    public final int hashCode() {
        int iHashCode = this.f307708a.hashCode() * 31;
        psg.a aVar = this.f307709b;
        int iC = j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f307710c);
        h hVar = this.d;
        int iE = p.a.e((this.e.hashCode() + ((iC + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31, 31, this.f);
        String str = this.f307711g;
        int iC2 = kii.e.c(this.f307715m, kii.e.c(this.f307714l, j6.a.c(j6.a.c(j6.a.c(j6.a.c((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f307712h), 31, this.i), 31, this.f307713j), 31, this.k), 31), 31);
        ProductAccountId productAccountId = this.f307716n;
        return iC2 + (productAccountId != null ? productAccountId.hashCode() : 0);
    }
}
