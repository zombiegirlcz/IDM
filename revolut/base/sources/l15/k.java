package l15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f191468c;
    public final boolean d;
    public final String e;
    public final j f;

    public k(String title, String infoTitle, String infoDescription, boolean z, String str, j jVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoTitle, "infoTitle");
        Intrinsics.checkNotNullParameter(infoDescription, "infoDescription");
        this.f191466a = title;
        this.f191467b = infoTitle;
        this.f191468c = infoDescription;
        this.d = z;
        this.e = str;
        this.f = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f191466a, kVar.f191466a) && Intrinsics.f(this.f191467b, kVar.f191467b) && Intrinsics.f(this.f191468c, kVar.f191468c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(this.f191466a.hashCode() * 31, 31, this.f191467b), 31, this.f191468c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }
}
