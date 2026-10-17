package ux;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f283709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f283711c;

    public h(Clause navBarTitle, Clause clause, List navBarMenuItems) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f283709a = navBarTitle;
        this.f283710b = navBarMenuItems;
        this.f283711c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283709a, hVar.f283709a) && Intrinsics.f(this.f283710b, hVar.f283710b) && Intrinsics.f(this.f283711c, hVar.f283711c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f283709a.hashCode() * 31, 31, this.f283710b);
        Clause clause = this.f283711c;
        return iD + (clause == null ? 0 : clause.hashCode());
    }
}
