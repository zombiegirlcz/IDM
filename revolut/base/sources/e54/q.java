package e54;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f122758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f122759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f122760c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public q(Clause navBarTitle, List navBarMenuItems, Clause button, boolean z, boolean z3, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f122758a = navBarTitle;
        this.f122759b = navBarMenuItems;
        this.f122760c = button;
        this.d = z;
        this.e = z3;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f122758a, qVar.f122758a) && Intrinsics.f(this.f122759b, qVar.f122759b) && Intrinsics.f(this.f122760c, qVar.f122760c) && this.d == qVar.d && this.e == qVar.e && Intrinsics.f(this.f, qVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(j6.a.c(p.a.a(p.a.d(this.f122758a.hashCode() * 31, 31, this.f122759b), 31, this.f122760c), 31, this.d), 31, this.e);
    }
}
