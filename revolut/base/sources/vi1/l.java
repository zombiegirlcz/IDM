package vi1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f289507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289508b;

    public l(wi0.b countryCode, String query) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f289507a = countryCode;
        this.f289508b = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f289507a, lVar.f289507a) && Intrinsics.f(this.f289508b, lVar.f289508b);
    }

    public final int hashCode() {
        return this.f289508b.hashCode() + (this.f289507a.f297794a.hashCode() * 31);
    }
}
