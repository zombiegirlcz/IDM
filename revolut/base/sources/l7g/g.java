package l7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f192604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192605b;

    public g(b type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f192604a = type;
        this.f192605b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f192604a == gVar.f192604a && Intrinsics.f(this.f192605b, gVar.f192605b);
    }

    public final int hashCode() {
        return this.f192605b.hashCode() + (this.f192604a.hashCode() * 31);
    }
}
