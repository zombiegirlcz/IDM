package wp3;

import dx4.d1;
import ft3.j1;
import it3.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f299021c;
    public final gt3.f d;
    public final k e;
    public final d1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dx4.j1 f299022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f299023h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f299024j;

    public e(String title, String description, j1 productType, gt3.f fVar, k kVar, d1 image, dx4.j1 j1Var, String str, List tags, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f299019a = title;
        this.f299020b = description;
        this.f299021c = productType;
        this.d = fVar;
        this.e = kVar;
        this.f = image;
        this.f299022g = j1Var;
        this.f299023h = str;
        this.i = tags;
        this.f299024j = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f299019a, eVar.f299019a) && Intrinsics.f(this.f299020b, eVar.f299020b) && this.f299021c == eVar.f299021c && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f299022g, eVar.f299022g) && Intrinsics.f(this.f299023h, eVar.f299023h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f299024j, eVar.f299024j);
    }

    public final int hashCode() {
        int iHashCode = (this.f299021c.hashCode() + p.a.c(this.f299019a.hashCode() * 31, 31, this.f299020b)) * 31;
        gt3.f fVar = this.d;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k kVar = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31;
        dx4.j1 j1Var = this.f299022g;
        int iHashCode4 = (iHashCode3 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        String str = this.f299023h;
        int iD = p.a.d((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        String str2 = this.f299024j;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
