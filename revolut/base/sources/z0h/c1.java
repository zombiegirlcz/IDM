package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f318490c;

    public c1(Links links, hel.b context, boolean z) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318488a = links;
        this.f318489b = context;
        this.f318490c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f318488a, c1Var.f318488a) && this.f318489b == c1Var.f318489b && this.f318490c == c1Var.f318490c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318490c) + ((this.f318489b.hashCode() + (this.f318488a.hashCode() * 31)) * 31);
    }
}
