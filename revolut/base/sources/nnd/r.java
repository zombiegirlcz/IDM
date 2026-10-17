package nnd;

import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarMenuItem f217583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f217584c;

    public r(List items, TextNavBarMenuItem textNavBarMenuItem, q buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f217582a = items;
        this.f217583b = textNavBarMenuItem;
        this.f217584c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f217582a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f217582a, rVar.f217582a) && Intrinsics.f(this.f217583b, rVar.f217583b) && Intrinsics.f(this.f217584c, rVar.f217584c);
    }

    public final int hashCode() {
        int iHashCode = this.f217582a.hashCode() * 31;
        NavBarMenuItem navBarMenuItem = this.f217583b;
        return this.f217584c.hashCode() + ((iHashCode + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode())) * 31);
    }

    public /* synthetic */ r(List list) {
        this(list, null, p.f217577a);
    }
}
