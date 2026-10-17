package d2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f110878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110879b;

    public h(wi0.b countryCode, String name) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f110878a = countryCode;
        this.f110879b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f110878a, hVar.f110878a) && Intrinsics.f(this.f110879b, hVar.f110879b);
    }

    public final int hashCode() {
        return this.f110879b.hashCode() + (this.f110878a.f297794a.hashCode() * 31);
    }
}
