package wi6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f297820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f297821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f297822c;
    public final NavBarMenuItem d;

    public /* synthetic */ o(List list) {
        this(list, null, false, null);
    }

    @Override // cli.p
    public final List c() {
        return this.f297820a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f297820a, oVar.f297820a) && Intrinsics.f(this.f297821b, oVar.f297821b) && this.f297822c == oVar.f297822c && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f297820a.hashCode() * 31;
        Clause clause = this.f297821b;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f297822c);
        NavBarMenuItem navBarMenuItem = this.d;
        return iC + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0);
    }

    public o(List items, Clause clause, boolean z, TextNavBarMenuItem textNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f297820a = items;
        this.f297821b = clause;
        this.f297822c = z;
        this.d = textNavBarMenuItem;
    }
}
