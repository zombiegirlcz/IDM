package bn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f17112b;

    public g(String title, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f17111a = title;
        this.f17112b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f17111a, gVar.f17111a) && Intrinsics.f(this.f17112b, gVar.f17112b);
    }

    public final int hashCode() {
        return this.f17112b.f297794a.hashCode() + (this.f17111a.hashCode() * 31);
    }
}
