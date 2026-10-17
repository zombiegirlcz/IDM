package g57;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f140680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f140681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f140682c;

    public o(n navBar, List items, m footer) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f140680a = navBar;
        this.f140681b = items;
        this.f140682c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f140681b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f140680a, oVar.f140680a) && Intrinsics.f(this.f140681b, oVar.f140681b) && Intrinsics.f(this.f140682c, oVar.f140682c);
    }

    public final int hashCode() {
        return this.f140682c.hashCode() + p.a.d(this.f140680a.f140679a.hashCode() * 31, 31, this.f140681b);
    }
}
