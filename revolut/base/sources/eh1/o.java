package eh1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f125699b;

    public o(Clause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f125698a = items;
        this.f125699b = navBarTitle;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof o) {
            return new n(!Intrinsics.f(((o) oldState).f125699b, this.f125699b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f125698a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f125698a, oVar.f125698a) && Intrinsics.f(this.f125699b, oVar.f125699b);
    }

    public final int hashCode() {
        return this.f125699b.hashCode() + (this.f125698a.hashCode() * 31);
    }
}
