package ur;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f282223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282224b;

    public g(i documentType, String documentCountry) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentCountry, "documentCountry");
        this.f282223a = documentType;
        this.f282224b = documentCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f282223a == gVar.f282223a && Intrinsics.f(this.f282224b, gVar.f282224b);
    }

    public final int hashCode() {
        return this.f282224b.hashCode() + (this.f282223a.hashCode() * 31);
    }
}
