package l15;

import kotlin.jvm.internal.Intrinsics;
import l15.f;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f191458a;

    public d(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f191458a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f191458a, ((d) obj2).f191458a);
    }

    public final int hashCode() {
        return this.f191458a.f297794a.hashCode();
    }
}
