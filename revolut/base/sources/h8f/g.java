package h8f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f150036c;

    public g(String title, String str, f fVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f150034a = title;
        this.f150035b = str;
        this.f150036c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f150034a, gVar.f150034a) && Intrinsics.f(this.f150035b, gVar.f150035b) && Intrinsics.f(this.f150036c, gVar.f150036c);
    }

    public final int hashCode() {
        int iHashCode = this.f150034a.hashCode() * 31;
        String str = this.f150035b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.f150036c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }
}
