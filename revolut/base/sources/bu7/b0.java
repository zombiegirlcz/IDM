package bu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy[] f18692p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.a f18694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18695c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f18696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f18697h;
    public final x0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f18698j;
    public final com.revolut.feature.insurance_embedded.api.models.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f18699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f18700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f18701n;
    public final n o;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f18692p = new Lazy[]{null, yhm.j.c(kVar, new br4.e(27)), null, null, null, yhm.j.c(kVar, new br4.e(28)), yhm.j.c(kVar, new br4.e(29)), yhm.j.c(kVar, new y(0)), null, yhm.j.c(kVar, new y(1)), null, yhm.j.c(kVar, new y(2)), null, null, null};
    }

    public /* synthetic */ b0(int i, String str, dl7.a aVar, String str2, String str3, String str4, List list, List list2, List list3, x0 x0Var, List list4, com.revolut.feature.insurance_embedded.api.models.b bVar, List list5, u uVar, c cVar, n nVar) {
        if (32767 != (i & 32767)) {
            j1.f(z.f18751a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f18693a = str;
        this.f18694b = aVar;
        this.f18695c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.f18696g = list2;
        this.f18697h = list3;
        this.i = x0Var;
        this.f18698j = list4;
        this.k = bVar;
        this.f18699l = list5;
        this.f18700m = uVar;
        this.f18701n = cVar;
        this.o = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f18693a, b0Var.f18693a) && this.f18694b == b0Var.f18694b && Intrinsics.f(this.f18695c, b0Var.f18695c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f18696g, b0Var.f18696g) && Intrinsics.f(this.f18697h, b0Var.f18697h) && Intrinsics.f(this.i, b0Var.i) && Intrinsics.f(this.f18698j, b0Var.f18698j) && Intrinsics.f(this.k, b0Var.k) && Intrinsics.f(this.f18699l, b0Var.f18699l) && Intrinsics.f(this.f18700m, b0Var.f18700m) && Intrinsics.f(this.f18701n, b0Var.f18701n) && Intrinsics.f(this.o, b0Var.o);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f18694b.hashCode() + (this.f18693a.hashCode() * 31)) * 31, 31, this.f18695c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (this.f18700m.hashCode() + p.a.d((this.k.hashCode() + p.a.d((this.i.hashCode() + p.a.d(p.a.d(p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.f18696g), 31, this.f18697h)) * 31, 31, this.f18698j)) * 31, 31, this.f18699l)) * 31;
        c cVar = this.f18701n;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        n nVar = this.o;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    public b0(String id10, dl7.a subtype, String name, String str, String str2, ArrayList summary, ArrayList restrictions, ArrayList coverage, x0 provider, ArrayList contactsGroup, com.revolut.feature.insurance_embedded.api.models.b documents, List suitabilityStatement, u claimsInfo, c cVar, n nVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(contactsGroup, "contactsGroup");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(suitabilityStatement, "suitabilityStatement");
        Intrinsics.checkNotNullParameter(claimsInfo, "claimsInfo");
        this.f18693a = id10;
        this.f18694b = subtype;
        this.f18695c = name;
        this.d = str;
        this.e = str2;
        this.f = summary;
        this.f18696g = restrictions;
        this.f18697h = coverage;
        this.i = provider;
        this.f18698j = contactsGroup;
        this.k = documents;
        this.f18699l = suitabilityStatement;
        this.f18700m = claimsInfo;
        this.f18701n = cVar;
        this.o = nVar;
    }
}
