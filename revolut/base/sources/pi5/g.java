package pi5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f236429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f236430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f236431c;

    public g(int i, int i2) {
        this(i, i2, f0.f322471a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f236429a == gVar.f236429a && this.f236430b == gVar.f236430b && Intrinsics.f(this.f236431c, gVar.f236431c);
    }

    public final int hashCode() {
        return this.f236431c.hashCode() + j6.a.b(this.f236430b, Integer.hashCode(this.f236429a) * 31, 31);
    }

    public g(int i, int i2, List links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f236429a = i;
        this.f236430b = i2;
        this.f236431c = links;
    }
}
