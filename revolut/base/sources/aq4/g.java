package aq4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f8251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8252c;
    public final TextNavBarMenuItem d;

    public g(List items, Clause buttonText, boolean z, TextNavBarMenuItem textNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f8250a = items;
        this.f8251b = buttonText;
        this.f8252c = z;
        this.d = textNavBarMenuItem;
    }

    @Override // cli.p
    public final List c() {
        return this.f8250a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f8250a, gVar.f8250a) && Intrinsics.f(this.f8251b, gVar.f8251b) && this.f8252c == gVar.f8252c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(this.f8250a.hashCode() * 31, 31, this.f8251b), 31, this.f8252c);
        TextNavBarMenuItem textNavBarMenuItem = this.d;
        return iC + (textNavBarMenuItem == null ? 0 : textNavBarMenuItem.hashCode());
    }
}
