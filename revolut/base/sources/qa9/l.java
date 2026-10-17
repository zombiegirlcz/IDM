package qa9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f243991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f243992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t89.a f243993c;

    public l(wi0.b countryOfResidence, boolean z, t89.a countryTerms) {
        Intrinsics.checkNotNullParameter(countryOfResidence, "countryOfResidence");
        Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
        this.f243991a = countryOfResidence;
        this.f243992b = z;
        this.f243993c = countryTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f243991a, lVar.f243991a) && this.f243992b == lVar.f243992b && this.f243993c == lVar.f243993c;
    }

    public final int hashCode() {
        return this.f243993c.hashCode() + j6.a.c(this.f243991a.f297794a.hashCode() * 31, 31, this.f243992b);
    }
}
