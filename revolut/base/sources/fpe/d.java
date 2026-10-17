package fpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f137091a;

    public d(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f137091a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f137091a, ((d) obj2).f137091a);
    }

    public final int hashCode() {
        return this.f137091a.f297794a.hashCode();
    }
}
