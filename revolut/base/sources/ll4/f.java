package ll4;

import ft3.j1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f196518c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f196519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f196520h;
    public final gt3.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f196521j;

    public f(String title, String description, d state, String str, String str2, List tags, c type, j1 productType, gt3.f fVar, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f196516a = title;
        this.f196517b = description;
        this.f196518c = state;
        this.d = str;
        this.e = str2;
        this.f = tags;
        this.f196519g = type;
        this.f196520h = productType;
        this.i = fVar;
        this.f196521j = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f196516a, fVar.f196516a) && Intrinsics.f(this.f196517b, fVar.f196517b) && this.f196518c == fVar.f196518c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f196519g == fVar.f196519g && this.f196520h == fVar.f196520h && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f196521j, fVar.f196521j);
    }

    public final int hashCode() {
        int iHashCode = (this.f196518c.hashCode() + p.a.c(this.f196516a.hashCode() * 31, 31, this.f196517b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (this.f196520h.hashCode() + ((this.f196519g.hashCode() + p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f)) * 31)) * 31;
        gt3.f fVar = this.i;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str3 = this.f196521j;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
