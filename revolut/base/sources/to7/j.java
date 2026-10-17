package to7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f272536a;

    public j(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f272536a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f272536a, ((j) obj2).f272536a);
    }

    public final int hashCode() {
        return this.f272536a.f297794a.hashCode();
    }
}
