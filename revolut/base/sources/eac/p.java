package eac;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f124173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124174b;

    public p(TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f124173a = title;
        this.f124174b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f124173a.equals(pVar.f124173a) && Intrinsics.f(this.f124174b, pVar.f124174b);
    }

    public final int hashCode() {
        return this.f124174b.hashCode() + (this.f124173a.hashCode() * 31);
    }
}
