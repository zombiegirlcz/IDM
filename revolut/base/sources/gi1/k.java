package gi1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1.h f144028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddressFormat f144029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address.Type f144030c;
    public final String d;
    public final boolean e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f144031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f144032h;
    public final wi1.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f144033j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f144034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f144035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sh1.l f144036n;
    public final mi1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sh1.n f144037p;

    public k(sh1.h addressFields, AddressFormat addressFormat, Address.Type type, String fullAddress, boolean z, Clause clause, Clause clause2, LinkedHashMap configuration, wi1.a addressInputType, boolean z3, j jVar, boolean z4, boolean z6, sh1.l strings, mi1.a permissionRequestStatus, sh1.n nVar) {
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        Intrinsics.checkNotNullParameter(addressFormat, "addressFormat");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(addressInputType, "addressInputType");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(permissionRequestStatus, "permissionRequestStatus");
        this.f144028a = addressFields;
        this.f144029b = addressFormat;
        this.f144030c = type;
        this.d = fullAddress;
        this.e = z;
        this.f = clause;
        this.f144031g = clause2;
        this.f144032h = configuration;
        this.i = addressInputType;
        this.f144033j = z3;
        this.k = jVar;
        this.f144034l = z4;
        this.f144035m = z6;
        this.f144036n = strings;
        this.o = permissionRequestStatus;
        this.f144037p = nVar;
    }

    public static k a(k kVar, sh1.h hVar, AddressFormat addressFormat, Address.Type type, String str, boolean z, LinkedHashMap linkedHashMap, wi1.a aVar, j jVar, sh1.l lVar, mi1.a aVar2, sh1.n nVar, int i) {
        sh1.h addressFields = (i & 1) != 0 ? kVar.f144028a : hVar;
        AddressFormat addressFormat2 = (i & 2) != 0 ? kVar.f144029b : addressFormat;
        Address.Type type2 = (i & 4) != 0 ? kVar.f144030c : type;
        String fullAddress = (i & 8) != 0 ? kVar.d : str;
        boolean z3 = (i & 16) != 0 ? kVar.e : z;
        Clause clause = kVar.f;
        Clause clause2 = kVar.f144031g;
        LinkedHashMap configuration = (i & 128) != 0 ? kVar.f144032h : linkedHashMap;
        wi1.a addressInputType = (i & 256) != 0 ? kVar.i : aVar;
        boolean z4 = kVar.f144033j;
        j jVar2 = (i & 1024) != 0 ? kVar.k : jVar;
        boolean z6 = kVar.f144034l;
        boolean z11 = kVar.f144035m;
        sh1.l strings = (i & 8192) != 0 ? kVar.f144036n : lVar;
        mi1.a permissionRequestStatus = (i & 16384) != 0 ? kVar.o : aVar2;
        sh1.n nVar2 = (i & 32768) != 0 ? kVar.f144037p : nVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        Intrinsics.checkNotNullParameter(addressFormat2, "addressFormat");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(addressInputType, "addressInputType");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(permissionRequestStatus, "permissionRequestStatus");
        return new k(addressFields, addressFormat2, type2, fullAddress, z3, clause, clause2, configuration, addressInputType, z4, jVar2, z6, z11, strings, permissionRequestStatus, nVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f144028a, kVar.f144028a) && this.f144029b == kVar.f144029b && this.f144030c == kVar.f144030c && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f144031g, kVar.f144031g) && Intrinsics.f(this.f144032h, kVar.f144032h) && this.i == kVar.i && this.f144033j == kVar.f144033j && Intrinsics.f(this.k, kVar.k) && this.f144034l == kVar.f144034l && this.f144035m == kVar.f144035m && Intrinsics.f(this.f144036n, kVar.f144036n) && this.o == kVar.o && Intrinsics.f(this.f144037p, kVar.f144037p);
    }

    public final int hashCode() {
        int iHashCode = (this.f144029b.hashCode() + (this.f144028a.hashCode() * 31)) * 31;
        Address.Type type = this.f144030c;
        int iC = j6.a.c(p.a.c((iHashCode + (type == null ? 0 : type.hashCode())) * 31, 31, this.d), 31, this.e);
        Clause clause = this.f;
        int iHashCode2 = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f144031g;
        int iC2 = j6.a.c((this.i.hashCode() + r6.b.e(this.f144032h, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31)) * 31, 31, this.f144033j);
        j jVar = this.k;
        int iHashCode3 = (this.o.hashCode() + ((this.f144036n.hashCode() + j6.a.c(j6.a.c((iC2 + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f144034l), 31, this.f144035m)) * 31)) * 31;
        sh1.n nVar = this.f144037p;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }
}
