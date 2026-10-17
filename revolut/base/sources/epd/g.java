package epd;

import cli.p;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextNavBarMenuItem f128169c;

    public /* synthetic */ g(List list) {
        this(list, false, null);
    }

    @Override // cli.p
    public final List c() {
        return this.f128167a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f128167a, gVar.f128167a) && this.f128168b == gVar.f128168b && Intrinsics.f(this.f128169c, gVar.f128169c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f128167a.hashCode() * 31, 31, this.f128168b);
        TextNavBarMenuItem textNavBarMenuItem = this.f128169c;
        return iC + (textNavBarMenuItem == null ? 0 : textNavBarMenuItem.hashCode());
    }

    public g(List items, boolean z, TextNavBarMenuItem textNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f128167a = items;
        this.f128168b = z;
        this.f128169c = textNavBarMenuItem;
    }
}
