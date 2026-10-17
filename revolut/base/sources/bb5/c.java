package bb5;

import dj0.d;
import ft3.j1;
import it3.k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f14164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14165c;
    public final String d;
    public final d e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14167h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f14168j;

    public c(String str, j1 productType, String title, String description, d dVar, a status, boolean z, String str2, b bVar, k kVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f14163a = str;
        this.f14164b = productType;
        this.f14165c = title;
        this.d = description;
        this.e = dVar;
        this.f = status;
        this.f14166g = z;
        this.f14167h = str2;
        this.i = bVar;
        this.f14168j = kVar;
    }

    public static c a(c cVar, String str) {
        String str2 = cVar.f14163a;
        j1 productType = cVar.f14164b;
        String title = cVar.f14165c;
        String description = cVar.d;
        d dVar = cVar.e;
        a status = cVar.f;
        boolean z = cVar.f14166g;
        b bVar = cVar.i;
        k kVar = cVar.f14168j;
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        return new c(str2, productType, title, description, dVar, status, z, str, bVar, kVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f14163a, cVar.f14163a) && this.f14164b == cVar.f14164b && Intrinsics.f(this.f14165c, cVar.f14165c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && this.f14166g == cVar.f14166g && Intrinsics.f(this.f14167h, cVar.f14167h) && Intrinsics.f(this.i, cVar.i) && this.f14168j == cVar.f14168j;
    }

    public final int hashCode() {
        String str = this.f14163a;
        int iC = p.a.c(p.a.c((this.f14164b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f14165c), 31, this.d);
        d dVar = this.e;
        int iC2 = j6.a.c((this.f.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31, this.f14166g);
        String str2 = this.f14167h;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.i;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        k kVar = this.f14168j;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
