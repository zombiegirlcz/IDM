package a64;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f1538a;

    public f(wi0.b chosenCountryCode) {
        Intrinsics.checkNotNullParameter(chosenCountryCode, "chosenCountryCode");
        this.f1538a = chosenCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f1538a, ((f) obj2).f1538a);
    }

    public final int hashCode() {
        return this.f1538a.f297794a.hashCode();
    }
}
