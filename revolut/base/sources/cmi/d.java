package cmi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zli.b f25271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0.a f25272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wli.q f25273c;

    public d(zli.b deeplink, lg0.a fallbackStrategy, wli.q source) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f25271a = deeplink;
        this.f25272b = fallbackStrategy;
        this.f25273c = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f25271a, dVar.f25271a) && this.f25272b == dVar.f25272b && this.f25273c == dVar.f25273c;
    }

    public final int hashCode() {
        return this.f25273c.hashCode() + ((this.f25272b.hashCode() + (this.f25271a.hashCode() * 31)) * 31);
    }
}
