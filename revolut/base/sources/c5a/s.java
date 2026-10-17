package c5a;

import aw0.k9;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f21526c;
    public final k9 d;
    public final boolean e;
    public final NavBarMessage f;

    public s(r title, List menuItems, TextLocalisedClause searchButtonText, k9 searchFieldExtraButtons, boolean z, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchButtonText, "searchButtonText");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        this.f21524a = title;
        this.f21525b = menuItems;
        this.f21526c = searchButtonText;
        this.d = searchFieldExtraButtons;
        this.e = z;
        this.f = navBarMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f21524a.equals(sVar.f21524a) && Intrinsics.f(this.f21525b, sVar.f21525b) && this.f21526c.equals(sVar.f21526c) && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + t61.a.a(p.a.d(this.f21524a.hashCode() * 31, 31, this.f21525b), 31, this.f21526c)) * 31, 31, this.e);
        NavBarMessage navBarMessage = this.f;
        return iC + (navBarMessage == null ? 0 : navBarMessage.hashCode());
    }
}
