package o27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f221527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f221529c;

    public s(r navBar, List items, q footer) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f221527a = navBar;
        this.f221528b = items;
        this.f221529c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f221528b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f221527a, sVar.f221527a) && Intrinsics.f(this.f221528b, sVar.f221528b) && Intrinsics.f(this.f221529c, sVar.f221529c);
    }

    public final int hashCode() {
        return this.f221529c.hashCode() + p.a.d(this.f221527a.hashCode() * 31, 31, this.f221528b);
    }
}
