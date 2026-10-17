package r7j;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f252270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f252271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f252272c;

    public i(h toolbar, List items, g nextButton) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f252270a = toolbar;
        this.f252271b = items;
        this.f252272c = nextButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f252271b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f252270a, iVar.f252270a) && Intrinsics.f(this.f252271b, iVar.f252271b) && Intrinsics.f(this.f252272c, iVar.f252272c);
    }

    public final int hashCode() {
        return this.f252272c.f252267a.hashCode() + p.a.d(this.f252270a.hashCode() * 31, 31, this.f252271b);
    }
}
