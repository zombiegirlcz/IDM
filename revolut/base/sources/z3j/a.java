package z3j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f319295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319296b;

    public a(wi0.b newCountry, String prefilledIban) {
        Intrinsics.checkNotNullParameter(newCountry, "newCountry");
        Intrinsics.checkNotNullParameter(prefilledIban, "prefilledIban");
        this.f319295a = newCountry;
        this.f319296b = prefilledIban;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319295a, aVar.f319295a) && Intrinsics.f(this.f319296b, aVar.f319296b);
    }

    public final int hashCode() {
        return this.f319296b.hashCode() + (this.f319295a.f297794a.hashCode() * 31);
    }
}
