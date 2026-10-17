package q09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f241190b;

    public k(String deeplink, f0 source) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f241189a = deeplink;
        this.f241190b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f241189a, kVar.f241189a) && this.f241190b == kVar.f241190b;
    }

    public final int hashCode() {
        return this.f241190b.hashCode() + (this.f241189a.hashCode() * 31);
    }
}
