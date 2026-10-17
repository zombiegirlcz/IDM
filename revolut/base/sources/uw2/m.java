package uw2;

import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f283539b;

    public m(Clause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f283538a = items;
        this.f283539b = navBarTitle;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof m) {
            return new l(!Intrinsics.f(((m) oldState).f283539b, this.f283539b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f283538a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f283538a, mVar.f283538a) && Intrinsics.f(this.f283539b, mVar.f283539b);
    }

    public final int hashCode() {
        return this.f283539b.hashCode() + (this.f283538a.hashCode() * 31);
    }
}
